package org.miliconvert.otg.model;

/**
 * Object representation of MTF field
 * 
 * @author matthieu
 *
 */
public class MTFField  {
		
	private String value;
	private String name;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public MTFField(String value) {
		super();
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
