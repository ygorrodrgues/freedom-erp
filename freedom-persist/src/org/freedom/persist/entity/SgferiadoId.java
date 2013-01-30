package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SgferiadoId generated by hbm2java
 */
@Embeddable
public class SgferiadoId implements java.io.Serializable {

	private Date datafer;
	private short codfilial;
	private int codemp;

	public SgferiadoId() {
	}

	public SgferiadoId(Date datafer, short codfilial, int codemp) {
		this.datafer = datafer;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "DATAFER", nullable = false, length = 10)
	public Date getDatafer() {
		return this.datafer;
	}

	public void setDatafer(Date datafer) {
		this.datafer = datafer;
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
		if (!(other instanceof SgferiadoId))
			return false;
		SgferiadoId castOther = (SgferiadoId) other;

		return ((this.getDatafer() == castOther.getDatafer()) || (this
				.getDatafer() != null && castOther.getDatafer() != null && this
				.getDatafer().equals(castOther.getDatafer())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDatafer() == null ? 0 : this.getDatafer().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
