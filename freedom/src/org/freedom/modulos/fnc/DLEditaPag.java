/**
 * @version 14/07/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 * 
 * Projeto: Freedom <BR>
 * 
 * Pacote: org.freedom.modulos.std <BR>
 * Classe:
 * @(#)DLEditaPag.java <BR>
 * 
 * Este arquivo � parte do sistema Freedom-ERP, o Freedom-ERP � um software livre; voc� pode redistribui-lo e/ou <BR>
 * modifica-lo dentro dos termos da Licen�a P�blica Geral GNU como publicada pela Funda��o do Software Livre (FSF); <BR>
 * na vers�o 2 da Licen�a, ou (na sua opni�o) qualquer vers�o. <BR>
 * Este programa � distribuido na esperan�a que possa ser  util, mas SEM NENHUMA GARANTIA; <BR>
 * sem uma garantia implicita de ADEQUA��O a qualquer MERCADO ou APLICA��O EM PARTICULAR. <BR>
 * Veja a Licen�a P�blica Geral GNU para maiores detalhes. <BR>
 * Voc� deve ter recebido uma c�pia da Licen�a P�blica Geral GNU junto com este programa, se n�o, <BR>
 * de acordo com os termos da LPG-PC <BR>
 * <BR>
 * 
 * Coment�rios sobre a classe...
 */

package org.freedom.modulos.fnc;

import java.awt.Component;
import java.awt.event.ActionEvent;
import org.freedom.infra.model.jdbc.DbConnection;
import org.freedom.library.GuardaCampo;
import org.freedom.library.JLabelPad;
import org.freedom.library.JTextFieldFK;
import org.freedom.library.JTextFieldPad;
import org.freedom.library.ListaCampos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.freedom.acao.CarregaEvent;
import org.freedom.acao.CarregaListener;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FFDialogo;

public class DLEditaPag extends FFDialogo implements CarregaListener {

	private static final long serialVersionUID = 1L;

