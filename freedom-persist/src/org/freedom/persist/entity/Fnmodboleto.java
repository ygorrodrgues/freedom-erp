package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Fnmodboleto generated by hbm2java
 */
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

	public FnmodboletoId getId() {
		return this.id;
	}

	public void setId(FnmodboletoId id) {
		this.id = id;
	}

	public Fnconta getFnconta() {
		return this.fnconta;
	}

	public void setFnconta(Fnconta fnconta) {
		this.fnconta = fnconta;
	}

	public String getDescmodbol() {
		return this.descmodbol;
	}

	public void setDescmodbol(String descmodbol) {
		this.descmodbol = descmodbol;
	}

	public String getTxamodbol() {
		return this.txamodbol;
	}

	public void setTxamodbol(String txamodbol) {
		this.txamodbol = txamodbol;
	}

	public char getPreimpmodbol() {
		return this.preimpmodbol;
	}

	public void setPreimpmodbol(char preimpmodbol) {
		this.preimpmodbol = preimpmodbol;
	}

	public String getCartcob() {
		return this.cartcob;
	}

	public void setCartcob(String cartcob) {
		this.cartcob = cartcob;
	}

	public String getMdecob() {
		return this.mdecob;
	}

	public void setMdecob(String mdecob) {
		this.mdecob = mdecob;
	}

	public char getAceitemodbol() {
		return this.aceitemodbol;
	}

	public void setAceitemodbol(char aceitemodbol) {
		this.aceitemodbol = aceitemodbol;
	}

	public String getClassmodbol() {
		return this.classmodbol;
	}

	public void setClassmodbol(String classmodbol) {
		this.classmodbol = classmodbol;
	}

	public String getEspdocmodbol() {
		return this.espdocmodbol;
	}

	public void setEspdocmodbol(String espdocmodbol) {
		this.espdocmodbol = espdocmodbol;
	}

	public String getDesclpmodbol() {
		return this.desclpmodbol;
	}

	public void setDesclpmodbol(String desclpmodbol) {
		this.desclpmodbol = desclpmodbol;
	}

	public String getInstpagmodbol() {
		return this.instpagmodbol;
	}

	public void setInstpagmodbol(String instpagmodbol) {
		this.instpagmodbol = instpagmodbol;
	}

	public char getImpinfoparc() {
		return this.impinfoparc;
	}

	public void setImpinfoparc(char impinfoparc) {
		this.impinfoparc = impinfoparc;
	}

	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	public Set getFnbancos() {
		return this.fnbancos;
	}

	public void setFnbancos(Set fnbancos) {
		this.fnbancos = fnbancos;
	}

	public Set getFnitmodboletos() {
		return this.fnitmodboletos;
	}

	public void setFnitmodboletos(Set fnitmodboletos) {
		this.fnitmodboletos = fnitmodboletos;
	}

}
