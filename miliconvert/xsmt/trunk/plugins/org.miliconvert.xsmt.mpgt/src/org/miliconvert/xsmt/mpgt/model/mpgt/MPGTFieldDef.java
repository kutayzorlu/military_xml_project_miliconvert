package org.miliconvert.xsmt.mpgt.model.mpgt;


public class MPGTFieldDef extends  AbstractMPGTDef {
	
	
	
	private String ffirn;
	private String ffPos;

	
	private String ssZone;
	

	
	public MPGTFieldDef(String line,String parentInstance, String currInstance, String def, String ffPos, String regles) {
		super(line, parentInstance, currInstance, def, regles);
		this.ffPos = ffPos;
	}
	


	public MPGTFieldDef(String line,String parentInstance, String currInstance, String def, String regles) {
		super(line, parentInstance, currInstance, def, regles);
	}



	public MPGTFieldDef() {}



	public String getFfirn() {
		return ffirn;
	}


	public void setFfirn(String ffirn) {
		this.ffirn = ffirn;
	}


	public String getFfPos() {
		return ffPos;
	}


	public void setFfPos(String ffPos) {
		this.ffPos = ffPos;
	}



	public String getSsZone() {
		return ssZone;
	}


	public void setSsZone(String ssZone) {
		this.ssZone = ssZone;
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
	    
	    retValue.append("MPGTFieldDef ( ")
	        .append("ffirn = ").append(this.ffirn).append(TAB)
	        .append("ffPos = ").append(this.ffPos).append(TAB)
	        .append("ssZone = ").append(this.ssZone).append(TAB)
	        .append("parentInstance = ").append(this.parentInstance).append(TAB)
	        .append("currInstance = ").append(this.currInstance).append(TAB)
	        .append("def = ").append(this.def).append(TAB)
	        .append("label = ").append(this.label).append(TAB)
	        .append("regles = ").append(this.regles).append(TAB)
	        .append("line = ").append(this.line).append(TAB)
	        .append(" )");
	    
	    return retValue.toString();
	}



	

	
	

	
	
	
	
}
