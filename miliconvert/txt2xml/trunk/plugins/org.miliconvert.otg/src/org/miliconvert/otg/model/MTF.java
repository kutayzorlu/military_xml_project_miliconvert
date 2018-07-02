package org.miliconvert.otg.model;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author matthieu
 *
 */
public class MTF {

	    List<AbstractMTFElement> elements = new LinkedList<AbstractMTFElement>();

	    
		public List<AbstractMTFElement> getElements() {
			return elements;
		}

		public void setElements(List<AbstractMTFElement> elements) {
			this.elements = elements;
		}

		public void addSet(MTFSet set) {
			this.elements.add(set);
			
		}

		public void addSegment(MTFSegment segment) {
			this.elements.add(segment);
			
		}
		
		
		public String dump()
		{
		    StringBuilder retValue = new StringBuilder();
		    
		    retValue.append("\n").append("MTF (").append("\n");
			    
				    for (AbstractMTFElement el : elements) {
				    	retValue.append("--").append(el.dump()).append("\n");
					}
		    
		    return retValue.append("\n)").toString();
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
		    StringBuilder retValue = new StringBuilder();
		    
		    retValue.append("MTF ( ").append("\n");
		    	for(AbstractMTFElement el: elements){
		    		retValue.append(el).append("\n");
		    	}
		    	retValue.append(" )");
		    
		    return retValue.toString();
		}

		
		
		
}
