package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VdfretevdId generated by hbm2java
 */
@Embeddable
public class VdfretevdId implements java.io.Serializable {

	private int codvenda;
	private char tipovenda;
	private short codfilial;
	private int codemp;

	public VdfretevdId() {
	}

	public VdfretevdId(int codvenda, char tipovenda, short codfilial, int codemp) {
		this.codvenda = codvenda;
		this.tipovenda = tipovenda;
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

	@Column(name = "TIPOVENDA", nullable = false, length = 1)
	public char getTipovenda() {
		return this.tipovenda;
	}

	public void setTipovenda(char tipovenda) {
		this.tipovenda = tipovenda;
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
		if (!(other instanceof VdfretevdId))
			return false;
		VdfretevdId castOther = (VdfretevdId) other;

		return (this.getCodvenda() == castOther.getCodvenda())
				&& (this.getTipovenda() == castOther.getTipovenda())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodvenda();
		result = 37 * result + this.getTipovenda();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
