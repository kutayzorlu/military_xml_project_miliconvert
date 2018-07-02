package org.miliconvert.adatp3.common.formlets;

/**
 * 
 * @author matthieu
 *
 */
public class Header {

	private String name;
	private int size;
	
	public Header(String name) {
		this.name = name;
	}
	
	public Header() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
	
}
