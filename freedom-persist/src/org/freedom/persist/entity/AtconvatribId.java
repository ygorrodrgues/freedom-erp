package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

/**
 * AtconvatribId generated by hbm2java
 */
public class AtconvatribId implements java.io.Serializable {

	private int codconv;
	private short seqconvatrib;
	private short codfilial;
	private int codemp;

	public AtconvatribId() {
	}

	public AtconvatribId(int codconv, short seqconvatrib, short codfilial,
			int codemp) {
		this.codconv = codconv;
		this.seqconvatrib = seqconvatrib;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodconv() {
		return this.codconv;
	}

	public void setCodconv(int codconv) {
		this.codconv = codconv;
	}

	public short getSeqconvatrib() {
		return this.seqconvatrib;
	}

	public void setSeqconvatrib(short seqconvatrib) {
		this.seqconvatrib = seqconvatrib;
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
		if (!(other instanceof AtconvatribId))
			return false;
		AtconvatribId castOther = (AtconvatribId) other;

		return (this.getCodconv() == castOther.getCodconv())
				&& (this.getSeqconvatrib() == castOther.getSeqconvatrib())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodconv();
		result = 37 * result + this.getSeqconvatrib();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
