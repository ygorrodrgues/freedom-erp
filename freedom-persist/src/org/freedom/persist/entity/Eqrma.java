package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Eqrma generated by hbm2java
 */
public class Eqrma implements java.io.Serializable {

	private EqrmaId id;
	private Ppopfase ppopfase;
	private Sgusuario sgusuarioByEqrmafksgusuarioap;
	private Ppop ppop;
	private Sgusuario sgusuarioByEqrmafksgusuarioex;
	private Eqtipomov eqtipomov;
	private Eqrecmerc eqrecmerc;
	private Sgusuario sgusuarioByEqrmafksgusuario;
	private Vditcontrato vditcontrato;
	private Fncc fncc;
	private String motivorma;
	private String motivocancrma;
	private String sitrma;
	private Date dtareqrma;
	private Date dtaexprma;
	private String sitaprovrma;
	private String sitexprma;
	private Date dtaaprovrma;
	private Short coditrecmerc;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set eqitrmas = new HashSet(0);
	private Set eqrmaals = new HashSet(0);

	public Eqrma() {
	}

	public Eqrma(EqrmaId id, Eqtipomov eqtipomov,
			Sgusuario sgusuarioByEqrmafksgusuario, Fncc fncc, String sitrma,
			Date dtareqrma, String sitaprovrma, String sitexprma, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.eqtipomov = eqtipomov;
		this.sgusuarioByEqrmafksgusuario = sgusuarioByEqrmafksgusuario;
		this.fncc = fncc;
		this.sitrma = sitrma;
		this.dtareqrma = dtareqrma;
		this.sitaprovrma = sitaprovrma;
		this.sitexprma = sitexprma;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqrma(EqrmaId id, Ppopfase ppopfase,
			Sgusuario sgusuarioByEqrmafksgusuarioap, Ppop ppop,
			Sgusuario sgusuarioByEqrmafksgusuarioex, Eqtipomov eqtipomov,
			Eqrecmerc eqrecmerc, Sgusuario sgusuarioByEqrmafksgusuario,
			Vditcontrato vditcontrato, Fncc fncc, String motivorma,
			String motivocancrma, String sitrma, Date dtareqrma,
			Date dtaexprma, String sitaprovrma, String sitexprma,
			Date dtaaprovrma, Short coditrecmerc, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set eqitrmas, Set eqrmaals) {
		this.id = id;
		this.ppopfase = ppopfase;
		this.sgusuarioByEqrmafksgusuarioap = sgusuarioByEqrmafksgusuarioap;
		this.ppop = ppop;
		this.sgusuarioByEqrmafksgusuarioex = sgusuarioByEqrmafksgusuarioex;
		this.eqtipomov = eqtipomov;
		this.eqrecmerc = eqrecmerc;
		this.sgusuarioByEqrmafksgusuario = sgusuarioByEqrmafksgusuario;
		this.vditcontrato = vditcontrato;
		this.fncc = fncc;
		this.motivorma = motivorma;
		this.motivocancrma = motivocancrma;
		this.sitrma = sitrma;
		this.dtareqrma = dtareqrma;
		this.dtaexprma = dtaexprma;
		this.sitaprovrma = sitaprovrma;
		this.sitexprma = sitexprma;
		this.dtaaprovrma = dtaaprovrma;
		this.coditrecmerc = coditrecmerc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.eqitrmas = eqitrmas;
		this.eqrmaals = eqrmaals;
	}

	public EqrmaId getId() {
		return this.id;
	}

	public void setId(EqrmaId id) {
		this.id = id;
	}

	public Ppopfase getPpopfase() {
		return this.ppopfase;
	}

	public void setPpopfase(Ppopfase ppopfase) {
		this.ppopfase = ppopfase;
	}

	public Sgusuario getSgusuarioByEqrmafksgusuarioap() {
		return this.sgusuarioByEqrmafksgusuarioap;
	}

	public void setSgusuarioByEqrmafksgusuarioap(
			Sgusuario sgusuarioByEqrmafksgusuarioap) {
		this.sgusuarioByEqrmafksgusuarioap = sgusuarioByEqrmafksgusuarioap;
	}

	public Ppop getPpop() {
		return this.ppop;
	}

	public void setPpop(Ppop ppop) {
		this.ppop = ppop;
	}

	public Sgusuario getSgusuarioByEqrmafksgusuarioex() {
		return this.sgusuarioByEqrmafksgusuarioex;
	}

	public void setSgusuarioByEqrmafksgusuarioex(
			Sgusuario sgusuarioByEqrmafksgusuarioex) {
		this.sgusuarioByEqrmafksgusuarioex = sgusuarioByEqrmafksgusuarioex;
	}

	public Eqtipomov getEqtipomov() {
		return this.eqtipomov;
	}

	public void setEqtipomov(Eqtipomov eqtipomov) {
		this.eqtipomov = eqtipomov;
	}

	public Eqrecmerc getEqrecmerc() {
		return this.eqrecmerc;
	}

	public void setEqrecmerc(Eqrecmerc eqrecmerc) {
		this.eqrecmerc = eqrecmerc;
	}

	public Sgusuario getSgusuarioByEqrmafksgusuario() {
		return this.sgusuarioByEqrmafksgusuario;
	}

	public void setSgusuarioByEqrmafksgusuario(
			Sgusuario sgusuarioByEqrmafksgusuario) {
		this.sgusuarioByEqrmafksgusuario = sgusuarioByEqrmafksgusuario;
	}

	public Vditcontrato getVditcontrato() {
		return this.vditcontrato;
	}

	public void setVditcontrato(Vditcontrato vditcontrato) {
		this.vditcontrato = vditcontrato;
	}

	public Fncc getFncc() {
		return this.fncc;
	}

	public void setFncc(Fncc fncc) {
		this.fncc = fncc;
	}

	public String getMotivorma() {
		return this.motivorma;
	}

	public void setMotivorma(String motivorma) {
		this.motivorma = motivorma;
	}

	public String getMotivocancrma() {
		return this.motivocancrma;
	}

	public void setMotivocancrma(String motivocancrma) {
		this.motivocancrma = motivocancrma;
	}

	public String getSitrma() {
		return this.sitrma;
	}

	public void setSitrma(String sitrma) {
		this.sitrma = sitrma;
	}

	public Date getDtareqrma() {
		return this.dtareqrma;
	}

	public void setDtareqrma(Date dtareqrma) {
		this.dtareqrma = dtareqrma;
	}

	public Date getDtaexprma() {
		return this.dtaexprma;
	}

	public void setDtaexprma(Date dtaexprma) {
		this.dtaexprma = dtaexprma;
	}

	public String getSitaprovrma() {
		return this.sitaprovrma;
	}

	public void setSitaprovrma(String sitaprovrma) {
		this.sitaprovrma = sitaprovrma;
	}

	public String getSitexprma() {
		return this.sitexprma;
	}

	public void setSitexprma(String sitexprma) {
		this.sitexprma = sitexprma;
	}

	public Date getDtaaprovrma() {
		return this.dtaaprovrma;
	}

	public void setDtaaprovrma(Date dtaaprovrma) {
		this.dtaaprovrma = dtaaprovrma;
	}

	public Short getCoditrecmerc() {
		return this.coditrecmerc;
	}

	public void setCoditrecmerc(Short coditrecmerc) {
		this.coditrecmerc = coditrecmerc;
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

	public Set getEqitrmas() {
		return this.eqitrmas;
	}

	public void setEqitrmas(Set eqitrmas) {
		this.eqitrmas = eqitrmas;
	}

	public Set getEqrmaals() {
		return this.eqrmaals;
	}

	public void setEqrmaals(Set eqrmaals) {
		this.eqrmaals = eqrmaals;
	}

}
