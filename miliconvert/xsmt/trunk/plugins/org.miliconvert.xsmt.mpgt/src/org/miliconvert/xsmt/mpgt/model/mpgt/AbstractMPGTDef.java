package org.miliconvert.xsmt.mpgt.model.mpgt;

public abstract class AbstractMPGTDef  {

	protected String parentInstance;
	protected String currInstance;
	protected String def;
	protected String label;
	protected String regles;
	protected String line;
	
	public AbstractMPGTDef() {}
	
	public AbstractMPGTDef(String line,String parentInstance, String currInstance, String def, String regles) {
		super();
		this.parentInstance = parentInstance;
		this.currInstance = currInstance;
		this.def = def;
		this.line = line;
		this.regles = regles;
	}
	
	


	public String getParentInstance() {
		return parentInstance;
	}
	public void setParentInstance(String parentInstance) {
		this.parentInstance = parentInstance;
	}
	public String getCurrInstance() {
		return currInstance;
	}
	public void setCurrInstance(String currInstance) {
		this.currInstance = currInstance;
	}
	public String getDef() {
		return def;
	}
	public void setDef(String def) {
		this.def = def;
	}


	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}
	
	public String getLine() {
		return line;
	}


	public void setLine(String line) {
		this.line = line;
	}


	public String getRegles() {
		return regles;
	}


	public void setRegles(String regles) {
		this.regles = regles;
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
	    
	    retValue.append("AbstractMPGTDef ( ")
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
