package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cptipofor generated by hbm2java
 */
public class Cptipofor implements java.io.Serializable {

	private CptipoforId id;
	private Sgfilial sgfilial;
	private String desctipofor;
	private Character retencaoinss;
	private BigDecimal percbaseinss;
	private Character retencaooutros;
	private BigDecimal percretoutros;
	private Character retencaoirrf;
	private BigDecimal percbaseirrf;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set cpforneceds = new HashSet(0);
	private Set sgprefere1s = new HashSet(0);

	public Cptipofor() {
	}

	public Cptipofor(CptipoforId id, Sgfilial sgfilial, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Cptipofor(CptipoforId id, Sgfilial sgfilial, String desctipofor,
			Character retencaoinss, BigDecimal percbaseinss,
			Character retencaooutros, BigDecimal percretoutros,
			Character retencaoirrf, BigDecimal percbaseirrf, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set cpforneceds, Set sgprefere1s) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.desctipofor = desctipofor;
		this.retencaoinss = retencaoinss;
		this.percbaseinss = percbaseinss;
		this.retencaooutros = retencaooutros;
		this.percretoutros = percretoutros;
		this.retencaoirrf = retencaoirrf;
		this.percbaseirrf = percbaseirrf;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.cpforneceds = cpforneceds;
		this.sgprefere1s = sgprefere1s;
	}

	public CptipoforId getId() {
		return this.id;
	}

	public void setId(CptipoforId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public String getDesctipofor() {
		return this.desctipofor;
	}

	public void setDesctipofor(String desctipofor) {
		this.desctipofor = desctipofor;
	}

	public Character getRetencaoinss() {
		return this.retencaoinss;
	}

	public void setRetencaoinss(Character retencaoinss) {
		this.retencaoinss = retencaoinss;
	}

	public BigDecimal getPercbaseinss() {
		return this.percbaseinss;
	}

	public void setPercbaseinss(BigDecimal percbaseinss) {
		this.percbaseinss = percbaseinss;
	}

	public Character getRetencaooutros() {
		return this.retencaooutros;
	}

	public void setRetencaooutros(Character retencaooutros) {
		this.retencaooutros = retencaooutros;
	}

	public BigDecimal getPercretoutros() {
		return this.percretoutros;
	}

	public void setPercretoutros(BigDecimal percretoutros) {
		this.percretoutros = percretoutros;
	}

	public Character getRetencaoirrf() {
		return this.retencaoirrf;
	}

	public void setRetencaoirrf(Character retencaoirrf) {
		this.retencaoirrf = retencaoirrf;
	}

	public BigDecimal getPercbaseirrf() {
		return this.percbaseirrf;
	}

	public void setPercbaseirrf(BigDecimal percbaseirrf) {
		this.percbaseirrf = percbaseirrf;
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

	public Set getCpforneceds() {
		return this.cpforneceds;
	}

	public void setCpforneceds(Set cpforneceds) {
		this.cpforneceds = cpforneceds;
	}

	public Set getSgprefere1s() {
		return this.sgprefere1s;
	}

	public void setSgprefere1s(Set sgprefere1s) {
		this.sgprefere1s = sgprefere1s;
	}

}
