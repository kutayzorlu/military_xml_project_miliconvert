package org.miliconvert.otg.model;

/**
 * Object representation of MTF field
 * 
 * @author matthieu
 *
 */
public class MTFFieldDefinition  {
		
	private String name;
	private String format;
	

	public MTFFieldDefinition(String name, String format) {
		super();
		this.name = name;
		this.format = format;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}


}
