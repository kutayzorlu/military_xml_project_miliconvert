package org.miliconvert.otg.model;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author matthieu
 *
 */
public class MTFSegmentDefinition  extends AbstractMTFElementDefinition{

	
	private MTFSetDefinition startSetDefinition;
	private int level = 0;
	private int order = 0;
	
	private List<AbstractMTFElementDefinition> elementsDefinition = new LinkedList<AbstractMTFElementDefinition>();
	

	public MTFSetDefinition getStartSetDefinition() {
		return startSetDefinition;
	}


	public void setStartSetDefinition(MTFSetDefinition startSetDefinition) {
		this.startSetDefinition = startSetDefinition;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public int getOrder() {
		return order;
	}


	public void setOrder(int order) {
		this.order = order;
	}


	public void setElementsDefinition(
			List<AbstractMTFElementDefinition> elementsDefinition) {
		this.elementsDefinition = elementsDefinition;
	}


	public List<AbstractMTFElementDefinition> getElementsDefinition() {
		return elementsDefinition;
	}

	
	public void addElementDefinition(AbstractMTFElementDefinition elDefinition) {
		elementsDefinition.add(elDefinition);
		
	}

	
	public String getName() {
		return startSetDefinition.getId()+"-"+level+"-"+order;
	}
	
	public MTFSetDefinition getSetDefinition(MTFSet set) {
		for(AbstractMTFElementDefinition el : elementsDefinition){
			if(el!=null && el instanceof MTFSetDefinition  && ((MTFSetDefinition)el).getId().equals(set.getId())){
				return (MTFSetDefinition)el;
			}
		}
		return null;
	}


	public boolean shouldStartSegment(MTFSet set) {
		for(AbstractMTFElementDefinition el : elementsDefinition){
			if(el!=null && el instanceof MTFSegmentDefinition  &&((MTFSegmentDefinition)el).getStartSetDefinition().getId().equals(set.getId())){
				return true;
			}
		}
		return false;
	}


	
	

	public String dump()
	{
	    StringBuilder retValue = new StringBuilder();
    	retValue.append(getName());
    	
			    for (AbstractMTFElementDefinition el : elementsDefinition) {
			    	retValue.append("\n");
			    	for (int i = 0; i <level+1; i++) {
						retValue.append("---");
					}
			    	retValue.append(">").append(el.dump());
				}
	    
	    return retValue.toString();
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + level;
		result = prime * result + order;
		result = prime
				* result
				+ ((startSetDefinition == null) ? 0 : startSetDefinition
						.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		MTFSegmentDefinition other = (MTFSegmentDefinition) obj;
		if (level != other.level)
			return false;
		if (order != other.order)
			return false;
		if (startSetDefinition == null) {
			if (other.startSetDefinition != null)
				return false;
		} else if (!startSetDefinition.equals(other.startSetDefinition))
			return false;
		return true;
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
	    
	    retValue.append("MTFSegmentDefinition ( ")
	        .append("startSetDefinition = ").append(this.startSetDefinition).append(TAB)
	        .append("level = ").append(this.level).append(TAB)
	        .append("order = ").append(this.order).append(TAB)
	        .append("elementsDefinition = ").append(this.elementsDefinition).append(TAB)
	        .append(" )");
	    
	    return retValue.toString();
	}


	




	
	
}
