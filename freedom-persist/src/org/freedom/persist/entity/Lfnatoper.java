package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Lfnatoper generated by hbm2java
 */
public class Lfnatoper implements java.io.Serializable {

	private LfnatoperId id;
	private Sgfilial sgfilial;
	private String descnat;
	private char impdtsaidanat;
	private BigDecimal aliqenat;
	private BigDecimal aliqfnat;
	private String txtnat;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set lfitregrafiscals = new HashSet(0);
	private Set lffretes = new HashSet(0);
	private Set cpequivcfopsForCpequivcfopfklfnan = new HashSet(0);
	private Set cpitcompras = new HashSet(0);
	private Set vditvendas = new HashSet(0);
	private Set lflivrofiscals = new HashSet(0);
	private Cpequivcfop cpequivcfopByCpequivcfopfklfnat;

	public Lfnatoper() {
	}

	public Lfnatoper(LfnatoperId id, Sgfilial sgfilial, String descnat,
			char impdtsaidanat, BigDecimal aliqenat, BigDecimal aliqfnat,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descnat = descnat;
		this.impdtsaidanat = impdtsaidanat;
		this.aliqenat = aliqenat;
		this.aliqfnat = aliqfnat;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Lfnatoper(LfnatoperId id, Sgfilial sgfilial, String descnat,
			char impdtsaidanat, BigDecimal aliqenat, BigDecimal aliqfnat,
			String txtnat, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, String idusualt, Set lfitregrafiscals, Set lffretes,
			Set cpequivcfopsForCpequivcfopfklfnan, Set cpitcompras,
			Set vditvendas, Set lflivrofiscals,
			Cpequivcfop cpequivcfopByCpequivcfopfklfnat) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descnat = descnat;
		this.impdtsaidanat = impdtsaidanat;
		this.aliqenat = aliqenat;
		this.aliqfnat = aliqfnat;
		this.txtnat = txtnat;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.lfitregrafiscals = lfitregrafiscals;
		this.lffretes = lffretes;
		this.cpequivcfopsForCpequivcfopfklfnan = cpequivcfopsForCpequivcfopfklfnan;
		this.cpitcompras = cpitcompras;
		this.vditvendas = vditvendas;
		this.lflivrofiscals = lflivrofiscals;
		this.cpequivcfopByCpequivcfopfklfnat = cpequivcfopByCpequivcfopfklfnat;
	}

	public LfnatoperId getId() {
		return this.id;
	}

	public void setId(LfnatoperId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public String getDescnat() {
		return this.descnat;
	}

	public void setDescnat(String descnat) {
		this.descnat = descnat;
	}

	public char getImpdtsaidanat() {
		return this.impdtsaidanat;
	}

	public void setImpdtsaidanat(char impdtsaidanat) {
		this.impdtsaidanat = impdtsaidanat;
	}

	public BigDecimal getAliqenat() {
		return this.aliqenat;
	}

	public void setAliqenat(BigDecimal aliqenat) {
		this.aliqenat = aliqenat;
	}

	public BigDecimal getAliqfnat() {
		return this.aliqfnat;
	}

	public void setAliqfnat(BigDecimal aliqfnat) {
		this.aliqfnat = aliqfnat;
	}

	public String getTxtnat() {
		return this.txtnat;
	}

	public void setTxtnat(String txtnat) {
		this.txtnat = txtnat;
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

	public Set getLfitregrafiscals() {
		return this.lfitregrafiscals;
	}

	public void setLfitregrafiscals(Set lfitregrafiscals) {
		this.lfitregrafiscals = lfitregrafiscals;
	}

	public Set getLffretes() {
		return this.lffretes;
	}

	public void setLffretes(Set lffretes) {
		this.lffretes = lffretes;
	}

	public Set getCpequivcfopsForCpequivcfopfklfnan() {
		return this.cpequivcfopsForCpequivcfopfklfnan;
	}

	public void setCpequivcfopsForCpequivcfopfklfnan(
			Set cpequivcfopsForCpequivcfopfklfnan) {
		this.cpequivcfopsForCpequivcfopfklfnan = cpequivcfopsForCpequivcfopfklfnan;
	}

	public Set getCpitcompras() {
		return this.cpitcompras;
	}

	public void setCpitcompras(Set cpitcompras) {
		this.cpitcompras = cpitcompras;
	}

	public Set getVditvendas() {
		return this.vditvendas;
	}

	public void setVditvendas(Set vditvendas) {
		this.vditvendas = vditvendas;
	}

	public Set getLflivrofiscals() {
		return this.lflivrofiscals;
	}

	public void setLflivrofiscals(Set lflivrofiscals) {
		this.lflivrofiscals = lflivrofiscals;
	}

	public Cpequivcfop getCpequivcfopByCpequivcfopfklfnat() {
		return this.cpequivcfopByCpequivcfopfklfnat;
	}

	public void setCpequivcfopByCpequivcfopfklfnat(
			Cpequivcfop cpequivcfopByCpequivcfopfklfnat) {
		this.cpequivcfopByCpequivcfopfklfnat = cpequivcfopByCpequivcfopfklfnat;
	}

}
