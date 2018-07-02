package org.miliconvert.otg.model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * MTF Set object definition
 * 
 * @author matthieu
 *
 */
public class MTFSetDefinition  extends AbstractMTFElementDefinition {

		
	private String id;
	private String fieldOrder;
	private String formatName;
	private boolean repeteable ;
	private boolean mandatory;
	private int setSequence;
	private Map<String,Integer> fieldsName = new HashMap<String, Integer>();
	
		
	private List<MTFFieldDefinition> fieldDefinitions = new LinkedList<MTFFieldDefinition>();
	
	public MTFSetDefinition(String identifier) {
		this.id = identifier;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getFieldOrder() {
		return fieldOrder;
	}


	public void setFieldOrder(String fieldOrder) {
		this.fieldOrder = fieldOrder;
	}


	public String getFormatName() {
		return formatName;
	}


	public void setFormatName(String formatName) {
		this.formatName = formatName;
	}


	public boolean isRepeteable() {
		return repeteable;
	}


	public void setRepeteable(boolean repeteable) {
		this.repeteable = repeteable;
	}


	public boolean isMandatory() {
		return mandatory;
	}


	public void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;
	}


	public List<MTFFieldDefinition> getFieldDefinitions() {
		return fieldDefinitions;
	}


	public void setFieldDefinitions(List<MTFFieldDefinition> fieldDefinitions) {
		this.fieldDefinitions = fieldDefinitions;
	}

	
	
	

	public int getSetSequence() {
		return setSequence;
	}


	public void setSetSequence(int setSequence) {
		this.setSequence = setSequence;
	}


	public MTFSet format(String[] fields) throws MTFFormatException {
		MTFSet set = new MTFSet(fields[0]);
		/*if(fields.length<fieldDefinitions.size()){
			throw new MTFFormatException("Missing fields for set "+fields[0]+" [def size: "+fieldDefinitions.size()+", field size:"+ fields.length+"]");
		}*/
		
		for(int i=0; i< fieldDefinitions.size();i++){
			MTFField field = new MTFField("");
			if((i+1)<fields.length){
				field.setValue(fields[i+1]);
			}
			field.setName(fieldDefinitions.get(i).getName());
			set.addField(field);
		}
		
		
		
		//repeteable field at end
		for (int i = fieldDefinitions.size()+1; i < fields.length; i++) {
			MTFField field = new MTFField(fields[i]);
			field.setName(fieldDefinitions.get(fieldDefinitions.size()-1).getName());
			set.addField(field);
		}
		
		
		return set;
	}


	public void addFieldDefinition(MTFFieldDefinition fieldDefinition) {
		String name = fieldDefinition.getName();
		int count = 0;
		if(fieldsName.containsKey(name)){
			count = fieldsName.get(name)+1;
		} 
		fieldsName.put(name, count);
		if(count>0){
			fieldDefinition.setName(name+"_"+count);
		}
		
		fieldDefinitions.add(fieldDefinition);
	}
	
	
	
	public String dump()
	{
	
	    
	    return id;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((fieldDefinitions == null) ? 0 : fieldDefinitions.hashCode());
		result = prime * result
				+ ((fieldOrder == null) ? 0 : fieldOrder.hashCode());
		result = prime * result
				+ ((formatName == null) ? 0 : formatName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (mandatory ? 1231 : 1237);
		result = prime * result + (repeteable ? 1231 : 1237);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		MTFSetDefinition other = (MTFSetDefinition) obj;
		if (fieldDefinitions == null) {
			if (other.fieldDefinitions != null)
				return false;
		} else if (!fieldDefinitions.equals(other.fieldDefinitions))
			return false;
		if (fieldOrder == null) {
			if (other.fieldOrder != null)
				return false;
		} else if (!fieldOrder.equals(other.fieldOrder))
			return false;
		if (formatName == null) {
			if (other.formatName != null)
				return false;
		} else if (!formatName.equals(other.formatName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (mandatory != other.mandatory)
			return false;
		if (repeteable != other.repeteable)
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
	    
	    retValue.append("MTFSetDefinition ( ")
	        .append("id = ").append(this.id).append(TAB)
	        .append("fieldOrder = ").append(this.fieldOrder).append(TAB)
	        .append("formatName = ").append(this.formatName).append(TAB)
	        .append("repeteable = ").append(this.repeteable).append(TAB)
	        .append("mandatory = ").append(this.mandatory).append(TAB)
	        .append("fieldDefinitions = ").append(this.fieldDefinitions).append(TAB)
	        .append(" )");
	    
	    return retValue.toString();
	}











	
	
	
}
