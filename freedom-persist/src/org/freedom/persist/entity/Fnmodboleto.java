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
 * Fnmodboleto generated by hbm2java
 */
@Entity
@Table(name = "FNMODBOLETO")
public class Fnmodboleto implements java.io.Serializable {

	private FnmodboletoId id;
	private Fnconta fnconta;
	private String descmodbol;
	private String txamodbol;
	private char preimpmodbol;
	private String cartcob;
	private String mdecob;
	private char aceitemodbol;
	private String classmodbol;
	private String espdocmodbol;
	private String desclpmodbol;
	private String instpagmodbol;
	private char impinfoparc;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set fnbancos = new HashSet(0);
	private Set fnitmodboletos = new HashSet(0);

	public Fnmodboleto() {
	}

	public Fnmodboleto(FnmodboletoId id, String descmodbol, String txamodbol,
			char preimpmodbol, String cartcob, String mdecob,
			char aceitemodbol, char impinfoparc, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.descmodbol = descmodbol;
		this.txamodbol = txamodbol;
		this.preimpmodbol = preimpmodbol;
		this.cartcob = cartcob;
		this.mdecob = mdecob;
		this.aceitemodbol = aceitemodbol;
		this.impinfoparc = impinfoparc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fnmodboleto(FnmodboletoId id, Fnconta fnconta, String descmodbol,
			String txamodbol, char preimpmodbol, String cartcob, String mdecob,
			char aceitemodbol, String classmodbol, String espdocmodbol,
			String desclpmodbol, String instpagmodbol, char impinfoparc,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set fnbancos, Set fnitmodboletos) {
		this.id = id;
		this.fnconta = fnconta;
		this.descmodbol = descmodbol;
		this.txamodbol = txamodbol;
		this.preimpmodbol = preimpmodbol;
		this.cartcob = cartcob;
		this.mdecob = mdecob;
		this.aceitemodbol = aceitemodbol;
		this.classmodbol = classmodbol;
		this.espdocmodbol = espdocmodbol;
		this.desclpmodbol = desclpmodbol;
		this.instpagmodbol = instpagmodbol;
		this.impinfoparc = impinfoparc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.fnbancos = fnbancos;
		this.fnitmodboletos = fnitmodboletos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codmodbol", column = @Column(name = "CODMODBOL", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public FnmodboletoId getId() {
		return this.id;
	}

	public void setId(FnmodboletoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "NUMCONTA", referencedColumnName = "NUMCONTA"),
			@JoinColumn(name = "CODFILIALCC", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCC", referencedColumnName = "CODEMP") })
	public Fnconta getFnconta() {
		return this.fnconta;
	}

	public void setFnconta(Fnconta fnconta) {
		this.fnconta = fnconta;
	}

	@Column(name = "DESCMODBOL", nullable = false, length = 30)
	public String getDescmodbol() {
		return this.descmodbol;
	}

	public void setDescmodbol(String descmodbol) {
		this.descmodbol = descmodbol;
	}

	@Column(name = "TXAMODBOL", nullable = false, length = 10000)
	public String getTxamodbol() {
		return this.txamodbol;
	}

	public void setTxamodbol(String txamodbol) {
		this.txamodbol = txamodbol;
	}

	@Column(name = "PREIMPMODBOL", nullable = false, length = 1)
	public char getPreimpmodbol() {
		return this.preimpmodbol;
	}

	public void setPreimpmodbol(char preimpmodbol) {
		this.preimpmodbol = preimpmodbol;
	}

	@Column(name = "CARTCOB", nullable = false, length = 2)
	public String getCartcob() {
		return this.cartcob;
	}

	public void setCartcob(String cartcob) {
		this.cartcob = cartcob;
	}

	@Column(name = "MDECOB", nullable = false, length = 8)
	public String getMdecob() {
		return this.mdecob;
	}

	public void setMdecob(String mdecob) {
		this.mdecob = mdecob;
	}

	@Column(name = "ACEITEMODBOL", nullable = false, length = 1)
	public char getAceitemodbol() {
		return this.aceitemodbol;
	}

	public void setAceitemodbol(char aceitemodbol) {
		this.aceitemodbol = aceitemodbol;
	}

	@Column(name = "CLASSMODBOL", length = 80)
	public String getClassmodbol() {
		return this.classmodbol;
	}

	public void setClassmodbol(String classmodbol) {
		this.classmodbol = classmodbol;
	}

	@Column(name = "ESPDOCMODBOL", length = 3)
	public String getEspdocmodbol() {
		return this.espdocmodbol;
	}

	public void setEspdocmodbol(String espdocmodbol) {
		this.espdocmodbol = espdocmodbol;
	}

	@Column(name = "DESCLPMODBOL", length = 80)
	public String getDesclpmodbol() {
		return this.desclpmodbol;
	}

	public void setDesclpmodbol(String desclpmodbol) {
		this.desclpmodbol = desclpmodbol;
	}

	@Column(name = "INSTPAGMODBOL", length = 500)
	public String getInstpagmodbol() {
		return this.instpagmodbol;
	}

	public void setInstpagmodbol(String instpagmodbol) {
		this.instpagmodbol = instpagmodbol;
	}

	@Column(name = "IMPINFOPARC", nullable = false, length = 1)
	public char getImpinfoparc() {
		return this.impinfoparc;
	}

	public void setImpinfoparc(char impinfoparc) {
		this.impinfoparc = impinfoparc;
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

/*	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnmodboleto")
	public Set getFnbancos() {
		return this.fnbancos;
	}

	public void setFnbancos(Set fnbancos) {
		this.fnbancos = fnbancos;
	}
*/
/*	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnmodboleto")
	public Set getFnitmodboletos() {
		return this.fnitmodboletos;
	}

	public void setFnitmodboletos(Set fnitmodboletos) {
		this.fnitmodboletos = fnitmodboletos;
	}
*/
}
