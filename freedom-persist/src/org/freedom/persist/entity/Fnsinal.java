package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Fnsinal generated by hbm2java
 */
public class Fnsinal implements java.io.Serializable {

	private FnsinalId id;
	private String descsinal;
	private int corsinal;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set fnitrecebers = new HashSet(0);
	private Set fnitpagars = new HashSet(0);
	private Set fnlancas = new HashSet(0);

	public Fnsinal() {
	}

	public Fnsinal(FnsinalId id, String descsinal, int corsinal, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.descsinal = descsinal;
		this.corsinal = corsinal;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Fnsinal(FnsinalId id, String descsinal, int corsinal, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set fnitrecebers, Set fnitpagars, Set fnlancas) {
		this.id = id;
		this.descsinal = descsinal;
		this.corsinal = corsinal;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.fnitrecebers = fnitrecebers;
		this.fnitpagars = fnitpagars;
		this.fnlancas = fnlancas;
	}

	public FnsinalId getId() {
		return this.id;
	}

	public void setId(FnsinalId id) {
		this.id = id;
	}

	public String getDescsinal() {
		return this.descsinal;
	}

	public void setDescsinal(String descsinal) {
		this.descsinal = descsinal;
	}

	public int getCorsinal() {
		return this.corsinal;
	}

	public void setCorsinal(int corsinal) {
		this.corsinal = corsinal;
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

	public Set getFnitrecebers() {
		return this.fnitrecebers;
	}

	public void setFnitrecebers(Set fnitrecebers) {
		this.fnitrecebers = fnitrecebers;
	}

	public Set getFnitpagars() {
		return this.fnitpagars;
	}

	public void setFnitpagars(Set fnitpagars) {
		this.fnitpagars = fnitpagars;
	}

	public Set getFnlancas() {
		return this.fnlancas;
	}

	public void setFnlancas(Set fnlancas) {
		this.fnlancas = fnlancas;
	}

}
