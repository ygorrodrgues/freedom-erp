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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Cpdevolucao generated by hbm2java
 */
@Entity
@Table(name = "CPDEVOLUCAO")
public class Cpdevolucao implements java.io.Serializable {

	private CpdevolucaoId id;
	private Vditvenda vditvenda;
	private Cpitcompra cpitcompra;
	private BigDecimal qtddev;
	private String idusualt;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;

	public Cpdevolucao() {
	}

	public Cpdevolucao(CpdevolucaoId id, Vditvenda vditvenda,
			Cpitcompra cpitcompra, BigDecimal qtddev, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.vditvenda = vditvenda;
		this.cpitcompra = cpitcompra;
		this.qtddev = qtddev;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Cpdevolucao(CpdevolucaoId id, Vditvenda vditvenda,
			Cpitcompra cpitcompra, BigDecimal qtddev, String idusualt,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt) {
		this.id = id;
		this.vditvenda = vditvenda;
		this.cpitcompra = cpitcompra;
		this.qtddev = qtddev;
		this.idusualt = idusualt;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "coditcompra", column = @Column(name = "CODITCOMPRA", nullable = false)),
			@AttributeOverride(name = "codcompra", column = @Column(name = "CODCOMPRA", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)),
			@AttributeOverride(name = "codvenda", column = @Column(name = "CODVENDA", nullable = false)),
			@AttributeOverride(name = "coditvenda", column = @Column(name = "CODITVENDA", nullable = false)),
			@AttributeOverride(name = "tipovenda", column = @Column(name = "TIPOVENDA", nullable = false, length = 1)),
			@AttributeOverride(name = "codfilialvd", column = @Column(name = "CODFILIALVD", nullable = false)),
			@AttributeOverride(name = "codempvd", column = @Column(name = "CODEMPVD", nullable = false)) })
	public CpdevolucaoId getId() {
		return this.id;
	}

	public void setId(CpdevolucaoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVENDA", referencedColumnName = "CODVENDA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODITVENDA", referencedColumnName = "CODITVENDA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "TIPOVENDA", referencedColumnName = "TIPOVENDA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Vditvenda getVditvenda() {
		return this.vditvenda;
	}

	public void setVditvenda(Vditvenda vditvenda) {
		this.vditvenda = vditvenda;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCOMPRA", referencedColumnName = "CODCOMPRA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODITCOMPRA", referencedColumnName = "CODITCOMPRA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALVD", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPVD", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Cpitcompra getCpitcompra() {
		return this.cpitcompra;
	}

	public void setCpitcompra(Cpitcompra cpitcompra) {
		this.cpitcompra = cpitcompra;
	}

	@Column(name = "QTDDEV", nullable = false, precision = 15, scale = 5)
	public BigDecimal getQtddev() {
		return this.qtddev;
	}

	public void setQtddev(BigDecimal qtddev) {
		this.qtddev = qtddev;
	}

	@Column(name = "IDUSUALT", length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
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

}
