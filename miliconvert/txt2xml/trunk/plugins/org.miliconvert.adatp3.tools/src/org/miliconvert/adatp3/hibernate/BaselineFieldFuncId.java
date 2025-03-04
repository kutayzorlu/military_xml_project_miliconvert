package org.miliconvert.adatp3.hibernate;

// Generated 3 sept. 2009 09:13:44 by Hibernate Tools 3.2.4.GA

/**
 * BaselineFieldFuncId generated by hbm2java
 */
public class BaselineFieldFuncId implements java.io.Serializable {

	private double setfieldid;
	private double funcid;

	public BaselineFieldFuncId() {
	}

	public BaselineFieldFuncId(double setfieldid, double funcid) {
		this.setfieldid = setfieldid;
		this.funcid = funcid;
	}

	public double getSetfieldid() {
		return this.setfieldid;
	}

	public void setSetfieldid(double setfieldid) {
		this.setfieldid = setfieldid;
	}

	public double getFuncid() {
		return this.funcid;
	}

	public void setFuncid(double funcid) {
		this.funcid = funcid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BaselineFieldFuncId))
			return false;
		BaselineFieldFuncId castOther = (BaselineFieldFuncId) other;

		return (this.getSetfieldid() == castOther.getSetfieldid())
				&& (this.getFuncid() == castOther.getFuncid());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getSetfieldid();
		result = 37 * result + (int) this.getFuncid();
		return result;
	}

}
