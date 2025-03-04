package org.miliconvert.adatp3.hibernate;

// Generated 3 sept. 2009 09:13:44 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * BaselineSetbasic generated by hbm2java
 */
public class BaselineSetbasic implements java.io.Serializable {

	private double key;
	private Double context;
	private String setid;
	private String natostat;
	private Date nmoddate;
	private String setclass;
	private Date revdate;
	private Date auditdate;
	private String settitle;
	private String stclass;
	private String operuse;
	private String origsetcl;
	private String origsetid;
	private Date origdate;
	private String clname;
	private String setformat;
	private Integer setCatId;
	private Date ufrevdate;

	public BaselineSetbasic() {
	}

	public BaselineSetbasic(double key) {
		this.key = key;
	}

	public BaselineSetbasic(double key, Double context, String setid,
			String natostat, Date nmoddate, String setclass, Date revdate,
			Date auditdate, String settitle, String stclass, String operuse,
			String origsetcl, String origsetid, Date origdate, String clname,
			String setformat, Integer setCatId, Date ufrevdate) {
		this.key = key;
		this.context = context;
		this.setid = setid;
		this.natostat = natostat;
		this.nmoddate = nmoddate;
		this.setclass = setclass;
		this.revdate = revdate;
		this.auditdate = auditdate;
		this.settitle = settitle;
		this.stclass = stclass;
		this.operuse = operuse;
		this.origsetcl = origsetcl;
		this.origsetid = origsetid;
		this.origdate = origdate;
		this.clname = clname;
		this.setformat = setformat;
		this.setCatId = setCatId;
		this.ufrevdate = ufrevdate;
	}

	public double getKey() {
		return this.key;
	}

	public void setKey(double key) {
		this.key = key;
	}

	public Double getContext() {
		return this.context;
	}

	public void setContext(Double context) {
		this.context = context;
	}

	public String getSetid() {
		return this.setid;
	}

	public void setSetid(String setid) {
		this.setid = setid;
	}

	public String getNatostat() {
		return this.natostat;
	}

	public void setNatostat(String natostat) {
		this.natostat = natostat;
	}

	public Date getNmoddate() {
		return this.nmoddate;
	}

	public void setNmoddate(Date nmoddate) {
		this.nmoddate = nmoddate;
	}

	public String getSetclass() {
		return this.setclass;
	}

	public void setSetclass(String setclass) {
		this.setclass = setclass;
	}

	public Date getRevdate() {
		return this.revdate;
	}

	public void setRevdate(Date revdate) {
		this.revdate = revdate;
	}

	public Date getAuditdate() {
		return this.auditdate;
	}

	public void setAuditdate(Date auditdate) {
		this.auditdate = auditdate;
	}

	public String getSettitle() {
		return this.settitle;
	}

	public void setSettitle(String settitle) {
		this.settitle = settitle;
	}

	public String getStclass() {
		return this.stclass;
	}

	public void setStclass(String stclass) {
		this.stclass = stclass;
	}

	public String getOperuse() {
		return this.operuse;
	}

	public void setOperuse(String operuse) {
		this.operuse = operuse;
	}

	public String getOrigsetcl() {
		return this.origsetcl;
	}

	public void setOrigsetcl(String origsetcl) {
		this.origsetcl = origsetcl;
	}

	public String getOrigsetid() {
		return this.origsetid;
	}

	public void setOrigsetid(String origsetid) {
		this.origsetid = origsetid;
	}

	public Date getOrigdate() {
		return this.origdate;
	}

	public void setOrigdate(Date origdate) {
		this.origdate = origdate;
	}

	public String getClname() {
		return this.clname;
	}

	public void setClname(String clname) {
		this.clname = clname;
	}

	public String getSetformat() {
		return this.setformat;
	}

	public void setSetformat(String setformat) {
		this.setformat = setformat;
	}

	public Integer getSetCatId() {
		return this.setCatId;
	}

	public void setSetCatId(Integer setCatId) {
		this.setCatId = setCatId;
	}

	public Date getUfrevdate() {
		return this.ufrevdate;
	}

	public void setUfrevdate(Date ufrevdate) {
		this.ufrevdate = ufrevdate;
	}

}
