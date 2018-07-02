/**
 * 
 */
package org.miliconvert.xsmt.tmodel;

/**
 * This class is used to represent function parameters in function signatures
 * 
 * @author Thomas Cataldo
 * 
 */
public class Variable {

	private String name;

	public Variable(String name) {
		if (name == null) {
			throw new NullPointerException();
		}
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}