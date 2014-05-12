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
 * Eqmarca generated by hbm2java
 */
@Entity
@Table(name = "EQMARCA")
public class Eqmarca implements java.io.Serializable {

	private EqmarcaId id;
	private Sgfilial sgfilial;
	private String descmarca;
	private String siglamarca;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set sgprefere1s = new HashSet(0);
	private Set eqprodutos = new HashSet(0);

	public Eqmarca() {
	}

	public Eqmarca(EqmarcaId id, Sgfilial sgfilial, String descmarca,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descmarca = descmarca;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqmarca(EqmarcaId id, Sgfilial sgfilial, String descmarca,
			String siglamarca, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt, Set sgprefere1s,
			Set eqprodutos) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descmarca = descmarca;
		this.siglamarca = siglamarca;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.sgprefere1s = sgprefere1s;
		this.eqprodutos = eqprodutos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codmarca", column = @Column(name = "CODMARCA", nullable = false, length = 6)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public EqmarcaId getId() {
		return this.id;
	}

	public void setId(EqmarcaId id) {
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

	@Column(name = "DESCMARCA", nullable = false, length = 40)
	public String getDescmarca() {
		return this.descmarca;
	}

	public void setDescmarca(String descmarca) {
		this.descmarca = descmarca;
	}

	@Column(name = "SIGLAMARCA", length = 20)
	public String getSiglamarca() {
		return this.siglamarca;
	}

	public void setSiglamarca(String siglamarca) {
		this.siglamarca = siglamarca;
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

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqmarca")
	public Set getSgprefere1s() {
		return this.sgprefere1s;
	}

	public void setSgprefere1s(Set sgprefere1s) {
		this.sgprefere1s = sgprefere1s;
	}
*/
	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqmarca")
	public Set getEqprodutos() {
		return this.eqprodutos;
	}

	public void setEqprodutos(Set eqprodutos) {
		this.eqprodutos = eqprodutos;
	}
*/
}
