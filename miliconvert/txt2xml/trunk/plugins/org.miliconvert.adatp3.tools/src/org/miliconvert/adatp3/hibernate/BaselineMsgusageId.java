package org.miliconvert.adatp3.hibernate;

// Generated 3 sept. 2009 09:13:44 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * BaselineMsgusageId generated by hbm2java
 */
public class BaselineMsgusageId implements java.io.Serializable {

	private Double msg;
	private Double usrgr;
	private String preparation;
	private Date initdate;
	private Date expdate;
	private String classname;
	private String msgno;

	public BaselineMsgusageId() {
	}

	public BaselineMsgusageId(Double msg, Double usrgr, String preparation,
			Date initdate, Date expdate, String classname, String msgno) {
		this.msg = msg;
		this.usrgr = usrgr;
		this.preparation = preparation;
		this.initdate = initdate;
		this.expdate = expdate;
		this.classname = classname;
		this.msgno = msgno;
	}

	public Double getMsg() {
		return this.msg;
	}

	public void setMsg(Double msg) {
		this.msg = msg;
	}

	public Double getUsrgr() {
		return this.usrgr;
	}

	public void setUsrgr(Double usrgr) {
		this.usrgr = usrgr;
	}

	public String getPreparation() {
		return this.preparation;
	}

	public void setPreparation(String preparation) {
		this.preparation = preparation;
	}

	public Date getInitdate() {
		return this.initdate;
	}

	public void setInitdate(Date initdate) {
		this.initdate = initdate;
	}

	public Date getExpdate() {
		return this.expdate;
	}

	public void setExpdate(Date expdate) {
		this.expdate = expdate;
	}

	public String getClassname() {
		return this.classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getMsgno() {
		return this.msgno;
	}

	public void setMsgno(String msgno) {
		this.msgno = msgno;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BaselineMsgusageId))
			return false;
		BaselineMsgusageId castOther = (BaselineMsgusageId) other;

		return ((this.getMsg() == castOther.getMsg()) || (this.getMsg() != null
				&& castOther.getMsg() != null && this.getMsg().equals(
				castOther.getMsg())))
				&& ((this.getUsrgr() == castOther.getUsrgr()) || (this
						.getUsrgr() != null
						&& castOther.getUsrgr() != null && this.getUsrgr()
						.equals(castOther.getUsrgr())))
				&& ((this.getPreparation() == castOther.getPreparation()) || (this
						.getPreparation() != null
						&& castOther.getPreparation() != null && this
						.getPreparation().equals(castOther.getPreparation())))
				&& ((this.getInitdate() == castOther.getInitdate()) || (this
						.getInitdate() != null
						&& castOther.getInitdate() != null && this
						.getInitdate().equals(castOther.getInitdate())))
				&& ((this.getExpdate() == castOther.getExpdate()) || (this
						.getExpdate() != null
						&& castOther.getExpdate() != null && this.getExpdate()
						.equals(castOther.getExpdate())))
				&& ((this.getClassname() == castOther.getClassname()) || (this
						.getClassname() != null
						&& castOther.getClassname() != null && this
						.getClassname().equals(castOther.getClassname())))
				&& ((this.getMsgno() == castOther.getMsgno()) || (this
						.getMsgno() != null
						&& castOther.getMsgno() != null && this.getMsgno()
						.equals(castOther.getMsgno())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMsg() == null ? 0 : this.getMsg().hashCode());
		result = 37 * result
				+ (getUsrgr() == null ? 0 : this.getUsrgr().hashCode());
		result = 37
				* result
				+ (getPreparation() == null ? 0 : this.getPreparation()
						.hashCode());
		result = 37 * result
				+ (getInitdate() == null ? 0 : this.getInitdate().hashCode());
		result = 37 * result
				+ (getExpdate() == null ? 0 : this.getExpdate().hashCode());
		result = 37 * result
				+ (getClassname() == null ? 0 : this.getClassname().hashCode());
		result = 37 * result
				+ (getMsgno() == null ? 0 : this.getMsgno().hashCode());
		return result;
	}

}