	private final JTextFieldPad txtCodFor = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 10, 0 );
	
	private final JTextFieldPad txtRazFor = new JTextFieldPad( JTextFieldPad.TP_STRING, 40, 0 );

	private final JTextFieldPad txtCodConta = new JTextFieldPad( JTextFieldPad.TP_STRING, 10, 0 );

	private final JTextFieldPad txtDescConta = new JTextFieldPad( JTextFieldPad.TP_STRING, 50, 0 );

	private final JTextFieldPad txtCodPlan = new JTextFieldPad( JTextFieldPad.TP_STRING, 13, 0 );

	private final JTextFieldPad txtDescPlan = new JTextFieldPad( JTextFieldPad.TP_STRING, 50, 0 );

	private final JTextFieldPad txtCodCC = new JTextFieldPad( JTextFieldPad.TP_STRING, 19, 0 );

	private final JTextFieldPad txtAnoCC = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 4, 0 );

	private final JTextFieldFK txtSiglaCC = new JTextFieldFK( JTextFieldPad.TP_STRING, 10, 0 );

	private final JTextFieldFK txtDescCC = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private final JTextFieldPad txtDoc = new JTextFieldPad( JTextFieldPad.TP_STRING, 10, 0 );

	private final JTextFieldPad txtDtEmis = new JTextFieldPad( JTextFieldPad.TP_DATE, 10, 0 );

	private final JTextFieldPad txtDtVenc = new JTextFieldPad( JTextFieldPad.TP_DATE, 10, 0 );

	private final JTextFieldPad txtVlrParc = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, 2 );

	private final JTextFieldPad txtVlrJuros = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, 2 );

	private final JTextFieldPad txtVlrDesc = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, 2 );

	private final JTextFieldPad txtVlrDev = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, Aplicativo.casasDecFin );

	private final JTextFieldPad txtVlrAdic = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, 2 );

	private final JTextFieldPad txtObs = new JTextFieldPad( JTextFieldPad.TP_STRING, 250, 0 );

	private final JTextFieldPad txtCodTipoCob = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private final JTextFieldFK txtDescTipoCob = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );

	private final ListaCampos lcConta = new ListaCampos( this );

	private final ListaCampos lcPlan = new ListaCampos( this );

	private final ListaCampos lcCC = new ListaCampos( this );

	private final ListaCampos lcTipoCob = new ListaCampos( this, "TC" );
	

	public DLEditaPag( Component cOrig ) {

		super( cOrig );
		setTitulo( "Editar" );
		setAtribos( 360, 420 );

		montaListaCampos();
		montaTela();
	}

	private void montaListaCampos() {

		lcConta.add( new GuardaCampo( txtCodConta, "NumConta", "N� Conta", ListaCampos.DB_PK, false ) );
		lcConta.add( new GuardaCampo( txtDescConta, "DescConta", "Descri��o da conta", ListaCampos.DB_SI, false ) );
		lcConta.montaSql( false, "CONTA", "FN" );
		lcConta.setReadOnly( true );
		txtCodConta.setTabelaExterna( lcConta );
		txtCodConta.setFK( true );
		txtCodConta.setNomeCampo( "NumConta" );

		lcPlan.add( new GuardaCampo( txtCodPlan, "CodPlan", "C�d.plan.", ListaCampos.DB_PK, false ) );
		lcPlan.add( new GuardaCampo( txtDescPlan, "DescPlan", "Descri��o do planejamento", ListaCampos.DB_SI, false ) );
		lcPlan.setWhereAdic( "TIPOPLAN = 'D' AND NIVELPLAN = 6" );
		lcPlan.montaSql( false, "PLANEJAMENTO", "FN" );
		lcPlan.setReadOnly( true );
		txtCodPlan.setTabelaExterna( lcPlan );
		txtCodPlan.setFK( true );
		txtCodPlan.setNomeCampo( "CodPlan" );

		lcCC.add( new GuardaCampo( txtCodCC, "CodCC", "C�d.c.c.", ListaCampos.DB_PK, false ) );
		lcCC.add( new GuardaCampo( txtSiglaCC, "SiglaCC", "Sigla", ListaCampos.DB_SI, false ) );
		lcCC.add( new GuardaCampo( txtDescCC, "DescCC", "Descri��o", ListaCampos.DB_SI, false ) );
		lcCC.add( new GuardaCampo( txtAnoCC, "AnoCC", "Ano-Base", ListaCampos.DB_PK, false ) );
		lcCC.setReadOnly( true );
		lcCC.setQueryCommit( false );
		lcCC.setWhereAdic( "NIVELCC=10" );
		lcCC.montaSql( false, "CC", "FN" );
		txtCodCC.setTabelaExterna( lcCC );
		txtCodCC.setFK( true );
		txtCodCC.setNomeCampo( "CodCC" );
		txtAnoCC.setTabelaExterna( lcCC );
		txtAnoCC.setFK( true );
		txtAnoCC.setNomeCampo( "AnoCC" );

		lcCC.addCarregaListener( this );

		txtCodTipoCob.setNomeCampo( "CodTipoCob" );
		lcTipoCob.add( new GuardaCampo( txtCodTipoCob, "CodTipoCob", "C�d.tp.cob.", ListaCampos.DB_PK, false ) );
		lcTipoCob.add( new GuardaCampo( txtDescTipoCob, "DescTipoCob", "Descri��o do tipo de cobran�a.", ListaCampos.DB_SI, false ) );
		lcTipoCob.montaSql( false, "TIPOCOB", "FN" );
		lcTipoCob.setQueryCommit( false );
		lcTipoCob.setReadOnly( true );
		txtCodTipoCob.setTabelaExterna( lcTipoCob );
		txtCodTipoCob.setListaCampos( lcTipoCob );
		txtDescTipoCob.setListaCampos( lcTipoCob );
		txtCodTipoCob.setFK( true );
		
	}

	private void montaTela() {

		txtCodFor.setAtivo( false );
		txtRazFor.setAtivo( false );
		txtDescConta.setAtivo( false );
		txtDescPlan.setAtivo( false );
		txtDtEmis.setAtivo( false );

		adic( new JLabelPad( "C�d.for." ), 7, 0, 250, 20 );
		adic( txtCodFor, 7, 20, 80, 20 );
		adic( new JLabelPad( "Raz�o social do fornecedor" ), 90, 0, 250, 20 );
		adic( txtRazFor, 90, 20, 250, 20 );
		adic( new JLabelPad( "N� conta" ), 7, 40, 250, 20 );
		adic( txtCodConta, 7, 60, 80, 20 );
		adic( new JLabelPad( "Descri��o da conta" ), 90, 40, 250, 20 );
		adic( txtDescConta, 90, 60, 250, 20 );
		adic( new JLabelPad( "C�d.catg." ), 7, 80, 250, 20 );
		adic( txtCodPlan, 7, 100, 100, 20 );
		adic( new JLabelPad( "Descri��o da categoria" ), 110, 80, 250, 20 );
		adic( txtDescPlan, 110, 100, 230, 20 );
		adic( new JLabelPad( "C�d.c.c." ), 7, 120, 250, 20 );
		adic( txtCodCC, 7, 140, 100, 20 );
		adic( new JLabelPad( "Descri��o do centro de custo" ), 110, 120, 250, 20 );
		adic( txtDescCC, 110, 140, 230, 20 );
		adic( new JLabelPad( "Cod.Tp.Cob" ), 7, 160, 80, 20 );
		adic( txtCodTipoCob, 7, 180, 80, 20 );
		adic( new JLabelPad( "Descri��o do tipo de cobran�a" ), 90, 160, 250, 20 );
		adic( txtDescTipoCob, 90, 180, 250, 20 );
		
		adic( new JLabelPad( "Doc." ), 7, 200, 81, 20 );
		adic( txtDoc, 7, 220, 81, 20 );
		adic( new JLabelPad( "Emiss�o" ), 91, 200, 81, 20 );
		adic( txtDtEmis, 91, 220, 81, 20 );
		adic( new JLabelPad( "Vencimento" ), 175, 200, 81, 20 );
		adic( txtDtVenc, 175, 220, 81, 20 );
		adic( new JLabelPad( "Vlr.parcela" ), 259, 200, 81, 20 );
		adic( txtVlrParc, 259, 220, 81, 20 );
		
		adic( new JLabelPad( "Vlr.desc." ), 7, 240, 81, 20 );
		adic( txtVlrDesc, 7, 260, 81, 20 );
		adic( new JLabelPad( "Vlr.juros." ), 91, 240, 81, 20 );
		adic( txtVlrJuros, 91, 260, 81, 20 );
		adic( new JLabelPad( "Vlr.devolu��o" ), 175, 240, 81, 20 );
		adic( txtVlrDev, 175, 260, 81, 20 );
		adic( new JLabelPad( "Vlr.adicional" ), 259, 240, 81, 20 );
		adic( txtVlrAdic, 259, 260, 81, 20 );

		adic( new JLabelPad( "Observa��es" ), 7, 280, 200, 20 );
		adic( txtObs, 7, 300, 333, 20 );
	}

	public void setValores( String[] sVals, boolean bLancaUsu ) {

		txtCodFor.setVlrString( sVals[ 0 ] );
		txtRazFor.setVlrString( sVals[ 1 ] );
		txtCodConta.setVlrString( sVals[ 2 ] );
		txtCodPlan.setVlrString( sVals[ 3 ] );
		txtCodCC.setVlrString( sVals[ 4 ] );
		txtDoc.setVlrString( sVals[ 5 ] );
		txtDtEmis.setVlrString( sVals[ 6 ] );
		txtDtVenc.setVlrString( sVals[ 7 ] );
		txtVlrParc.setVlrString( sVals[ 8 ] );
		txtVlrJuros.setVlrString( sVals[ 9 ] );
		txtVlrDesc.setVlrString( sVals[ 10 ] );
		txtVlrAdic.setVlrString( sVals[ 11 ] );
		txtObs.setVlrString( sVals[ 12 ] );
		txtCodTipoCob.setVlrString( sVals[ 13 ] );
		txtVlrDev.setVlrString( sVals[ 14 ] );
		txtVlrParc.setAtivo( bLancaUsu );
	}

	public String[] getValores() {

		String[] sRetorno = new String[ 12 ];
		sRetorno[ 0 ] = txtCodConta.getVlrString();
		sRetorno[ 1 ] = txtCodPlan.getVlrString();
		sRetorno[ 2 ] = txtCodCC.getVlrString();
		sRetorno[ 3 ] = txtDoc.getVlrString();
		sRetorno[ 4 ] = txtVlrParc.getVlrString();
		sRetorno[ 5 ] = txtVlrJuros.getVlrString();
		sRetorno[ 6 ] = txtVlrAdic.getVlrString();
		sRetorno[ 7 ] = txtVlrDesc.getVlrString();
		sRetorno[ 8 ] = txtDtVenc.getVlrString();
		sRetorno[ 9 ] = txtObs.getVlrString();
		sRetorno[ 10 ] = txtCodTipoCob.getVlrString();
		sRetorno[ 11 ] = txtVlrDev.getVlrString();
		return sRetorno;
	}

	public void actionPerformed( ActionEvent evt ) {

		if ( evt.getSource() == btOK && txtDtVenc.getVlrString().length() < 10 ) {
			Funcoes.mensagemInforma( this, "Data do vencimento � requerido!" );
		}
		else {
			super.actionPerformed( evt );
		}
	}

	private int buscaAnoBaseCC() {

		int iRet = 0;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {

			ps = con.prepareStatement( "SELECT ANOCENTROCUSTO FROM SGPREFERE1 WHERE CODEMP=? AND CODFILIAL=?" );
			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, ListaCampos.getMasterFilial( "SGPREFERE1" ) );

			rs = ps.executeQuery();

			if ( rs.next() ) {
				iRet = rs.getInt( "ANOCENTROCUSTO" );
			}

			rs.close();
			ps.close();

			con.commit();
		} catch ( SQLException err ) {
			err.printStackTrace();
			Funcoes.mensagemErro( this, "Erro ao buscar o ano-base para o centro de custo.\n" + err.getMessage(), true, con, err );
		}

		return iRet;
	}

	public void beforeCarrega( CarregaEvent cevt ) {

		if ( cevt.getListaCampos() == lcCC && txtAnoCC.getVlrInteger().intValue() == 0 ) {
			txtAnoCC.setVlrInteger( new Integer( buscaAnoBaseCC() ) );
		}
	}

	public void afterCarrega( CarregaEvent cevt ) {

	}

	public void setConexao( DbConnection cn ) {

		super.setConexao( cn );
		lcConta.setConexao( cn );
		lcConta.carregaDados();
		lcPlan.setConexao( cn );
		lcPlan.carregaDados();
		lcTipoCob.setConexao( cn );
		lcTipoCob.carregaDados();
		lcCC.setConexao( cn );
		lcCC.carregaDados();
	}
}
