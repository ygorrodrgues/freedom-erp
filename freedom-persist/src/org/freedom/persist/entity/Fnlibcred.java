package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Fnlibcred generated by hbm2java
 */
public class Fnlibcred implements java.io.Serializable {

	private FnlibcredId id;
	private Sgfilial sgfilial;
	private Vdvenda vdvenda;
	private Vdcliente vdcliente;
	private Sgusuario sgusuario;
	private Date dtaemitlcred;
	private BigDecimal vlrautorizlcred;
	private BigDecimal vlrutillcred;
	private BigDecimal vlrvendacred;
	private Date dtautillcred;
	private char sitlcred;
	private Date dtavctolcred;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Fnlibcred() {
	}

	public Fnlibcred(FnlibcredId id, Sgfilial sgfilial, Vdvenda vdvenda,
			Vdcliente vdcliente, Date dtaemitlcred, BigDecimal vlrautorizlcred,
			BigDecimal vlrutillcred, char sitlcred, Date dtavctolcred,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.vdvenda = vdvenda;
		this.vdcliente = vdcliente;
		this.dtaemitlcred = dtaemitlcred;
		this.vlrautorizlcred = vlrautorizlcred;
		this.vlrutillcred = vlrutillcred;
		this.sitlcred = sitlcred;
		this.dtavctolcred = dtavctolcred;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fnlibcred(FnlibcredId id, Sgfilial sgfilial, Vdvenda vdvenda,
			Vdcliente vdcliente, Sgusuario sgusuario, Date dtaemitlcred,
			BigDecimal vlrautorizlcred, BigDecimal vlrutillcred,
			BigDecimal vlrvendacred, Date dtautillcred, char sitlcred,
			Date dtavctolcred, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.vdvenda = vdvenda;
		this.vdcliente = vdcliente;
		this.sgusuario = sgusuario;
		this.dtaemitlcred = dtaemitlcred;
		this.vlrautorizlcred = vlrautorizlcred;
		this.vlrutillcred = vlrutillcred;
		this.vlrvendacred = vlrvendacred;
		this.dtautillcred = dtautillcred;
		this.sitlcred = sitlcred;
		this.dtavctolcred = dtavctolcred;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public FnlibcredId getId() {
		return this.id;
	}

	public void setId(FnlibcredId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Vdvenda getVdvenda() {
		return this.vdvenda;
	}

	public void setVdvenda(Vdvenda vdvenda) {
		this.vdvenda = vdvenda;
	}

	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
	}

	public Sgusuario getSgusuario() {
		return this.sgusuario;
	}

	public void setSgusuario(Sgusuario sgusuario) {
		this.sgusuario = sgusuario;
	}

	public Date getDtaemitlcred() {
		return this.dtaemitlcred;
	}

	public void setDtaemitlcred(Date dtaemitlcred) {
		this.dtaemitlcred = dtaemitlcred;
	}

	public BigDecimal getVlrautorizlcred() {
		return this.vlrautorizlcred;
	}

	public void setVlrautorizlcred(BigDecimal vlrautorizlcred) {
		this.vlrautorizlcred = vlrautorizlcred;
	}

	public BigDecimal getVlrutillcred() {
		return this.vlrutillcred;
	}

	public void setVlrutillcred(BigDecimal vlrutillcred) {
		this.vlrutillcred = vlrutillcred;
	}

	public BigDecimal getVlrvendacred() {
		return this.vlrvendacred;
	}

	public void setVlrvendacred(BigDecimal vlrvendacred) {
		this.vlrvendacred = vlrvendacred;
	}

	public Date getDtautillcred() {
		return this.dtautillcred;
	}

	public void setDtautillcred(Date dtautillcred) {
		this.dtautillcred = dtautillcred;
	}

	public char getSitlcred() {
		return this.sitlcred;
	}

	public void setSitlcred(char sitlcred) {
		this.sitlcred = sitlcred;
	}

	public Date getDtavctolcred() {
		return this.dtavctolcred;
	}

	public void setDtavctolcred(Date dtavctolcred) {
		this.dtavctolcred = dtavctolcred;
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

}
