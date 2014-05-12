package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

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
 * Tkhistorico generated by hbm2java
 */
@Entity
@Table(name = "TKHISTORICO")
public class Tkhistorico implements java.io.Serializable {

	private TkhistoricoId id;
	private Tksitcamp tksitcamp;
	private Atatendente atatendente;
	private Tkcontato tkcontato;
	private Vdcliente vdcliente;
	private Date datahisttk;
	private Date horahisttk;
	private String deschisttk;
	private String sithisttk;
	private Character tipohisttk;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Tkhistorico() {
	}

	public Tkhistorico(TkhistoricoId id, Atatendente atatendente,
			Date datahisttk, Date horahisttk, String deschisttk,
			String sithisttk, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.atatendente = atatendente;
		this.datahisttk = datahisttk;
		this.horahisttk = horahisttk;
		this.deschisttk = deschisttk;
		this.sithisttk = sithisttk;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Tkhistorico(TkhistoricoId id, Tksitcamp tksitcamp,
			Atatendente atatendente, Tkcontato tkcontato, Vdcliente vdcliente,
			Date datahisttk, Date horahisttk, String deschisttk,
			String sithisttk, Character tipohisttk, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.tksitcamp = tksitcamp;
		this.atatendente = atatendente;
		this.tkcontato = tkcontato;
		this.vdcliente = vdcliente;
		this.datahisttk = datahisttk;
		this.horahisttk = horahisttk;
		this.deschisttk = deschisttk;
		this.sithisttk = sithisttk;
		this.tipohisttk = tipohisttk;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codhisttk", column = @Column(name = "CODHISTTK", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public TkhistoricoId getId() {
		return this.id;
	}

	public void setId(TkhistoricoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCAMP", referencedColumnName = "CODCAMP"),
			@JoinColumn(name = "SEQSITCAMP", referencedColumnName = "SEQSITCAMP"),
			@JoinColumn(name = "TIPOCTO", referencedColumnName = "TIPOCTO"),
			@JoinColumn(name = "CODFILIALCA", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCA", referencedColumnName = "CODEMP") })
	public Tksitcamp getTksitcamp() {
		return this.tksitcamp;
	}

	public void setTksitcamp(Tksitcamp tksitcamp) {
		this.tksitcamp = tksitcamp;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODATEND", referencedColumnName = "CODATEND", nullable = false),
			@JoinColumn(name = "CODFILIALAE", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPAE", referencedColumnName = "CODEMP", nullable = false) })
	public Atatendente getAtatendente() {
		return this.atatendente;
	}

	public void setAtatendente(Atatendente atatendente) {
		this.atatendente = atatendente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCTO", referencedColumnName = "CODCTO"),
			@JoinColumn(name = "CODFILIALCO", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCO", referencedColumnName = "CODEMP") })
	public Tkcontato getTkcontato() {
		return this.tkcontato;
	}

	public void setTkcontato(Tkcontato tkcontato) {
		this.tkcontato = tkcontato;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCLI", referencedColumnName = "CODCLI"),
			@JoinColumn(name = "CODFILIALCL", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCL", referencedColumnName = "CODEMP") })
	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATAHISTTK", nullable = false, length = 10)
	public Date getDatahisttk() {
		return this.datahisttk;
	}

	public void setDatahisttk(Date datahisttk) {
		this.datahisttk = datahisttk;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HORAHISTTK", nullable = false, length = 8)
	public Date getHorahisttk() {
		return this.horahisttk;
	}

	public void setHorahisttk(Date horahisttk) {
		this.horahisttk = horahisttk;
	}

	@Column(name = "DESCHISTTK", nullable = false, length = 10000)
	public String getDeschisttk() {
		return this.deschisttk;
	}

	public void setDeschisttk(String deschisttk) {
		this.deschisttk = deschisttk;
	}

	@Column(name = "SITHISTTK", nullable = false, length = 2)
	public String getSithisttk() {
		return this.sithisttk;
	}

	public void setSithisttk(String sithisttk) {
		this.sithisttk = sithisttk;
	}

	@Column(name = "TIPOHISTTK", length = 1)
	public Character getTipohisttk() {
		return this.tipohisttk;
	}

	public void setTipohisttk(Character tipohisttk) {
		this.tipohisttk = tipohisttk;
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
