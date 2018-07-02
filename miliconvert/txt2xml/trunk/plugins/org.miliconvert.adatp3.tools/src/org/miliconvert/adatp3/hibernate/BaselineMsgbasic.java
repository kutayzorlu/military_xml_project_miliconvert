package org.miliconvert.adatp3.hibernate;

// Generated 3 sept. 2009 09:13:44 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * BaselineMsgbasic generated by hbm2java
 */
public class BaselineMsgbasic implements java.io.Serializable {

	private double key;
	private String version;
	private Double context;
	private String msgno;
	private String natostat;
	private Date nmoddate;
	private String msgclass;
	private Date revdate;
	private Date auditdate;
	private String msgname;
	private String mnclass;
	private String msgid;
	private String miclass;
	private String operuse;
	private String origmsgcl;
	private String origmsgno;
	private Date origdate;
	private String clname;
	private Date ufrevdate;

	public BaselineMsgbasic() {
	}

	public BaselineMsgbasic(double key) {
		this.key = key;
	}

	public BaselineMsgbasic(double key, Double context, String msgno,
			String natostat, Date nmoddate, String msgclass, Date revdate,
			Date auditdate, String msgname, String mnclass, String msgid,
			String miclass, String operuse, String origmsgcl, String origmsgno,
			Date origdate, String clname, Date ufrevdate) {
		this.key = key;
		this.context = context;
		this.msgno = msgno;
		this.natostat = natostat;
		this.nmoddate = nmoddate;
		this.msgclass = msgclass;
		this.revdate = revdate;
		this.auditdate = auditdate;
		this.msgname = msgname;
		this.mnclass = mnclass;
		this.msgid = msgid;
		this.miclass = miclass;
		this.operuse = operuse;
		this.origmsgcl = origmsgcl;
		this.origmsgno = origmsgno;
		this.origdate = origdate;
		this.clname = clname;
		this.ufrevdate = ufrevdate;
	}

	public double getKey() {
		return this.key;
	}

	public void setKey(double key) {
		this.key = key;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Double getContext() {
		return this.context;
	}

	public void setContext(Double context) {
		this.context = context;
	}

	public String getMsgno() {
		return this.msgno;
	}

	public void setMsgno(String msgno) {
		this.msgno = msgno;
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

	public String getMsgclass() {
		return this.msgclass;
	}

	public void setMsgclass(String msgclass) {
		this.msgclass = msgclass;
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

	public String getMsgname() {
		return this.msgname;
	}

	public void setMsgname(String msgname) {
		this.msgname = msgname;
	}

	public String getMnclass() {
		return this.mnclass;
	}

	public void setMnclass(String mnclass) {
		this.mnclass = mnclass;
	}

	public String getMsgid() {
		return this.msgid;
	}

	public void setMsgid(String msgid) {
		this.msgid = msgid;
	}

	public String getMiclass() {
		return this.miclass;
	}

	public void setMiclass(String miclass) {
		this.miclass = miclass;
	}

	public String getOperuse() {
		return this.operuse;
	}

	public void setOperuse(String operuse) {
		this.operuse = operuse;
	}

	public String getOrigmsgcl() {
		return this.origmsgcl;
	}

	public void setOrigmsgcl(String origmsgcl) {
		this.origmsgcl = origmsgcl;
	}

	public String getOrigmsgno() {
		return this.origmsgno;
	}

	public void setOrigmsgno(String origmsgno) {
		this.origmsgno = origmsgno;
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

	public Date getUfrevdate() {
		return this.ufrevdate;
	}

	public void setUfrevdate(Date ufrevdate) {
		this.ufrevdate = ufrevdate;
	}

}