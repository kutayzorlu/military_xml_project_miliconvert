package org.miliconvert.adatp3.hibernate;

// Generated 3 sept. 2009 09:13:44 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * BaselineClsetdesc generated by hbm2java
 */
public class BaselineClsetdesc implements java.io.Serializable {

	private double key;
	private String class_;
	private Date auditdate;
	private String clsetdesc;

	public BaselineClsetdesc() {
	}

	public BaselineClsetdesc(double key) {
		this.key = key;
	}

	public BaselineClsetdesc(double key, String class_, Date auditdate,
			String clsetdesc) {
		this.key = key;
		this.class_ = class_;
		this.auditdate = auditdate;
		this.clsetdesc = clsetdesc;
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

	public String getClsetdesc() {
		return this.clsetdesc;
	}

	public void setClsetdesc(String clsetdesc) {
		this.clsetdesc = clsetdesc;
	}

}
