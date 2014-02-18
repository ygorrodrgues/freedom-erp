package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Lffretevenda generated by hbm2java
 */
public class Lffretevenda implements java.io.Serializable {

	private LffretevendaId id;
	private Lffrete lffrete;
	private Vdvenda vdvenda;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Lffretevenda() {
	}

	public Lffretevenda(LffretevendaId id, Lffrete lffrete, Vdvenda vdvenda,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.lffrete = lffrete;
		this.vdvenda = vdvenda;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Lffretevenda(LffretevendaId id, Lffrete lffrete, Vdvenda vdvenda,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.lffrete = lffrete;
		this.vdvenda = vdvenda;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public LffretevendaId getId() {
		return this.id;
	}

	public void setId(LffretevendaId id) {
		this.id = id;
	}

	public Lffrete getLffrete() {
		return this.lffrete;
	}

	public void setLffrete(Lffrete lffrete) {
		this.lffrete = lffrete;
	}

	public Vdvenda getVdvenda() {
		return this.vdvenda;
	}

	public void setVdvenda(Vdvenda vdvenda) {
		this.vdvenda = vdvenda;
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
