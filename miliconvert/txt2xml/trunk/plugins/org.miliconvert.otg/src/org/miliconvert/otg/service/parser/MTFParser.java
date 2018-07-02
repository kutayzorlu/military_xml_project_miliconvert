package org.miliconvert.otg.service.parser;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.miliconvert.otg.model.MTF;
import org.miliconvert.otg.model.MTFConstants;
import org.miliconvert.otg.model.MTFFormatDefinition;
import org.miliconvert.otg.model.MTFFormatException;
import org.miliconvert.otg.model.MTFSet;
import org.miliconvert.otg.model.MTFSetDefinition;
import org.miliconvert.otg.service.parser.impl.MTFContentHandlerImpl;
import org.omg.CORBA.FREE_MEM;

/**
 * Parses OS-OTG text messages, using a SAX-like event based interface
 * 
 * @author matthieu
 * 
 */
public class MTFParser {

	private static Log logger = LogFactory.getLog(MTFParser.class);
	
	private MTFContentHandler mtfContentHandler;
	
	private MTFFormatDefinition mtfFormatDefinition;
	
	private StringBuffer currentSetLine;
	
	boolean freeText;
	boolean isFirst;

	public MTFParser(MTFFormatDefinition mtfFormatDefinition) {
		
		this.mtfContentHandler = new MTFContentHandlerImpl(mtfFormatDefinition);
		this.mtfFormatDefinition = mtfFormatDefinition;
	}

	public MTF parse(InputStream in)  {
		return parseImpl(new BufferedReader(new InputStreamReader(in)));
	}

	private MTF parseImpl(BufferedReader reader) {
		try {
			String line = null;
			currentSetLine = null;
			isFirst = true;
			mtfContentHandler.start();
			while ((line = reader.readLine()) != null) {
				
				if(currentSetLine!=null && continuing(line)){
					if(freeText){
						currentSetLine.append("\n"+line);
					} else {
					
						currentSetLine.append(line);
					}
				} else {
					 if(currentSetLine!=null){
							parseMTFSet();	
					}
					if(line.startsWith(MTFConstants.END_MTF)){
						currentSetLine  = new StringBuffer();
						isFirst = true;
						currentSetLine.append(line);
						parseMTFSet();	
						mtfContentHandler.end();
						break;
					} 
					currentSetLine  = new StringBuffer();
					isFirst = true;
					currentSetLine.append(line);
				}
					
			}
			return mtfContentHandler.getMtfDocument();
		} catch (Exception e) {
			logger.error("Error parsing file",e);
		}
		return null;
	}

	private boolean continuing(String line) {
		
		 freeText = false;
		MTFSet set = new MTFSet(parseSetIdentifier(currentSetLine));
			if(mtfFormatDefinition.isFreeText(set)){
				  logger.debug("Found free text SET");
				  freeText = true;
			}
		return line.startsWith(""+MTFConstants.FIELD_SEPARATOR) || (freeText && ! endFreeText(line));
	}

	private boolean endFreeText(String line) {
		MTFSet set = new MTFSet(parseSetIdentifier(new StringBuffer(line)));	  
		MTFSetDefinition definition =	mtfFormatDefinition.getMTFSetFormater(set);
		if(definition!=null){
			 return true;
		}
		return false;
	}

	private void parseMTFSet() throws MTFParserException, MTFFormatException {	
	      MTFSet set = new MTFSet(parseSetIdentifier(currentSetLine));
		  MTFSetDefinition definition =	mtfFormatDefinition.getMTFSetFormater(set);
		  if(definition!=null){
			  mtfContentHandler.addSet(definition.format(parseFields(currentSetLine,mtfFormatDefinition.isFreeText(set))));
		  } else {
			  throw new MTFParserException("Cannot found definition rejecting SET");
		  }

	}

	private String parseSetIdentifier(StringBuffer buffer) {
		StringBuffer cur = new StringBuffer();
		for (int i = 0; i < buffer.length(); i++) {
			if (buffer.charAt(i) == MTFConstants.FIELD_SEPARATOR) {
			   return cur.toString();
			} else {
				cur.append(buffer.charAt(i));
			}
		}
		return cur.toString();
	}

	private String[] parseFields(StringBuffer buffer,boolean freeText) {
		int counter = 0;
		ArrayList<String> al = new ArrayList<String>(25);
		StringBuffer cur = new StringBuffer();
		for (int i = 0; i < buffer.length(); i++) {
			if (buffer.charAt(i) == MTFConstants.FIELD_SEPARATOR && (!freeText || counter==0)) {
				al.add(cur.toString());
				cur = new StringBuffer();
				counter++;
			} else {
				cur.append(buffer.charAt(i));
			}
		}
		al.add(cur.toString());


		String[] ret = al.toArray(new String[al.size()]);
		return ret;
	}

}
