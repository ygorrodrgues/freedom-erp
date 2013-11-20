package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Eqvargrade generated by hbm2java
 */
public class Eqvargrade implements java.io.Serializable {

	private EqvargradeId id;
	private Sgfilial sgfilial;
	private String descvarg;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set sgprefere3sForSgprefere3fktkvarg1 = new HashSet(0);
	private Set eqitmodgrades = new HashSet(0);
	private Set eqitvargrades = new HashSet(0);
	private Set sgprefere3sForSgprefere3fktkvarg5 = new HashSet(0);
	private Set sgprefere3sForSgprefere3fktkvarg4 = new HashSet(0);
	private Set sgprefere3sForSgprefere3fktkvarg3 = new HashSet(0);
	private Set sgprefere3sForSgprefere3fktkvarg2 = new HashSet(0);
	private Set sgprefere3sForSgprefere3fktkvarg8 = new HashSet(0);
	private Set sgprefere3sForSgprefere3fktkvarg7 = new HashSet(0);
	private Set sgprefere3sForSgprefere3fktkvarg6 = new HashSet(0);

	public Eqvargrade() {
	}

	public Eqvargrade(EqvargradeId id, Sgfilial sgfilial, String descvarg,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descvarg = descvarg;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqvargrade(EqvargradeId id, Sgfilial sgfilial, String descvarg,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set sgprefere3sForSgprefere3fktkvarg1,
			Set eqitmodgrades, Set eqitvargrades,
			Set sgprefere3sForSgprefere3fktkvarg5,
			Set sgprefere3sForSgprefere3fktkvarg4,
			Set sgprefere3sForSgprefere3fktkvarg3,
			Set sgprefere3sForSgprefere3fktkvarg2,
			Set sgprefere3sForSgprefere3fktkvarg8,
			Set sgprefere3sForSgprefere3fktkvarg7,
			Set sgprefere3sForSgprefere3fktkvarg6) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descvarg = descvarg;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.sgprefere3sForSgprefere3fktkvarg1 = sgprefere3sForSgprefere3fktkvarg1;
		this.eqitmodgrades = eqitmodgrades;
		this.eqitvargrades = eqitvargrades;
		this.sgprefere3sForSgprefere3fktkvarg5 = sgprefere3sForSgprefere3fktkvarg5;
		this.sgprefere3sForSgprefere3fktkvarg4 = sgprefere3sForSgprefere3fktkvarg4;
		this.sgprefere3sForSgprefere3fktkvarg3 = sgprefere3sForSgprefere3fktkvarg3;
		this.sgprefere3sForSgprefere3fktkvarg2 = sgprefere3sForSgprefere3fktkvarg2;
		this.sgprefere3sForSgprefere3fktkvarg8 = sgprefere3sForSgprefere3fktkvarg8;
		this.sgprefere3sForSgprefere3fktkvarg7 = sgprefere3sForSgprefere3fktkvarg7;
		this.sgprefere3sForSgprefere3fktkvarg6 = sgprefere3sForSgprefere3fktkvarg6;
	}

	public EqvargradeId getId() {
		return this.id;
	}

	public void setId(EqvargradeId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public String getDescvarg() {
		return this.descvarg;
	}

	public void setDescvarg(String descvarg) {
		this.descvarg = descvarg;
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

	public Set getSgprefere3sForSgprefere3fktkvarg1() {
		return this.sgprefere3sForSgprefere3fktkvarg1;
	}

	public void setSgprefere3sForSgprefere3fktkvarg1(
			Set sgprefere3sForSgprefere3fktkvarg1) {
		this.sgprefere3sForSgprefere3fktkvarg1 = sgprefere3sForSgprefere3fktkvarg1;
	}

	public Set getEqitmodgrades() {
		return this.eqitmodgrades;
	}

	public void setEqitmodgrades(Set eqitmodgrades) {
		this.eqitmodgrades = eqitmodgrades;
	}

	public Set getEqitvargrades() {
		return this.eqitvargrades;
	}

	public void setEqitvargrades(Set eqitvargrades) {
		this.eqitvargrades = eqitvargrades;
	}

	public Set getSgprefere3sForSgprefere3fktkvarg5() {
		return this.sgprefere3sForSgprefere3fktkvarg5;
	}

	public void setSgprefere3sForSgprefere3fktkvarg5(
			Set sgprefere3sForSgprefere3fktkvarg5) {
		this.sgprefere3sForSgprefere3fktkvarg5 = sgprefere3sForSgprefere3fktkvarg5;
	}

	public Set getSgprefere3sForSgprefere3fktkvarg4() {
		return this.sgprefere3sForSgprefere3fktkvarg4;
	}

	public void setSgprefere3sForSgprefere3fktkvarg4(
			Set sgprefere3sForSgprefere3fktkvarg4) {
		this.sgprefere3sForSgprefere3fktkvarg4 = sgprefere3sForSgprefere3fktkvarg4;
	}

	public Set getSgprefere3sForSgprefere3fktkvarg3() {
		return this.sgprefere3sForSgprefere3fktkvarg3;
	}

	public void setSgprefere3sForSgprefere3fktkvarg3(
			Set sgprefere3sForSgprefere3fktkvarg3) {
		this.sgprefere3sForSgprefere3fktkvarg3 = sgprefere3sForSgprefere3fktkvarg3;
	}

	public Set getSgprefere3sForSgprefere3fktkvarg2() {
		return this.sgprefere3sForSgprefere3fktkvarg2;
	}

	public void setSgprefere3sForSgprefere3fktkvarg2(
			Set sgprefere3sForSgprefere3fktkvarg2) {
		this.sgprefere3sForSgprefere3fktkvarg2 = sgprefere3sForSgprefere3fktkvarg2;
	}

	public Set getSgprefere3sForSgprefere3fktkvarg8() {
		return this.sgprefere3sForSgprefere3fktkvarg8;
	}

	public void setSgprefere3sForSgprefere3fktkvarg8(
			Set sgprefere3sForSgprefere3fktkvarg8) {
		this.sgprefere3sForSgprefere3fktkvarg8 = sgprefere3sForSgprefere3fktkvarg8;
	}

	public Set getSgprefere3sForSgprefere3fktkvarg7() {
		return this.sgprefere3sForSgprefere3fktkvarg7;
	}

	public void setSgprefere3sForSgprefere3fktkvarg7(
			Set sgprefere3sForSgprefere3fktkvarg7) {
		this.sgprefere3sForSgprefere3fktkvarg7 = sgprefere3sForSgprefere3fktkvarg7;
	}

	public Set getSgprefere3sForSgprefere3fktkvarg6() {
		return this.sgprefere3sForSgprefere3fktkvarg6;
	}

	public void setSgprefere3sForSgprefere3fktkvarg6(
			Set sgprefere3sForSgprefere3fktkvarg6) {
		this.sgprefere3sForSgprefere3fktkvarg6 = sgprefere3sForSgprefere3fktkvarg6;
	}

}
