package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Sgferiado generated by hbm2java
 */
@Entity
@Table(name = "SGFERIADO")
public class Sgferiado implements java.io.Serializable {

	private SgferiadoId id;
	private String descfer;
	private char bancfer;
	private char trabfer;
	private char optfer;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Sgferiado() {
	}

	public Sgferiado(SgferiadoId id, String descfer, char bancfer,
			char trabfer, char optfer, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.descfer = descfer;
		this.bancfer = bancfer;
		this.trabfer = trabfer;
		this.optfer = optfer;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "datafer", column = @Column(name = "DATAFER", nullable = false, length = 10)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public SgferiadoId getId() {
		return this.id;
	}

	public void setId(SgferiadoId id) {
		this.id = id;
	}

	@Column(name = "DESCFER", nullable = false, length = 50)
	public String getDescfer() {
		return this.descfer;
	}

	public void setDescfer(String descfer) {
		this.descfer = descfer;
	}

	@Column(name = "BANCFER", nullable = false, length = 1)
	public char getBancfer() {
		return this.bancfer;
	}

	public void setBancfer(char bancfer) {
		this.bancfer = bancfer;
	}

	@Column(name = "TRABFER", nullable = false, length = 1)
	public char getTrabfer() {
		return this.trabfer;
	}

	public void setTrabfer(char trabfer) {
		this.trabfer = trabfer;
	}

	@Column(name = "OPTFER", nullable = false, length = 1)
	public char getOptfer() {
		return this.optfer;
	}

	public void setOptfer(char optfer) {
		this.optfer = optfer;
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

	@Column(name = "IDUSUINS", nullable = false, length = 128)
	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTALT", nullable = false, length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", nullable = false, length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", nullable = false, length = 128)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

}
