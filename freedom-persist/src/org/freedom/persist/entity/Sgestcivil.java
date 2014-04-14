package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Sgestcivil generated by hbm2java
 */
public class Sgestcivil implements java.io.Serializable {

	private SgestcivilId id;
	private Sgfilial sgfilial;
	private String descestcivil;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set rhcandidatos = new HashSet(0);

	public Sgestcivil() {
	}

	public Sgestcivil(SgestcivilId id, Sgfilial sgfilial, String descestcivil,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descestcivil = descestcivil;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgestcivil(SgestcivilId id, Sgfilial sgfilial, String descestcivil,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set rhcandidatos) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descestcivil = descestcivil;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.rhcandidatos = rhcandidatos;
	}

	public SgestcivilId getId() {
		return this.id;
	}

	public void setId(SgestcivilId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public String getDescestcivil() {
		return this.descestcivil;
	}

	public void setDescestcivil(String descestcivil) {
		this.descestcivil = descestcivil;
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

	public Set getRhcandidatos() {
		return this.rhcandidatos;
	}

	public void setRhcandidatos(Set rhcandidatos) {
		this.rhcandidatos = rhcandidatos;
	}

}
