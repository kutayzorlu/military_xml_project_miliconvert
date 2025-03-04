package org.miliconvert.adatp3.hibernate;

// Generated 3 sept. 2009 09:13:44 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * BaselineMsgflogId generated by hbm2java
 */
public class BaselineMsgflogId implements java.io.Serializable {

	private Double key;
	private String username;
	private Date logdate;
	private String entry;

	public BaselineMsgflogId() {
	}

	public BaselineMsgflogId(Double key, String username, Date logdate,
			String entry) {
		this.key = key;
		this.username = username;
		this.logdate = logdate;
		this.entry = entry;
	}

	public Double getKey() {
		return this.key;
	}

	public void setKey(Double key) {
		this.key = key;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getLogdate() {
		return this.logdate;
	}

	public void setLogdate(Date logdate) {
		this.logdate = logdate;
	}

	public String getEntry() {
		return this.entry;
	}

	public void setEntry(String entry) {
		this.entry = entry;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BaselineMsgflogId))
			return false;
		BaselineMsgflogId castOther = (BaselineMsgflogId) other;

		return ((this.getKey() == castOther.getKey()) || (this.getKey() != null
				&& castOther.getKey() != null && this.getKey().equals(
				castOther.getKey())))
				&& ((this.getUsername() == castOther.getUsername()) || (this
						.getUsername() != null
						&& castOther.getUsername() != null && this
						.getUsername().equals(castOther.getUsername())))
				&& ((this.getLogdate() == castOther.getLogdate()) || (this
						.getLogdate() != null
						&& castOther.getLogdate() != null && this.getLogdate()
						.equals(castOther.getLogdate())))
				&& ((this.getEntry() == castOther.getEntry()) || (this
						.getEntry() != null
						&& castOther.getEntry() != null && this.getEntry()
						.equals(castOther.getEntry())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getKey() == null ? 0 : this.getKey().hashCode());
		result = 37 * result
				+ (getUsername() == null ? 0 : this.getUsername().hashCode());
		result = 37 * result
				+ (getLogdate() == null ? 0 : this.getLogdate().hashCode());
		result = 37 * result
				+ (getEntry() == null ? 0 : this.getEntry().hashCode());
		return result;
	}

}
