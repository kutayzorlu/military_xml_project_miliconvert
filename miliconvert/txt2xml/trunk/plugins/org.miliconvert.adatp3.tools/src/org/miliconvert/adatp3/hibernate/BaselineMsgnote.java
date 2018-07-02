package org.miliconvert.adatp3.hibernate;

// Generated 3 sept. 2009 09:13:44 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * BaselineMsgnote generated by hbm2java
 */
public class BaselineMsgnote implements java.io.Serializable {

	private double key;
	private String class_;
	private Date auditdate;
	private String msgnote;

	public BaselineMsgnote() {
	}

	public BaselineMsgnote(double key) {
		this.key = key;
	}

	public BaselineMsgnote(double key, String class_, Date auditdate,
			String msgnote) {
		this.key = key;
		this.class_ = class_;
		this.auditdate = auditdate;
		this.msgnote = msgnote;
	}

	public double getKey() {
		return this.key;
	}

	public void setKey(double key) {
		this.key = key;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public Date getAuditdate() {
		return this.auditdate;
	}

	public void setAuditdate(Date auditdate) {
		this.auditdate = auditdate;
	}

	public String getMsgnote() {
		return this.msgnote;
	}

	public void setMsgnote(String msgnote) {
		this.msgnote = msgnote;
	}

}