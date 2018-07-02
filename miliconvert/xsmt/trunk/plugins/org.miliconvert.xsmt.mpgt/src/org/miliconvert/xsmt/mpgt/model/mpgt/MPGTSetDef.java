package org.miliconvert.xsmt.mpgt.model.mpgt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MPGTSetDef extends  AbstractMPGTDef {

	public MPGTSetDef(String line, String parentInstance, String currInstance, String def, String regles) {
		super(line, parentInstance, currInstance, def,regles);
	}

	private String setId;

	private Map<String, List<MPGTFieldDef>> fields = new HashMap<String, List<MPGTFieldDef>>();

	public void addField(String key, MPGTFieldDef value) {
		if(fields.containsKey(key)){
			fields.get(key).add(value);
		} else {
			List<MPGTFieldDef> defs = new ArrayList<MPGTFieldDef>();
			defs.add(value);
			fields.put(key, defs);
		}
	}

	public List<MPGTFieldDef> findFieldDef(String ffpos) {
		return fields.get(ffpos);
	}

	public String getSetId() {
		return setId;
	}

	public void setSetId(String setId) {
		this.setId = setId;
	}

	public Map<String, List<MPGTFieldDef>> getFields() {
		return fields;
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
	    
	    retValue.append("MPGTSetDef ( ")
	        .append("setId = ").append(this.setId).append(TAB)
	        .append("fields = ").append(this.fields).append(TAB)
	        .append(" )");
	    
	    return retValue.toString();
	}
	
	
	
	
	
	
	
}
