package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Fnfluxocaixavw01 generated by hbm2java
 */
@Entity
@Table(name = "FNFLUXOCAIXAVW01")
public class Fnfluxocaixavw01 implements java.io.Serializable {

	private Fnfluxocaixavw01Id id;

	public Fnfluxocaixavw01() {
	}

	public Fnfluxocaixavw01(Fnfluxocaixavw01Id id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "ordem", column = @Column(name = "ORDEM")),
			@AttributeOverride(name = "tipolanca", column = @Column(name = "TIPOLANCA", length = 0)),
			@AttributeOverride(name = "subtipo", column = @Column(name = "SUBTIPO", length = 0)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP")),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL")),
			@AttributeOverride(name = "codrecpaglanc", column = @Column(name = "CODRECPAGLANC")),
			@AttributeOverride(name = "nparcrecpaglanc", column = @Column(name = "NPARCRECPAGLANC")),
			@AttributeOverride(name = "dtemissao", column = @Column(name = "DTEMISSAO", length = 10)),
			@AttributeOverride(name = "dtcomp", column = @Column(name = "DTCOMP", length = 10)),
			@AttributeOverride(name = "dtvenctorecpag", column = @Column(name = "DTVENCTORECPAG", length = 10)),
			@AttributeOverride(name = "doc", column = @Column(name = "DOC", length = 0)),
			@AttributeOverride(name = "codigo", column = @Column(name = "CODIGO")),
			@AttributeOverride(name = "razao", column = @Column(name = "RAZAO", length = 0)),
			@AttributeOverride(name = "historico", column = @Column(name = "HISTORICO", length = 0)),
			@AttributeOverride(name = "valor", column = @Column(name = "VALOR", precision = 0, scale = 5)) })
	public Fnfluxocaixavw01Id getId() {
		return this.id;
	}

	public void setId(Fnfluxocaixavw01Id id) {
		this.id = id;
	}

}
