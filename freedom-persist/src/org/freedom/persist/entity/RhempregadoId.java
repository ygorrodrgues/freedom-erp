package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * RhempregadoId generated by hbm2java
 */
public class RhempregadoId implements java.io.Serializable {

	private int matempr;
	private short codfilial;
	private int codemp;

	public RhempregadoId() {
	}

	public RhempregadoId(int matempr, short codfilial, int codemp) {
		this.matempr = matempr;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getMatempr() {
		return this.matempr;
	}

	public void setMatempr(int matempr) {
		this.matempr = matempr;
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
		if (!(other instanceof RhempregadoId))
			return false;
		RhempregadoId castOther = (RhempregadoId) other;

		return (this.getMatempr() == castOther.getMatempr())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getMatempr();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
