package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VditvendaserieId generated by hbm2java
 */
@Embeddable
public class VditvendaserieId implements java.io.Serializable {

	private int codvenda;
	private int coditvenda;
	private char tipovenda;
	private int seqitserie;
	private short codfilial;
	private int codemp;

	public VditvendaserieId() {
	}

	public VditvendaserieId(int codvenda, int coditvenda, char tipovenda,
			int seqitserie, short codfilial, int codemp) {
		this.codvenda = codvenda;
		this.coditvenda = coditvenda;
		this.tipovenda = tipovenda;
		this.seqitserie = seqitserie;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODVENDA", nullable = false)
	public int getCodvenda() {
		return this.codvenda;
	}

	public void setCodvenda(int codvenda) {
		this.codvenda = codvenda;
	}

	@Column(name = "CODITVENDA", nullable = false)
	public int getCoditvenda() {
		return this.coditvenda;
	}

	public void setCoditvenda(int coditvenda) {
		this.coditvenda = coditvenda;
	}

	@Column(name = "TIPOVENDA", nullable = false, length = 1)
	public char getTipovenda() {
		return this.tipovenda;
	}

	public void setTipovenda(char tipovenda) {
		this.tipovenda = tipovenda;
	}

	@Column(name = "SEQITSERIE", nullable = false)
	public int getSeqitserie() {
		return this.seqitserie;
	}

	public void setSeqitserie(int seqitserie) {
		this.seqitserie = seqitserie;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODEMP", nullable = false)
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
		if (!(other instanceof VditvendaserieId))
			return false;
		VditvendaserieId castOther = (VditvendaserieId) other;

		return (this.getCodvenda() == castOther.getCodvenda())
				&& (this.getCoditvenda() == castOther.getCoditvenda())
				&& (this.getTipovenda() == castOther.getTipovenda())
				&& (this.getSeqitserie() == castOther.getSeqitserie())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodvenda();
		result = 37 * result + this.getCoditvenda();
		result = 37 * result + this.getTipovenda();
		result = 37 * result + this.getSeqitserie();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
