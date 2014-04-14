package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Vditkit generated by hbm2java
 */
public class Vditkit implements java.io.Serializable {

	private VditkitId id;
	private Eqproduto eqproduto;
	private Vdkit vdkit;
	private String refprod;
	private BigDecimal qtditkit;
	private BigDecimal precoitkit;
	private BigDecimal vlrtotitkit;
	private char emmanut;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Vditkit() {
	}

	public Vditkit(VditkitId id, Eqproduto eqproduto, Vdkit vdkit,
			String refprod, BigDecimal qtditkit, BigDecimal precoitkit,
			BigDecimal vlrtotitkit, char emmanut, Date dtins, Date hins,
			String idusuins, Date halt) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.vdkit = vdkit;
		this.refprod = refprod;
		this.qtditkit = qtditkit;
		this.precoitkit = precoitkit;
		this.vlrtotitkit = vlrtotitkit;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.halt = halt;
	}

	public Vditkit(VditkitId id, Eqproduto eqproduto, Vdkit vdkit,
			String refprod, BigDecimal qtditkit, BigDecimal precoitkit,
			BigDecimal vlrtotitkit, char emmanut, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.vdkit = vdkit;
		this.refprod = refprod;
		this.qtditkit = qtditkit;
		this.precoitkit = precoitkit;
		this.vlrtotitkit = vlrtotitkit;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public VditkitId getId() {
		return this.id;
	}

	public void setId(VditkitId id) {
		this.id = id;
	}

	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	public Vdkit getVdkit() {
		return this.vdkit;
	}

	public void setVdkit(Vdkit vdkit) {
		this.vdkit = vdkit;
	}

	public String getRefprod() {
		return this.refprod;
	}

	public void setRefprod(String refprod) {
		this.refprod = refprod;
	}

	public BigDecimal getQtditkit() {
		return this.qtditkit;
	}

	public void setQtditkit(BigDecimal qtditkit) {
		this.qtditkit = qtditkit;
	}

	public BigDecimal getPrecoitkit() {
		return this.precoitkit;
	}

	public void setPrecoitkit(BigDecimal precoitkit) {
		this.precoitkit = precoitkit;
	}

	public BigDecimal getVlrtotitkit() {
		return this.vlrtotitkit;
	}

	public void setVlrtotitkit(BigDecimal vlrtotitkit) {
		this.vlrtotitkit = vlrtotitkit;
	}

	public char getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(char emmanut) {
		this.emmanut = emmanut;
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
