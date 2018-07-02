package org.miliconvert.adatp3.hibernate;

// Generated 3 sept. 2009 09:13:44 by Hibernate Tools 3.2.4.GA

/**
 * BaselineClabbrevId generated by hbm2java
 */
public class BaselineClabbrevId implements java.io.Serializable {

	private Double key;
	private String abrtype;
	private String abbrev;
	private String abrdesc;

	public BaselineClabbrevId() {
	}

	public BaselineClabbrevId(Double key, String abrtype, String abbrev,
			String abrdesc) {
		this.key = key;
		this.abrtype = abrtype;
		this.abbrev = abbrev;
		this.abrdesc = abrdesc;
	}

	public Double getKey() {
		return this.key;
	}

	public void setKey(Double key) {
		this.key = key;
	}

	public String getAbrtype() {
		return this.abrtype;
	}

	public void setAbrtype(String abrtype) {
		this.abrtype = abrtype;
	}

	public String getAbbrev() {
		return this.abbrev;
	}

	public void setAbbrev(String abbrev) {
		this.abbrev = abbrev;
	}

	public String getAbrdesc() {
		return this.abrdesc;
	}

	public void setAbrdesc(String abrdesc) {
		this.abrdesc = abrdesc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BaselineClabbrevId))
			return false;
		BaselineClabbrevId castOther = (BaselineClabbrevId) other;

		return ((this.getKey() == castOther.getKey()) || (this.getKey() != null
				&& castOther.getKey() != null && this.getKey().equals(
				castOther.getKey())))
				&& ((this.getAbrtype() == castOther.getAbrtype()) || (this
						.getAbrtype() != null
						&& castOther.getAbrtype() != null && this.getAbrtype()
						.equals(castOther.getAbrtype())))
				&& ((this.getAbbrev() == castOther.getAbbrev()) || (this
						.getAbbrev() != null
						&& castOther.getAbbrev() != null && this.getAbbrev()
						.equals(castOther.getAbbrev())))
				&& ((this.getAbrdesc() == castOther.getAbrdesc()) || (this
						.getAbrdesc() != null
						&& castOther.getAbrdesc() != null && this.getAbrdesc()
						.equals(castOther.getAbrdesc())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getKey() == null ? 0 : this.getKey().hashCode());
		result = 37 * result
				+ (getAbrtype() == null ? 0 : this.getAbrtype().hashCode());
		result = 37 * result
				+ (getAbbrev() == null ? 0 : this.getAbbrev().hashCode());
		result = 37 * result
				+ (getAbrdesc() == null ? 0 : this.getAbrdesc().hashCode());
		return result;
	}

}