package org.miliconvert.otg.service.initialiser.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.miliconvert.otg.MTFFormatRegister;
import org.miliconvert.otg.model.MTFFieldDefinition;
import org.miliconvert.otg.model.MTFFormatDefinition;
import org.miliconvert.otg.model.MTFSegmentDefinition;
import org.miliconvert.otg.model.MTFSetDefinition;
import org.miliconvert.otg.service.csv.CSVReader;
import org.miliconvert.otg.service.initialiser.MTFFormatContentHandler;
import org.miliconvert.otg.service.initialiser.MTFFormatInitialiser;

/**
 * 
 * @author matthieu
 *
 */
public class MTFFormatInitialiserImpl implements MTFFormatInitialiser{


	private static Log logger = LogFactory.getLog(MTFFormatInitialiserImpl.class);
	
	private Map<String,MTFFormatDefinition> formats = new HashMap<String, MTFFormatDefinition>();
	private Map<String,Integer> orders = new HashMap<String, Integer>();
	private Map<String,MTFSetDefinition> sets = new HashMap<String, MTFSetDefinition>();
	private int setSequence = 0;
	
	public void initialize() {
		
		//We start by registered all set with fields  definition
		
		CSVReader reader = new CSVReader(new BufferedReader(new InputStreamReader(loadDefFile("setsdefinition"))));
		try {
			String[] line = null;
			while ((line = reader.readNext()) != null) {
				logger.debug("registering "+line[0]);
				sets.put(line[0], parseFieldDefinition(line));
			}
		} catch (IOException e) {
			logger.error(e,e);
		} finally {
			try {
			reader.close();
			} catch (Exception e) {}
		}
		
		
		
		
		
		
		
		for(String format : MTFFormatRegister.getRegisteredFormats()){
			reader = new CSVReader(new BufferedReader(new InputStreamReader(loadDefFile(format+".mtf"))));
			try {
				String[] line = reader.readNext(); // we skip first line
				int level = 0;
				MTFFormatContentHandler mtfFormatContentHandler = new MTFFormatContentHandlerImpl();
				mtfFormatContentHandler.start(format);
				
				while ((line = reader.readNext()) != null) {
					int currentLevel = countLevel(line[0]);
					
					if(currentLevel >level){
						level = currentLevel;
						logger.debug("Inc level:"+currentLevel);
						mtfFormatContentHandler.startSegment(getSegmentDefinition(line,level,format));
					} else if (currentLevel == level) {
						setSequence++;
						mtfFormatContentHandler.addSet(getSetDefinition(line));
					} else {
						level = currentLevel;
						logger.debug("Dec level:"+currentLevel);
						mtfFormatContentHandler.closeCurrentSegment();
					}
				}
				mtfFormatContentHandler.end();
				formats.put(format, mtfFormatContentHandler.getMTFFormatDefinition());
			} catch (IOException e) {
				logger.error(e,e);
			} finally {
				try {
					reader.close();
					} catch (Exception e) {}
				}
				
			
		}
		

		
		
		
	}
	
	private MTFSetDefinition parseFieldDefinition(String[] line) {
		MTFSetDefinition mtfSetDefinition = new MTFSetDefinition(clean(line[0]));
		for (int i = 1; i < line.length-1; i=i+2) {
			if(line[i].length()>0){
				mtfSetDefinition
					.addFieldDefinition(new MTFFieldDefinition(line[i],line[i+1]));
			}
		}
		return mtfSetDefinition;
	}

	private MTFSetDefinition getSetDefinition(String[] line) {
		MTFSetDefinition mtfSetDefinition = sets.get(clean(line[3]));
		mtfSetDefinition.setMandatory(parseMandatory(line[2]));
		mtfSetDefinition.setRepeteable(parseRepeteable(line[1]));
		mtfSetDefinition.setFieldOrder(clean(line[4]));
		mtfSetDefinition.setFormatName(clean(line[5]));
		mtfSetDefinition.setSetSequence(setSequence);
		return mtfSetDefinition;
	}

	private boolean parseRepeteable(String value) {
		return value!=null && value.contains("*");
	}

	private boolean parseMandatory(String value) {
		return value!=null && value.contains("M");
	}

	private String clean(String value) {
		return value!=null ? value.trim() : value ;
	}

	private MTFSegmentDefinition getSegmentDefinition(String[] line, int level,String format) {
		MTFSegmentDefinition segmentDefinition =  new MTFSegmentDefinition();
		MTFSetDefinition setDefinition = getSetDefinition(line);
		setDefinition.setRepeteable(true);
		segmentDefinition.setStartSetDefinition(setDefinition);
		segmentDefinition.setLevel(level);
		segmentDefinition.setOrder(getOrder(setDefinition,format));
		return segmentDefinition;
	}

	private int getOrder(MTFSetDefinition setDefinition,String format) {
		Integer i = 0;
		if(orders.containsKey(setDefinition.getId()+"-"+format)){
			i = orders.get(setDefinition.getId()+"-"+format);
		}
		i++;
		orders.put(setDefinition.getId()+"-"+format,i);
		return i;
	}

	private int countLevel(String field) {
		int counter = 0;
		for (int i = 0; i < field.length(); i++) {
			if(field.charAt(i)=='['){
				counter++;
			}
			
		}
		return counter;
	}

	public MTFFormatDefinition getFormat(String mtfType) {
		return formats.get(mtfType);
	}

	private InputStream loadDefFile(String format) {
		logger.debug("Loading : mappings/"+format+".mtf.csv");
		return MTFFormatInitialiserImpl.class.getClassLoader().getResourceAsStream(
				""+format+".csv");
	}

	public static MTFFormatInitialiser getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
