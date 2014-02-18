package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Sgacessomu generated by hbm2java
 */
public class Sgacessomu implements java.io.Serializable {

	private SgacessomuId id;
	private Sgfilial sgfilial;
	private char tpacessomu;
	private char planomu;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Sgacessomu() {
	}

	public Sgacessomu(SgacessomuId id, Sgfilial sgfilial, char tpacessomu,
			char planomu, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.tpacessomu = tpacessomu;
		this.planomu = planomu;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgacessomu(SgacessomuId id, Sgfilial sgfilial, char tpacessomu,
			char planomu, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, String idusualt) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.tpacessomu = tpacessomu;
		this.planomu = planomu;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public SgacessomuId getId() {
		return this.id;
	}

	public void setId(SgacessomuId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public char getTpacessomu() {
		return this.tpacessomu;
	}

	public void setTpacessomu(char tpacessomu) {
		this.tpacessomu = tpacessomu;
	}

	public char getPlanomu() {
		return this.planomu;
	}

	public void setPlanomu(char planomu) {
		this.planomu = planomu;
	}

	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

}
