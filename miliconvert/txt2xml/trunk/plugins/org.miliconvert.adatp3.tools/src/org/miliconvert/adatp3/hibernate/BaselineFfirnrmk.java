package org.miliconvert.adatp3.hibernate;

// Generated 3 sept. 2009 09:13:44 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * BaselineFfirnrmk generated by hbm2java
 */
public class BaselineFfirnrmk implements java.io.Serializable {

	private double key;
	private String class_;
	private Date auditdate;
	private String ffirnrmk;

	public BaselineFfirnrmk() {
	}

	public BaselineFfirnrmk(double key) {
		this.key = key;
	}

	public BaselineFfirnrmk(double key, String class_, Date auditdate,
			String ffirnrmk) {
		this.key = key;
		this.class_ = class_;
		this.auditdate = auditdate;
		this.ffirnrmk = ffirnrmk;
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

	public String getFfirnrmk() {
		return this.ffirnrmk;
	}

	public void setFfirnrmk(String ffirnrmk) {
		this.ffirnrmk = ffirnrmk;
	}

}
