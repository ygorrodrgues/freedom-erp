package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

/**
 * EqgrupoId generated by hbm2java
 */
public class EqgrupoId implements java.io.Serializable {

	private String codgrup;
	private short codfilial;
	private int codemp;

	public EqgrupoId() {
	}

	public EqgrupoId(String codgrup, short codfilial, int codemp) {
		this.codgrup = codgrup;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public String getCodgrup() {
		return this.codgrup;
	}

	public void setCodgrup(String codgrup) {
		this.codgrup = codgrup;
	}

	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EqgrupoId))
			return false;
		EqgrupoId castOther = (EqgrupoId) other;

		return ((this.getCodgrup() == castOther.getCodgrup()) || (this
				.getCodgrup() != null && castOther.getCodgrup() != null && this
				.getCodgrup().equals(castOther.getCodgrup())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodgrup() == null ? 0 : this.getCodgrup().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
