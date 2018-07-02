package org.miliconvert.otg.service.initialiser.impl;

import java.util.Stack;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.miliconvert.otg.model.MTFFormatDefinition;
import org.miliconvert.otg.model.MTFSegmentDefinition;
import org.miliconvert.otg.model.MTFSetDefinition;
import org.miliconvert.otg.service.initialiser.MTFFormatContentHandler;


/**
 * 
 * @author matthieu
 *
 */
public class MTFFormatContentHandlerImpl implements MTFFormatContentHandler {

	private static Log logger = LogFactory.getLog(MTFFormatContentHandlerImpl.class);
	
	MTFFormatDefinition mtfFormatDefinition;
	
	MTFSegmentDefinition currentSegment = null;
	
	Stack<MTFSegmentDefinition> stack = new Stack<MTFSegmentDefinition>();
	
	
	public void addSet(MTFSetDefinition setDefinition) {
		logger.debug("Adding set definition :"+setDefinition.toString());
		if(currentSegment==null){
			mtfFormatDefinition.addElementDefinition(setDefinition);
		} else {
			currentSegment.addElementDefinition(setDefinition);
		}
		mtfFormatDefinition.registerSet(setDefinition);
	}

	public void closeCurrentSegment() {
		if(currentSegment !=null){
			logger.debug("Adding set current segment :"+currentSegment.toString());
			if(stack.isEmpty()  ){
				mtfFormatDefinition.addElementDefinition(currentSegment);
				currentSegment = null;
			} else {
				MTFSegmentDefinition swap = stack.pop();
				swap.addElementDefinition(currentSegment);
				currentSegment = swap;
			}
		}
		
	}

	public void end() {
		logger.info("MTFDefinition "+mtfFormatDefinition.getFormatName()+"loading complete");
		if(logger.isDebugEnabled()){
			logger.debug("DUMP:" +mtfFormatDefinition.dump());
		}
		
	}

	public void start(String formatName) {
		mtfFormatDefinition = new MTFFormatDefinition(formatName);
		
	}

	public void startSegment(MTFSegmentDefinition segmentDefinition) {
		if(currentSegment!=null){
			stack.push(currentSegment);
		}
		currentSegment = segmentDefinition;
		mtfFormatDefinition.registerSet(segmentDefinition.getStartSetDefinition());
		
	}

	public MTFFormatDefinition getMTFFormatDefinition() {
		return mtfFormatDefinition;
	}

}
