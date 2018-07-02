package org.miliconvert.otg.model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * @author matthieu
 *
 */
public class MTFFormatDefinition {

	private String formatName;
	private static Log logger = LogFactory.getLog(MTFFormatDefinition.class);
	
	
	List<AbstractMTFElementDefinition> elementsDefinition = new LinkedList<AbstractMTFElementDefinition>();

	//Contains all available setDefinition
	private HashMap<String, MTFSetDefinition> mtfSetsFormater = new LinkedHashMap<String, MTFSetDefinition>();
	
	
	public MTFFormatDefinition(String formatName) {
		super();
		this.formatName = formatName;
	}

	public List<AbstractMTFElementDefinition> getElementsDefinition() {
		return elementsDefinition;
	}

	public void addElementDefinition(AbstractMTFElementDefinition elDefinition) {
		elementsDefinition.add(elDefinition);
		
	}

	public String getFormatName() {
		return formatName;
	}

	public void setFormatName(String formatName) {
		this.formatName = formatName;
	}

	
	public MTFSetDefinition getMTFSetFormater(MTFSet set) {
		return mtfSetsFormater.get(set.getId().trim());
	}

	public MTFSegmentDefinition getSegmentDefinition(MTFSegment currentSegment) {
	   return findSegmentDefinition(elementsDefinition,currentSegment);
	}

	private MTFSegmentDefinition findSegmentDefinition(
			List<AbstractMTFElementDefinition> defs,
			MTFSegment currentSegment) {
		for(AbstractMTFElementDefinition el : defs){
			if(el instanceof MTFSegmentDefinition ){
				MTFSegmentDefinition sDef = (MTFSegmentDefinition)el;
				logger.debug("Check "+sDef.getName()+" match with "+currentSegment.getName());
				if(sDef.getName().equals(currentSegment.getName())){
					return sDef;
				} else {
					 MTFSegmentDefinition ret = findSegmentDefinition(sDef.getElementsDefinition(), currentSegment);
					 if(ret!=null){
						 return ret;
					 }
				}
			}
		}
		return null;
		
	}

	public boolean shouldStartSegment(MTFSet set) {
		for(AbstractMTFElementDefinition el : elementsDefinition){
			if(el!=null && el instanceof MTFSegmentDefinition){
				MTFSegmentDefinition segDef = (MTFSegmentDefinition)el;
				if(segDef.getStartSetDefinition().getId().equals(set.getId().trim())){
					return true;
				}
			}
		}
		return false;
	}
	
	public void registerSet(MTFSetDefinition setDef){
		if(!mtfSetsFormater.containsKey(setDef.getId().trim())){
			mtfSetsFormater.put(setDef.getId().trim(), setDef);
		}
	}
	
	
	public MTFSetDefinition getSetDefinition(MTFSetDefinition setDef) {
		return mtfSetsFormater.get(setDef.getId());
	}
	
	
	public boolean isFreeText(MTFSet set) {
		for(String def : MTFConstants.FREE_TEXT_SETS){
			if(def.equals(set.getId())){
				return true;
			}
		}
		return false;
	}

	public String dump()
	{
	    StringBuilder retValue = new StringBuilder();
	    
	    retValue.append("\n").append(this.formatName).append("\n");
		    
			    for (AbstractMTFElementDefinition el : elementsDefinition) {
			    	retValue.append("--").append(el.dump()).append("\n");
				}
	    
	    return retValue.toString();
	}

	/**
	 * Constructs a <code>String</code> with all attributes
	 * in name = value format.
	 *
	 * @return a <code>String</code> representation 
	 * of this object.
	 */
	public String toString()
	{
	    final String TAB = "    ";
	
	    StringBuilder retValue = new StringBuilder();
	    
	    retValue.append("MTFFormatDefinition ( ")
	        .append("formatName = ").append(this.formatName).append(TAB)
	        .append("elementsDefinition = ").append(this.elementsDefinition).append(TAB)
	        .append("mtfSetsFormater = ").append(this.mtfSetsFormater).append(TAB)
	        .append(" )");
	    
	    return retValue.toString();
	}

	public String getXmlNS() {
		return getFormatName();
	}





	
	
	
}
