package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Vdregcomisdesc generated by hbm2java
 */
@Entity
@Table(name = "VDREGCOMISDESC")
public class Vdregcomisdesc implements java.io.Serializable {

	private VdregcomisdescId id;
	private Sgfilial sgfilial;
	private String descregcomisdesc;
	private BigDecimal desconto;
	private BigDecimal comissao;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Vdregcomisdesc() {
	}

	public Vdregcomisdesc(VdregcomisdescId id, Sgfilial sgfilial) {
		this.id = id;
		this.sgfilial = sgfilial;
	}

	public Vdregcomisdesc(VdregcomisdescId id, Sgfilial sgfilial,
			String descregcomisdesc, BigDecimal desconto, BigDecimal comissao,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descregcomisdesc = descregcomisdesc;
		this.desconto = desconto;
		this.comissao = comissao;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codregcomisdesc", column = @Column(name = "CODREGCOMISDESC", nullable = false)) })
	public VdregcomisdescId getId() {
		return this.id;
	}

	public void setId(VdregcomisdescId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	@Column(name = "DESCREGCOMISDESC", length = 100)
	public String getDescregcomisdesc() {
		return this.descregcomisdesc;
	}

	public void setDescregcomisdesc(String descregcomisdesc) {
		this.descregcomisdesc = descregcomisdesc;
	}

	@Column(name = "DESCONTO", precision = 15)
	public BigDecimal getDesconto() {
		return this.desconto;
	}

	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}

	@Column(name = "COMISSAO", precision = 15)
	public BigDecimal getComissao() {
		return this.comissao;
	}

	public void setComissao(BigDecimal comissao) {
		this.comissao = comissao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTINS", length = 10)
	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HINS", length = 8)
	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	@Column(name = "IDUSUINS", length = 8)
	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTALT", length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

}
