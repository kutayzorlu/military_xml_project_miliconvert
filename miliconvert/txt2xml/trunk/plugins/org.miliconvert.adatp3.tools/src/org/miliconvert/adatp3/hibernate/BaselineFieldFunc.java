package org.miliconvert.adatp3.hibernate;

// Generated 3 sept. 2009 09:13:44 by Hibernate Tools 3.2.4.GA

/**
 * BaselineFieldFunc generated by hbm2java
 */
public class BaselineFieldFunc implements java.io.Serializable {

	private BaselineFieldFuncId id;
	private String cond;

	public BaselineFieldFunc() {
	}

	public BaselineFieldFunc(BaselineFieldFuncId id) {
		this.id = id;
	}

	public BaselineFieldFunc(BaselineFieldFuncId id, String cond) {
		this.id = id;
		this.cond = cond;
	}

	public BaselineFieldFuncId getId() {
		return this.id;
	}

	public void setId(BaselineFieldFuncId id) {
		this.id = id;
	}

	public String getCond() {
		return this.cond;
	}

	public void setCond(String cond) {
		this.cond = cond;
	}

}