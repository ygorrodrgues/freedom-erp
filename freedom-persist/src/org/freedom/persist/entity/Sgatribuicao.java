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
 * Sgatribuicao generated by hbm2java
 */
@Entity
@Table(name = "SGATRIBUICAO")
public class Sgatribuicao implements java.io.Serializable {

	private SgatribuicaoId id;
	private Sgfilial sgfilial;
	private String descatrib;
	private String rmaatrib;
	private String obsatrib;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set sgatribusus = new HashSet(0);

	public Sgatribuicao() {
	}

	public Sgatribuicao(SgatribuicaoId id, Sgfilial sgfilial, String descatrib,
			String rmaatrib, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descatrib = descatrib;
		this.rmaatrib = rmaatrib;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgatribuicao(SgatribuicaoId id, Sgfilial sgfilial, String descatrib,
			String rmaatrib, String obsatrib, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set sgatribusus) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descatrib = descatrib;
		this.rmaatrib = rmaatrib;
		this.obsatrib = obsatrib;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.sgatribusus = sgatribusus;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idatrib", column = @Column(name = "IDATRIB", nullable = false, length = 10)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public SgatribuicaoId getId() {
		return this.id;
	}

	public void setId(SgatribuicaoId id) {
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

	@Column(name = "DESCATRIB", nullable = false, length = 50)
	public String getDescatrib() {
		return this.descatrib;
	}

	public void setDescatrib(String descatrib) {
		this.descatrib = descatrib;
	}

	@Column(name = "RMAATRIB", nullable = false, length = 2)
	public String getRmaatrib() {
		return this.rmaatrib;
	}

	public void setRmaatrib(String rmaatrib) {
		this.rmaatrib = rmaatrib;
	}

	@Column(name = "OBSATRIB", length = 500)
	public String getObsatrib() {
		return this.obsatrib;
	}

	public void setObsatrib(String obsatrib) {
		this.obsatrib = obsatrib;
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

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "sgatribuicao")
	public Set getSgatribusus() {
		return this.sgatribusus;
	}

	public void setSgatribusus(Set sgatribusus) {
		this.sgatribusus = sgatribusus;
	}
*/
}
