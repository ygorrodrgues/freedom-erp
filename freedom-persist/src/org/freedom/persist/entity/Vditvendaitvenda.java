package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Vditvendaitvenda generated by hbm2java
 */
public class Vditvendaitvenda implements java.io.Serializable {

	private long id;
	private Vditvenda vditvendaByVditvendafkitvend1;
	private Vditvenda vditvendaByVditvendafkitvend2;
	private BigDecimal qtditvenda;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Vditvendaitvenda() {
	}

	public Vditvendaitvenda(long id, Vditvenda vditvendaByVditvendafkitvend1,
			Vditvenda vditvendaByVditvendafkitvend2, BigDecimal qtditvenda,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.vditvendaByVditvendafkitvend1 = vditvendaByVditvendafkitvend1;
		this.vditvendaByVditvendafkitvend2 = vditvendaByVditvendafkitvend2;
		this.qtditvenda = qtditvenda;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vditvendaitvenda(long id, Vditvenda vditvendaByVditvendafkitvend1,
			Vditvenda vditvendaByVditvendafkitvend2, BigDecimal qtditvenda,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.vditvendaByVditvendafkitvend1 = vditvendaByVditvendafkitvend1;
		this.vditvendaByVditvendafkitvend2 = vditvendaByVditvendafkitvend2;
		this.qtditvenda = qtditvenda;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Vditvenda getVditvendaByVditvendafkitvend1() {
		return this.vditvendaByVditvendafkitvend1;
	}

	public void setVditvendaByVditvendafkitvend1(
			Vditvenda vditvendaByVditvendafkitvend1) {
		this.vditvendaByVditvendafkitvend1 = vditvendaByVditvendafkitvend1;
	}

	public Vditvenda getVditvendaByVditvendafkitvend2() {
		return this.vditvendaByVditvendafkitvend2;
	}

	public void setVditvendaByVditvendafkitvend2(
			Vditvenda vditvendaByVditvendafkitvend2) {
		this.vditvendaByVditvendafkitvend2 = vditvendaByVditvendafkitvend2;
	}

	public BigDecimal getQtditvenda() {
		return this.qtditvenda;
	}

	public void setQtditvenda(BigDecimal qtditvenda) {
		this.qtditvenda = qtditvenda;
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
