package org.miliconvert.otg;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.miliconvert.otg.model.MTFConstants;
import org.miliconvert.otg.model.MTFField;
import org.miliconvert.otg.model.MTFFormatDefinition;
import org.miliconvert.otg.model.MTFSet;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * 
 * @author matthieu
 *
 */
public class MTFSerialiser extends DefaultHandler {

	private static Log logger = LogFactory.getLog(MTFSerialiser.class);
	
	private MTFFormatDefinition mtfFormatDefinition;
	private List<MTFSet> sets = new LinkedList<MTFSet>();
	private MTFSet currentSet = null;
	private StringBuffer bufferedLine  = new StringBuffer();
	private boolean isField;
	

	public MTFSerialiser(MTFFormatDefinition format) {
		this.mtfFormatDefinition = format;
	}
	
	@Override
	public void startElement(String uri, String localName, String name,
			Attributes attributes) throws SAXException {
			if(!name.startsWith("segment_")){
				if(attributes.getValue("setId")!=null){
					createSet(attributes.getValue("setId"));
				} else if(attributes.getValue("ff-seq")!=null){
					createField(Integer.parseInt(attributes.getValue("ff-seq")));
				}
			}
			
	}
	
	
	private void createField(int parseInt) {
		//Adding empty field
	    while(currentSet.getFields().size()<parseInt-1){
	    	currentSet.addField(new MTFField(""));
	    }
		 bufferedLine = new StringBuffer();
		 isField = true;
	}

	private void createSet(String id) {
		//If we start a new set we are closing the existing one
		if(currentSet!=null){
			sets.add(currentSet);
		}
		currentSet = new MTFSet(id);
		isField = false;
		
	}

	@Override
	public void endDocument() throws SAXException {
		if(currentSet!=null){
			sets.add(currentSet);
		}
		
	}
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		bufferedLine.append(new String(ch, start, length));
	}
	
	
	@Override
	public void endElement(String uri, String localName, String name)
			throws SAXException {
		if(!name.startsWith("segment_") && isField){
			currentSet.addField(new MTFField(bufferedLine.toString()));
			isField = false;
		}
		
	}
	
	
	

	public InputStream getOTGStream() {
		
		StringBuffer ret = new StringBuffer();
		
		for(MTFSet set: sets){
			ret.append(split(set)).append("\n");
		}
		logger.debug("DUMP:\n"+ret);
		return new ByteArrayInputStream(ret.toString().getBytes());
	}


	private String split(MTFSet set) {
		StringBuffer ret = new StringBuffer();
		StringBuffer buffer = new StringBuffer();
		buffer.append(set.getId());
		if(!mtfFormatDefinition.isFreeText(set)){
			for(MTFField field : set.getFields()){
				String value = formatField(field.getValue());
				if((buffer.length()+value.length())<69){
					buffer.append(MTFConstants.FIELD_SEPARATOR);
					buffer.append(value);
				} else {
				
						ret.append(buffer);
						ret.append("\n");
						buffer = new StringBuffer();
						buffer.append(MTFConstants.FIELD_SEPARATOR);
						while(ret.charAt(ret.length()-2)==MTFConstants.FIELD_SEPARATOR){
							ret.deleteCharAt(ret.length()-2);
							buffer.append(MTFConstants.FIELD_SEPARATOR);
						}
						buffer.append(value);
					}
				
			}
			ret.append(buffer);
			//remove empty field at end
			while(ret.charAt(ret.length()-1)==MTFConstants.FIELD_SEPARATOR){
				ret.deleteCharAt(ret.length()-1);
			}
		} else {
			for(MTFField field : set.getFields()){
				String value = formatField(field.getValue());
				buffer.append(MTFConstants.FIELD_SEPARATOR);
				for (int i = 0; i < value.length(); i++) {
					if(buffer.length()<70 && value.charAt(i)!='\n'){
						buffer.append(value.charAt(i));
					} else {
						ret.append(buffer);
						ret.append("\n");
						buffer = new StringBuffer();
						if(value.charAt(i)!='\n'){
							buffer.append(value.charAt(i));
						}
					}
				}
				ret.append(buffer);

			}
			
		}
		return ret.toString();
	}

	
	private String formatField(String value) {
		return value;
	}
	
	

}
