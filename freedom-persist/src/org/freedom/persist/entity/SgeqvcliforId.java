package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SgeqvcliforId generated by hbm2java
 */
@Embeddable
public class SgeqvcliforId implements java.io.Serializable {

	private int codcli;
	private int codfilialcl;
	private int codempcl;
	private int codfor;
	private int codfilialfr;
	private int codempfr;

	public SgeqvcliforId() {
	}

	public SgeqvcliforId(int codcli, int codfilialcl, int codempcl, int codfor,
			int codfilialfr, int codempfr) {
		this.codcli = codcli;
		this.codfilialcl = codfilialcl;
		this.codempcl = codempcl;
		this.codfor = codfor;
		this.codfilialfr = codfilialfr;
		this.codempfr = codempfr;
	}

	@Column(name = "CODCLI", nullable = false)
	public int getCodcli() {
		return this.codcli;
	}

	public void setCodcli(int codcli) {
		this.codcli = codcli;
	}

	@Column(name = "CODFILIALCL", nullable = false)
	public int getCodfilialcl() {
		return this.codfilialcl;
	}

	public void setCodfilialcl(int codfilialcl) {
		this.codfilialcl = codfilialcl;
	}

	@Column(name = "CODEMPCL", nullable = false)
	public int getCodempcl() {
		return this.codempcl;
	}

	public void setCodempcl(int codempcl) {
		this.codempcl = codempcl;
	}

	@Column(name = "CODFOR", nullable = false)
	public int getCodfor() {
		return this.codfor;
	}

	public void setCodfor(int codfor) {
		this.codfor = codfor;
	}

	@Column(name = "CODFILIALFR", nullable = false)
	public int getCodfilialfr() {
		return this.codfilialfr;
	}

	public void setCodfilialfr(int codfilialfr) {
		this.codfilialfr = codfilialfr;
	}

	@Column(name = "CODEMPFR", nullable = false)
	public int getCodempfr() {
		return this.codempfr;
	}

	public void setCodempfr(int codempfr) {
		this.codempfr = codempfr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SgeqvcliforId))
			return false;
		SgeqvcliforId castOther = (SgeqvcliforId) other;

		return (this.getCodcli() == castOther.getCodcli())
				&& (this.getCodfilialcl() == castOther.getCodfilialcl())
				&& (this.getCodempcl() == castOther.getCodempcl())
				&& (this.getCodfor() == castOther.getCodfor())
				&& (this.getCodfilialfr() == castOther.getCodfilialfr())
				&& (this.getCodempfr() == castOther.getCodempfr());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcli();
		result = 37 * result + this.getCodfilialcl();
		result = 37 * result + this.getCodempcl();
		result = 37 * result + this.getCodfor();
		result = 37 * result + this.getCodfilialfr();
		result = 37 * result + this.getCodempfr();
		return result;
	}

}
