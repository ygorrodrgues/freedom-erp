package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * Sgprefere6Id generated by hbm2java
 */
public class Sgprefere6Id implements java.io.Serializable {

	private short codfilial;
	private int codemp;

	public Sgprefere6Id() {
	}

	public Sgprefere6Id(short codfilial, int codemp) {
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Sgprefere6Id))
			return false;
		Sgprefere6Id castOther = (Sgprefere6Id) other;

		return (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
