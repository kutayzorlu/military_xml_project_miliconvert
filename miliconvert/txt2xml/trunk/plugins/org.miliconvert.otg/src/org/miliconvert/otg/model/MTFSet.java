package org.miliconvert.otg.model;

import java.util.LinkedList;
import java.util.List;

/**
 * MTF Set object representation
 * 
 * @author matthieu
 *
 */
public class MTFSet  extends AbstractMTFElement {

		
	private String id;
	
		
	private List<MTFField> fields;
	
	public MTFSet(String identifier) {
		this.id = identifier;
		fields = new LinkedList<MTFField>();
	}
	
	
	public void addField(MTFField field) {
		fields.add(field);
		
	}

	
	public List<MTFField> getFields() {
		return fields;
	}

	public String getId() {
		return id;
	}
	
	

	
	public String dump()
	{
	
	    
	    return id;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		MTFSet other = (MTFSet) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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
	    
	    retValue.append("MTFSet ( ")
	        .append("id = ").append(this.id).append(TAB)
	        .append("fields = ").append(this.fields).append(TAB)
	        .append(" )");
	    
	    return retValue.toString();
	}

	


	
	
	
	
}
