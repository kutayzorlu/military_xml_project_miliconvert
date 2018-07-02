package org.miliconvert.adatp3.common.formlets;

/**
 * All lines after CLOSTEXT
 * 
 * @author tom
 *
 */
public class ClosingPart {

	private String[] closingLines;
	
	public ClosingPart() {
		
	}
	
	public void setClosingLines(String[] lines) {
		this.closingLines = lines;
	}

	public String[] getClosingLines() {
		return closingLines;
	}
	
}
