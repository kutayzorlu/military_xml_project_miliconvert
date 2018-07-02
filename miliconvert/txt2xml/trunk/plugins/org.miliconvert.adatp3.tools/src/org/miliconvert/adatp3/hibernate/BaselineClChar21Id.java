package org.miliconvert.adatp3.hibernate;

// Generated 3 sept. 2009 09:13:44 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * BaselineClChar21Id generated by hbm2java
 */
public class BaselineClChar21Id implements java.io.Serializable {

	private Double key;
	private String label;
	private String chardesc;
	private Double base;
	private String quantifier;
	private String comboInd;
	private String characters;
	private Date auditdate;

	public BaselineClChar21Id() {
	}

	public BaselineClChar21Id(Double key, String label, String chardesc,
			Double base, String quantifier, String comboInd, String characters,
			Date auditdate) {
		this.key = key;
		this.label = label;
		this.chardesc = chardesc;
		this.base = base;
		this.quantifier = quantifier;
		this.comboInd = comboInd;
		this.characters = characters;
		this.auditdate = auditdate;
	}

	public Double getKey() {
		return this.key;
	}

	public void setKey(Double key) {
		this.key = key;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getChardesc() {
		return this.chardesc;
	}

	public void setChardesc(String chardesc) {
		this.chardesc = chardesc;
	}

	public Double getBase() {
		return this.base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public String getQuantifier() {
		return this.quantifier;
	}

	public void setQuantifier(String quantifier) {
		this.quantifier = quantifier;
	}

	public String getComboInd() {
		return this.comboInd;
	}

	public void setComboInd(String comboInd) {
		this.comboInd = comboInd;
	}

	public String getCharacters() {
		return this.characters;
	}

	public void setCharacters(String characters) {
		this.characters = characters;
	}

	public Date getAuditdate() {
		return this.auditdate;
	}

	public void setAuditdate(Date auditdate) {
		this.auditdate = auditdate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BaselineClChar21Id))
			return false;
		BaselineClChar21Id castOther = (BaselineClChar21Id) other;

		return ((this.getKey() == castOther.getKey()) || (this.getKey() != null
				&& castOther.getKey() != null && this.getKey().equals(
				castOther.getKey())))
				&& ((this.getLabel() == castOther.getLabel()) || (this
						.getLabel() != null
						&& castOther.getLabel() != null && this.getLabel()
						.equals(castOther.getLabel())))
				&& ((this.getChardesc() == castOther.getChardesc()) || (this
						.getChardesc() != null
						&& castOther.getChardesc() != null && this
						.getChardesc().equals(castOther.getChardesc())))
				&& ((this.getBase() == castOther.getBase()) || (this.getBase() != null
						&& castOther.getBase() != null && this.getBase()
						.equals(castOther.getBase())))
				&& ((this.getQuantifier() == castOther.getQuantifier()) || (this
						.getQuantifier() != null
						&& castOther.getQuantifier() != null && this
						.getQuantifier().equals(castOther.getQuantifier())))
				&& ((this.getComboInd() == castOther.getComboInd()) || (this
						.getComboInd() != null
						&& castOther.getComboInd() != null && this
						.getComboInd().equals(castOther.getComboInd())))
				&& ((this.getCharacters() == castOther.getCharacters()) || (this
						.getCharacters() != null
						&& castOther.getCharacters() != null && this
						.getCharacters().equals(castOther.getCharacters())))
				&& ((this.getAuditdate() == castOther.getAuditdate()) || (this
						.getAuditdate() != null
						&& castOther.getAuditdate() != null && this
						.getAuditdate().equals(castOther.getAuditdate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getKey() == null ? 0 : this.getKey().hashCode());
		result = 37 * result
				+ (getLabel() == null ? 0 : this.getLabel().hashCode());
		result = 37 * result
				+ (getChardesc() == null ? 0 : this.getChardesc().hashCode());
		result = 37 * result
				+ (getBase() == null ? 0 : this.getBase().hashCode());
		result = 37
				* result
				+ (getQuantifier() == null ? 0 : this.getQuantifier()
						.hashCode());
		result = 37 * result
				+ (getComboInd() == null ? 0 : this.getComboInd().hashCode());
		result = 37
				* result
				+ (getCharacters() == null ? 0 : this.getCharacters()
						.hashCode());
		result = 37 * result
				+ (getAuditdate() == null ? 0 : this.getAuditdate().hashCode());
		return result;
	}

}