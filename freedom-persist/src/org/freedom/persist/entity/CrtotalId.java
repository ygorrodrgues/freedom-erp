package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CrtotalId generated by hbm2java
 */
@Embeddable
public class CrtotalId implements java.io.Serializable {

	private int seqtot;
	private short codfilial;
	private int codemp;

	public CrtotalId() {
	}

	public CrtotalId(int seqtot, short codfilial, int codemp) {
		this.seqtot = seqtot;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "SEQTOT", nullable = false)
	public int getSeqtot() {
		return this.seqtot;
	}

	public void setSeqtot(int seqtot) {
		this.seqtot = seqtot;
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
		if (!(other instanceof CrtotalId))
			return false;
		CrtotalId castOther = (CrtotalId) other;

		return (this.getSeqtot() == castOther.getSeqtot())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSeqtot();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
