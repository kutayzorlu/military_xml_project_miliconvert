package org.miliconvert.otg.service.parser.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.miliconvert.otg.model.MTF;
import org.miliconvert.otg.model.MTFFormatDefinition;
import org.miliconvert.otg.model.MTFSegment;
import org.miliconvert.otg.model.MTFSegmentDefinition;
import org.miliconvert.otg.model.MTFSet;
import org.miliconvert.otg.model.MTFSetDefinition;
import org.miliconvert.otg.service.parser.MTFContentHandler;
import org.miliconvert.otg.service.parser.MTFParserException;

/**
 * 
 * @author matthieu
 *
 */
public class MTFContentHandlerImpl implements MTFContentHandler {

	private static Log logger = LogFactory.getLog(MTFContentHandlerImpl.class);
	
	private MTFSegment currentSegment;
	private MTF mtfDocument;
	private MTFFormatDefinition mtfFormatDefinition;

	private Stack<MTFSegment> stack = new Stack<MTFSegment>();
	private Map<String,Integer> orders = new HashMap<String, Integer>();
	
	
	
	public MTFContentHandlerImpl(MTFFormatDefinition mtfFormatDefinition) {
		this.mtfFormatDefinition = mtfFormatDefinition;
	}

	
	
	
	public void addSet(MTFSet set) throws MTFParserException {
		
		
		while(!shouldStartSegment(set) && shouldStopSegment(set) ){
			closeCurrentSegment();	
		} 
		
		if(shouldStartSegment(set)){
			MTFSegment segment = new MTFSegment();
			segment.setStartSet(set);
			segment.setLevel(getLevel());
			segment.setOrder(getOrder(set));
			startSegment(segment);
			return;
		} 
		
		if(currentSegment!=null){
			logger.debug("Adding set to current segment");
			currentSegment.addElement(set);
		} else {
			logger.debug("Adding set to document");
			mtfDocument.addSet(set);
		}

	}
	

	private int getLevel() {
		int i = stack.size()+1;
		if(currentSegment!=null){
			i++;
		}
		return i;
	}




	private int getOrder(MTFSet set) {
		Integer i = 0;
		String key = set.getId();
		if(orders.containsKey(key)){
			i = orders.get(key);
		}
		//Ensure order count is one by segment
		if(currentSegment!=null){
			logger.debug("looking for "+currentSegment.getName()+"-"+key +" counter ");
			if(!orders.containsKey(currentSegment.getName()+"-"+key)){
				orders.put(currentSegment.getName()+"-"+key, new Integer(0));
				i++;
			} 	
			
		} else {
			logger.debug("looking for root-"+key +" counter ");
			if(!orders.containsKey("root-"+key)){
				orders.put("root-"+key, new Integer(0));
				i++;
			} 	
		}
		orders.put(set.getId(),i);
		return i;
	}
	
	
	private boolean shouldStopSegment(MTFSet set) throws MTFParserException {
		if(currentSegment!=null){
			MTFSegmentDefinition segmentDefinition = mtfFormatDefinition.getSegmentDefinition(currentSegment);
			if(segmentDefinition==null){
				throw new MTFParserException("Cannot find definition for segment "+currentSegment.getName());
			}
			
			MTFSetDefinition setDefinition = segmentDefinition.getSetDefinition(set);
			// Stop segment if:
			// -- SET is not in segment
			// -- SET already present but not repeteable
			return setDefinition==null 
				||( !setDefinition.isRepeteable() && currentSegment.contains(set));
		} else {
			return false;
		}
	}




	private boolean shouldStartSegment(MTFSet set) throws MTFParserException {
		if(currentSegment!=null){
			MTFSegmentDefinition segmentDefinition = mtfFormatDefinition.getSegmentDefinition(currentSegment);
			if(segmentDefinition==null){
				throw new MTFParserException("Cannot find definition for segment "+currentSegment.getName());
			}
			// Start segment if SET start a segment
			return segmentDefinition.shouldStartSegment(set);
		} else {
			return mtfFormatDefinition.shouldStartSegment(set);
		}
	}




	private void startSegment(MTFSegment segment) {
		logger.debug("Starting segment:"+segment.getName());
		if(currentSegment!=null){
			stack.push(currentSegment);
		}
		currentSegment = segment;
		
	}
	

	private void closeCurrentSegment() {
		logger.debug("Closing segment");
		if(currentSegment !=null){
			if(stack.isEmpty()  ){
				mtfDocument.addSegment(currentSegment);
				currentSegment = null;
			} else {
				MTFSegment swap = stack.pop();
				swap.addElement(currentSegment);
				currentSegment = swap;
			}
		}
		
	}

	
	

	public void end() {
		logger.info("MTF document successfully load");
		if(logger.isDebugEnabled()){
			logger.debug("DUMP:" +mtfDocument.dump());
		}
		
		
	}

	public MTF getMtfDocument() {
		return mtfDocument;
	}

	public void start() {
		mtfDocument = new MTF();
		
	}








}
