package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Atconvatrib generated by hbm2java
 */
@Entity
@Table(name = "ATCONVATRIB")
public class Atconvatrib implements java.io.Serializable {

	private AtconvatribId id;
	private Atconveniado atconveniado;
	private Atatribuicao atatribuicao;
	private String obsconvatrib;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Atconvatribtb> atconvatribtbs = new HashSet<Atconvatribtb>(0);

	public Atconvatrib() {
	}

	public Atconvatrib(AtconvatribId id, Atconveniado atconveniado,
			Atatribuicao atatribuicao, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.atconveniado = atconveniado;
		this.atatribuicao = atatribuicao;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Atconvatrib(AtconvatribId id, Atconveniado atconveniado,
			Atatribuicao atatribuicao, String obsconvatrib, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set<Atconvatribtb> atconvatribtbs) {
		this.id = id;
		this.atconveniado = atconveniado;
		this.atatribuicao = atatribuicao;
		this.obsconvatrib = obsconvatrib;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.atconvatribtbs = atconvatribtbs;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codconv", column = @Column(name = "CODCONV", nullable = false)),
			@AttributeOverride(name = "seqconvatrib", column = @Column(name = "SEQCONVATRIB", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public AtconvatribId getId() {
		return this.id;
	}

	public void setId(AtconvatribId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCONV", referencedColumnName = "CODCONV", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Atconveniado getAtconveniado() {
		return this.atconveniado;
	}

	public void setAtconveniado(Atconveniado atconveniado) {
		this.atconveniado = atconveniado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODATRIB", referencedColumnName = "CODATRIB", nullable = false),
			@JoinColumn(name = "CODFILIALAB", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPAB", referencedColumnName = "CODEMP", nullable = false) })
	public Atatribuicao getAtatribuicao() {
		return this.atatribuicao;
	}

	public void setAtatribuicao(Atatribuicao atatribuicao) {
		this.atatribuicao = atatribuicao;
	}

	@Column(name = "OBSCONVATRIB", length = 10000)
	public String getObsconvatrib() {
		return this.obsconvatrib;
	}

	public void setObsconvatrib(String obsconvatrib) {
		this.obsconvatrib = obsconvatrib;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "atconvatrib")
	public Set<Atconvatribtb> getAtconvatribtbs() {
		return this.atconvatribtbs;
	}

	public void setAtconvatribtbs(Set<Atconvatribtb> atconvatribtbs) {
		this.atconvatribtbs = atconvatribtbs;
	}

}
