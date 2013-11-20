package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Ppopfase generated by hbm2java
 */
public class Ppopfase implements java.io.Serializable {

	private PpopfaseId id;
	private Ppfase ppfase;
	private Pprecurso pprecurso;
	private Ppop ppop;
	private Pptiporec pptiporec;
	private BigDecimal tempoof;
	private Date datainiprodfs;
	private Date hiniprodfs;
	private Date datafimprodfs;
	private Date hfimprodfs;
	private String obsfs;
	private String sitfs;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set eqrmas = new HashSet(0);

	public Ppopfase() {
	}

	public Ppopfase(PpopfaseId id, Ppfase ppfase, Pprecurso pprecurso,
			Ppop ppop, Pptiporec pptiporec, BigDecimal tempoof, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.ppfase = ppfase;
		this.pprecurso = pprecurso;
		this.ppop = ppop;
		this.pptiporec = pptiporec;
		this.tempoof = tempoof;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Ppopfase(PpopfaseId id, Ppfase ppfase, Pprecurso pprecurso,
			Ppop ppop, Pptiporec pptiporec, BigDecimal tempoof,
			Date datainiprodfs, Date hiniprodfs, Date datafimprodfs,
			Date hfimprodfs, String obsfs, String sitfs, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt, Set eqrmas) {
		this.id = id;
		this.ppfase = ppfase;
		this.pprecurso = pprecurso;
		this.ppop = ppop;
		this.pptiporec = pptiporec;
		this.tempoof = tempoof;
		this.datainiprodfs = datainiprodfs;
		this.hiniprodfs = hiniprodfs;
		this.datafimprodfs = datafimprodfs;
		this.hfimprodfs = hfimprodfs;
		this.obsfs = obsfs;
		this.sitfs = sitfs;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.eqrmas = eqrmas;
	}

	public PpopfaseId getId() {
		return this.id;
	}

	public void setId(PpopfaseId id) {
		this.id = id;
	}

	public Ppfase getPpfase() {
		return this.ppfase;
	}

	public void setPpfase(Ppfase ppfase) {
		this.ppfase = ppfase;
	}

	public Pprecurso getPprecurso() {
		return this.pprecurso;
	}

	public void setPprecurso(Pprecurso pprecurso) {
		this.pprecurso = pprecurso;
	}

	public Ppop getPpop() {
		return this.ppop;
	}

	public void setPpop(Ppop ppop) {
		this.ppop = ppop;
	}

	public Pptiporec getPptiporec() {
		return this.pptiporec;
	}

	public void setPptiporec(Pptiporec pptiporec) {
		this.pptiporec = pptiporec;
	}

	public BigDecimal getTempoof() {
		return this.tempoof;
	}

	public void setTempoof(BigDecimal tempoof) {
		this.tempoof = tempoof;
	}

	public Date getDatainiprodfs() {
		return this.datainiprodfs;
	}

	public void setDatainiprodfs(Date datainiprodfs) {
		this.datainiprodfs = datainiprodfs;
	}

	public Date getHiniprodfs() {
		return this.hiniprodfs;
	}

	public void setHiniprodfs(Date hiniprodfs) {
		this.hiniprodfs = hiniprodfs;
	}

	public Date getDatafimprodfs() {
		return this.datafimprodfs;
	}

	public void setDatafimprodfs(Date datafimprodfs) {
		this.datafimprodfs = datafimprodfs;
	}

	public Date getHfimprodfs() {
		return this.hfimprodfs;
	}

	public void setHfimprodfs(Date hfimprodfs) {
		this.hfimprodfs = hfimprodfs;
	}

	public String getObsfs() {
		return this.obsfs;
	}

	public void setObsfs(String obsfs) {
		this.obsfs = obsfs;
	}

	public String getSitfs() {
		return this.sitfs;
	}

	public void setSitfs(String sitfs) {
		this.sitfs = sitfs;
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

	public Set getEqrmas() {
		return this.eqrmas;
	}

	public void setEqrmas(Set eqrmas) {
		this.eqrmas = eqrmas;
	}

}
