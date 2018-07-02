package org.miliconvert.otg.model;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author matthieu
 *
 */
public class MTFSegment  extends AbstractMTFElement{
    List<AbstractMTFElement> elements = new LinkedList<AbstractMTFElement>();

	
	private MTFSet startSet;
	private int level = 0;
	private int order = 0;
	



	public MTFSet getStartSet() {
		return startSet;
	}


	public void setStartSet(MTFSet startSet) {
		this.startSet = startSet;
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

	public String getName() {
		return startSet.getId()+"-"+level+"-"+order;
	}
    
       
	public List<AbstractMTFElement> getElements() {
		return elements;
	}

	public void setElements(List<AbstractMTFElement> elements) {
		this.elements = elements;
	}
	
	
	public void addElement(AbstractMTFElement el) {
		elements.add(el);
		
	}
	
	public boolean contains(MTFSet set) {
		return elements.contains(set);
	}
	
	


	public String dump()
	{
	    StringBuilder retValue = new StringBuilder();
    	retValue.append(getName());
    	
			    for (AbstractMTFElement el : elements) {
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
		result = prime * result
				+ ((startSet == null) ? 0 : startSet.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		MTFSegment other = (MTFSegment) obj;
		if (level != other.level)
			return false;
		if (order != other.order)
			return false;
		if (startSet == null) {
			if (other.startSet != null)
				return false;
		} else if (!startSet.equals(other.startSet))
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
	    
	    retValue.append("MTFSegment ( ")
	        .append("elements = ").append(this.elements).append(TAB)
	        .append("startSet = ").append(this.startSet).append(TAB)
	        .append("level = ").append(this.level).append(TAB)
	        .append("order = ").append(this.order).append(TAB)
	        .append(" )");
	    
	    return retValue.toString();
	}



	
    
    
    
}
