package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

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
 * Vdromaneio generated by hbm2java
 */
@Entity
@Table(name = "VDROMANEIO")
public class Vdromaneio implements java.io.Serializable {

	private VdromaneioId id;
	private Sgfilial sgfilial;
	private Eqexpedicao eqexpedicao;
	private Vdtransp vdtransp;
	private Date dataroma;
	private Date dtsaidaroma;
	private Date dtprevroma;
	private Date dtentregaroma;
	private String statusroma;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set eqexpedicaos = new HashSet(0);
	private Set vditromaneios = new HashSet(0);

	public Vdromaneio() {
	}

	public Vdromaneio(VdromaneioId id, Sgfilial sgfilial, Date dataroma,
			Date dtsaidaroma, Date dtprevroma, String statusroma, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.dataroma = dataroma;
		this.dtsaidaroma = dtsaidaroma;
		this.dtprevroma = dtprevroma;
		this.statusroma = statusroma;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdromaneio(VdromaneioId id, Sgfilial sgfilial,
			Eqexpedicao eqexpedicao, Vdtransp vdtransp, Date dataroma,
			Date dtsaidaroma, Date dtprevroma, Date dtentregaroma,
			String statusroma, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt, Set eqexpedicaos,
			Set vditromaneios) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.eqexpedicao = eqexpedicao;
		this.vdtransp = vdtransp;
		this.dataroma = dataroma;
		this.dtsaidaroma = dtsaidaroma;
		this.dtprevroma = dtprevroma;
		this.dtentregaroma = dtentregaroma;
		this.statusroma = statusroma;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.eqexpedicaos = eqexpedicaos;
		this.vditromaneios = vditromaneios;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codroma", column = @Column(name = "CODROMA", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public VdromaneioId getId() {
		return this.id;
	}

	public void setId(VdromaneioId id) {
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "TICKET", referencedColumnName = "TICKET"),
			@JoinColumn(name = "CODFILIALEX", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPEX", referencedColumnName = "CODEMP") })
	public Eqexpedicao getEqexpedicao() {
		return this.eqexpedicao;
	}

	public void setEqexpedicao(Eqexpedicao eqexpedicao) {
		this.eqexpedicao = eqexpedicao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTRAN", referencedColumnName = "CODTRAN"),
			@JoinColumn(name = "CODFILIALTN", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTN", referencedColumnName = "CODEMP") })
	public Vdtransp getVdtransp() {
		return this.vdtransp;
	}

	public void setVdtransp(Vdtransp vdtransp) {
		this.vdtransp = vdtransp;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATAROMA", nullable = false, length = 10)
	public Date getDataroma() {
		return this.dataroma;
	}

	public void setDataroma(Date dataroma) {
		this.dataroma = dataroma;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTSAIDAROMA", nullable = false, length = 10)
	public Date getDtsaidaroma() {
		return this.dtsaidaroma;
	}

	public void setDtsaidaroma(Date dtsaidaroma) {
		this.dtsaidaroma = dtsaidaroma;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTPREVROMA", nullable = false, length = 10)
	public Date getDtprevroma() {
		return this.dtprevroma;
	}

	public void setDtprevroma(Date dtprevroma) {
		this.dtprevroma = dtprevroma;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTENTREGAROMA", length = 10)
	public Date getDtentregaroma() {
		return this.dtentregaroma;
	}

	public void setDtentregaroma(Date dtentregaroma) {
		this.dtentregaroma = dtentregaroma;
	}

	@Column(name = "STATUSROMA", nullable = false, length = 2)
	public String getStatusroma() {
		return this.statusroma;
	}

	public void setStatusroma(String statusroma) {
		this.statusroma = statusroma;
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

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdromaneio")
	public Set getEqexpedicaos() {
		return this.eqexpedicaos;
	}

	public void setEqexpedicaos(Set eqexpedicaos) {
		this.eqexpedicaos = eqexpedicaos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdromaneio")
	public Set getVditromaneios() {
		return this.vditromaneios;
	}

	public void setVditromaneios(Set vditromaneios) {
		this.vditromaneios = vditromaneios;
	}
*/
}
