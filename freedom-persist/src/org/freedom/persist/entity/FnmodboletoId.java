package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * FnmodboletoId generated by hbm2java
 */
public class FnmodboletoId implements java.io.Serializable {

	private int codmodbol;
	private int codfilial;
	private int codemp;

	public FnmodboletoId() {
	}

	public FnmodboletoId(int codmodbol, int codfilial, int codemp) {
		this.codmodbol = codmodbol;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodmodbol() {
		return this.codmodbol;
	}

	public void setCodmodbol(int codmodbol) {
		this.codmodbol = codmodbol;
	}

	public int getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(int codfilial) {
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
		if (!(other instanceof FnmodboletoId))
			return false;
		FnmodboletoId castOther = (FnmodboletoId) other;

		return (this.getCodmodbol() == castOther.getCodmodbol())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodmodbol();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
