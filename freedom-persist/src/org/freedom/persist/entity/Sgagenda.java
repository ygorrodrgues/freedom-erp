package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

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
 * Sgagenda generated by hbm2java
 */
@Entity
@Table(name = "SGAGENDA")
public class Sgagenda implements java.io.Serializable {

	private SgagendaId id;
	private Sgagenda sgagenda;
	private Sgagente sgagente;
	private Date dataagd;
	private Date dtainiagd;
	private Date hriniagd;
	private Date dtafimagd;
	private Date hrfimagd;
	private String assuntoagd;
	private String descagd;
	private short prioragd;
	private String sitagd;
	private String caagd;
	private int codempta;
	private short codfilialta;
	private int codtipoagd;
	private String resolucaomotivo;
	private char diatodo;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Sgagenda> sgagendas = new HashSet<Sgagenda>(0);

	public Sgagenda() {
	}

	public Sgagenda(SgagendaId id, Sgagente sgagente, Date dataagd,
			Date dtainiagd, Date hriniagd, Date dtafimagd, Date hrfimagd,
			String assuntoagd, String descagd, short prioragd, String sitagd,
			String caagd, int codempta, short codfilialta, int codtipoagd,
			char diatodo, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgagente = sgagente;
		this.dataagd = dataagd;
		this.dtainiagd = dtainiagd;
		this.hriniagd = hriniagd;
		this.dtafimagd = dtafimagd;
		this.hrfimagd = hrfimagd;
		this.assuntoagd = assuntoagd;
		this.descagd = descagd;
		this.prioragd = prioragd;
		this.sitagd = sitagd;
		this.caagd = caagd;
		this.codempta = codempta;
		this.codfilialta = codfilialta;
		this.codtipoagd = codtipoagd;
		this.diatodo = diatodo;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgagenda(SgagendaId id, Sgagenda sgagenda, Sgagente sgagente,
			Date dataagd, Date dtainiagd, Date hriniagd, Date dtafimagd,
			Date hrfimagd, String assuntoagd, String descagd, short prioragd,
			String sitagd, String caagd, int codempta, short codfilialta,
			int codtipoagd, String resolucaomotivo, char diatodo, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set<Sgagenda> sgagendas) {
		this.id = id;
		this.sgagenda = sgagenda;
		this.sgagente = sgagente;
		this.dataagd = dataagd;
		this.dtainiagd = dtainiagd;
		this.hriniagd = hriniagd;
		this.dtafimagd = dtafimagd;
		this.hrfimagd = hrfimagd;
		this.assuntoagd = assuntoagd;
		this.descagd = descagd;
		this.prioragd = prioragd;
		this.sitagd = sitagd;
		this.caagd = caagd;
		this.codempta = codempta;
		this.codfilialta = codfilialta;
		this.codtipoagd = codtipoagd;
		this.resolucaomotivo = resolucaomotivo;
		this.diatodo = diatodo;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.sgagendas = sgagendas;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codage", column = @Column(name = "CODAGE", nullable = false)),
			@AttributeOverride(name = "tipoage", column = @Column(name = "TIPOAGE", nullable = false, length = 5)),
			@AttributeOverride(name = "codagd", column = @Column(name = "CODAGD", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public SgagendaId getId() {
		return this.id;
	}

	public void setId(SgagendaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODAGEAR", referencedColumnName = "CODAGE"),
			@JoinColumn(name = "TIPOAGEAR", referencedColumnName = "TIPOAGE"),
			@JoinColumn(name = "CODAGDAR", referencedColumnName = "CODAGD"),
			@JoinColumn(name = "CODFILIALAR", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPAR", referencedColumnName = "CODEMP") })
	public Sgagenda getSgagenda() {
		return this.sgagenda;
	}

	public void setSgagenda(Sgagenda sgagenda) {
		this.sgagenda = sgagenda;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODAGEEMIT", referencedColumnName = "CODAGE", nullable = false),
			@JoinColumn(name = "TIPOAGEEMIT", referencedColumnName = "TIPOAGE", nullable = false),
			@JoinColumn(name = "CODFILIALAE", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPAE", referencedColumnName = "CODEMP", nullable = false) })
	public Sgagente getSgagente() {
		return this.sgagente;
	}

	public void setSgagente(Sgagente sgagente) {
		this.sgagente = sgagente;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATAAGD", nullable = false, length = 10)
	public Date getDataagd() {
		return this.dataagd;
	}

	public void setDataagd(Date dataagd) {
		this.dataagd = dataagd;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTAINIAGD", nullable = false, length = 10)
	public Date getDtainiagd() {
		return this.dtainiagd;
	}

	public void setDtainiagd(Date dtainiagd) {
		this.dtainiagd = dtainiagd;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HRINIAGD", nullable = false, length = 8)
	public Date getHriniagd() {
		return this.hriniagd;
	}

	public void setHriniagd(Date hriniagd) {
		this.hriniagd = hriniagd;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTAFIMAGD", nullable = false, length = 10)
	public Date getDtafimagd() {
		return this.dtafimagd;
	}

	public void setDtafimagd(Date dtafimagd) {
		this.dtafimagd = dtafimagd;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HRFIMAGD", nullable = false, length = 8)
	public Date getHrfimagd() {
		return this.hrfimagd;
	}

	public void setHrfimagd(Date hrfimagd) {
		this.hrfimagd = hrfimagd;
	}

	@Column(name = "ASSUNTOAGD", nullable = false, length = 150)
	public String getAssuntoagd() {
		return this.assuntoagd;
	}

	public void setAssuntoagd(String assuntoagd) {
		this.assuntoagd = assuntoagd;
	}

	@Column(name = "DESCAGD", nullable = false, length = 10000)
	public String getDescagd() {
		return this.descagd;
	}

	public void setDescagd(String descagd) {
		this.descagd = descagd;
	}

	@Column(name = "PRIORAGD", nullable = false)
	public short getPrioragd() {
		return this.prioragd;
	}

	public void setPrioragd(short prioragd) {
		this.prioragd = prioragd;
	}

	@Column(name = "SITAGD", nullable = false, length = 2)
	public String getSitagd() {
		return this.sitagd;
	}

	public void setSitagd(String sitagd) {
		this.sitagd = sitagd;
	}

	@Column(name = "CAAGD", nullable = false, length = 2)
	public String getCaagd() {
		return this.caagd;
	}

	public void setCaagd(String caagd) {
		this.caagd = caagd;
	}

	@Column(name = "CODEMPTA", nullable = false)
	public int getCodempta() {
		return this.codempta;
	}

	public void setCodempta(int codempta) {
		this.codempta = codempta;
	}

	@Column(name = "CODFILIALTA", nullable = false)
	public short getCodfilialta() {
		return this.codfilialta;
	}

	public void setCodfilialta(short codfilialta) {
		this.codfilialta = codfilialta;
	}

	@Column(name = "CODTIPOAGD", nullable = false)
	public int getCodtipoagd() {
		return this.codtipoagd;
	}

	public void setCodtipoagd(int codtipoagd) {
		this.codtipoagd = codtipoagd;
	}

	@Column(name = "RESOLUCAOMOTIVO", length = 10000)
	public String getResolucaomotivo() {
		return this.resolucaomotivo;
	}

	public void setResolucaomotivo(String resolucaomotivo) {
		this.resolucaomotivo = resolucaomotivo;
	}

	@Column(name = "DIATODO", nullable = false, length = 1)
	public char getDiatodo() {
		return this.diatodo;
	}

	public void setDiatodo(char diatodo) {
		this.diatodo = diatodo;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sgagenda")
	public Set<Sgagenda> getSgagendas() {
		return this.sgagendas;
	}

	public void setSgagendas(Set<Sgagenda> sgagendas) {
		this.sgagendas = sgagendas;
	}

}
