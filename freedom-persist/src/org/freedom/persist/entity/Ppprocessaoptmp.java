package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

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
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Ppprocessaoptmp generated by hbm2java
 */
@Entity
@Table(name = "PPPROCESSAOPTMP")
public class Ppprocessaoptmp implements java.io.Serializable {

	private PpprocessaoptmpId id;
	private Sgestacao sgestacao;
	private Vditorcamento vditorcamento;
	private Date dtfabrop;
	private BigDecimal qtdaprod;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Ppprocessaoptmp() {
	}

	public Ppprocessaoptmp(Sgestacao sgestacao, Vditorcamento vditorcamento,
			Date dtfabrop, BigDecimal qtdaprod, Date dtins, Date hins,
			String idusuins) {
		this.sgestacao = sgestacao;
		this.vditorcamento = vditorcamento;
		this.dtfabrop = dtfabrop;
		this.qtdaprod = qtdaprod;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Ppprocessaoptmp(Sgestacao sgestacao, Vditorcamento vditorcamento,
			Date dtfabrop, BigDecimal qtdaprod, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.sgestacao = sgestacao;
		this.vditorcamento = vditorcamento;
		this.dtfabrop = dtfabrop;
		this.qtdaprod = qtdaprod;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codorc", column = @Column(name = "CODORC", nullable = false)),
			@AttributeOverride(name = "coditorc", column = @Column(name = "CODITORC", nullable = false)),
			@AttributeOverride(name = "tipoorc", column = @Column(name = "TIPOORC", nullable = false, length = 1)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public PpprocessaoptmpId getId() {
		return this.id;
	}

	public void setId(PpprocessaoptmpId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODEST", referencedColumnName = "CODEST", nullable = false),
			@JoinColumn(name = "CODFILIALET", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPET", referencedColumnName = "CODEMP", nullable = false) })
	public Sgestacao getSgestacao() {
		return this.sgestacao;
	}

	public void setSgestacao(Sgestacao sgestacao) {
		this.sgestacao = sgestacao;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Vditorcamento getVditorcamento() {
		return this.vditorcamento;
	}

	public void setVditorcamento(Vditorcamento vditorcamento) {
		this.vditorcamento = vditorcamento;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTFABROP", nullable = false, length = 10)
	public Date getDtfabrop() {
		return this.dtfabrop;
	}

	public void setDtfabrop(Date dtfabrop) {
		this.dtfabrop = dtfabrop;
	}

	@Column(name = "QTDAPROD", nullable = false, precision = 15, scale = 5)
	public BigDecimal getQtdaprod() {
		return this.qtdaprod;
	}

	public void setQtdaprod(BigDecimal qtdaprod) {
		this.qtdaprod = qtdaprod;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTINS", nullable = false, length = 10)
	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HINS", nullable = false, length = 8)
	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	@Column(name = "IDUSUINS", nullable = false, length = 8)
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
