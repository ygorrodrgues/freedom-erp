package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * LfregrafiscalId generated by hbm2java
 */
public class LfregrafiscalId implements java.io.Serializable {

	private String codregra;
	private short codfilial;
	private int codemp;

	public LfregrafiscalId() {
	}

	public LfregrafiscalId(String codregra, short codfilial, int codemp) {
		this.codregra = codregra;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public String getCodregra() {
		return this.codregra;
	}

	public void setCodregra(String codregra) {
		this.codregra = codregra;
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
		if (!(other instanceof LfregrafiscalId))
			return false;
		LfregrafiscalId castOther = (LfregrafiscalId) other;

		return ((this.getCodregra() == castOther.getCodregra()) || (this
				.getCodregra() != null && castOther.getCodregra() != null && this
				.getCodregra().equals(castOther.getCodregra())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodregra() == null ? 0 : this.getCodregra().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
