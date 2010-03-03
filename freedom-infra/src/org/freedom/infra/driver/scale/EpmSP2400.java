package org.freedom.infra.driver.scale;

import java.math.BigDecimal;

import java.sql.Time;

import java.util.Date;

import javax.comm.SerialPort;

import org.freedom.infra.comm.CtrlPort;
import org.freedom.infra.functions.ConversionFunctions;
import org.freedom.infra.functions.StringFunctions;

public class EpmSP2400 extends AbstractScale  {

	private BigDecimal weight = null;
	
	private Date date = null;
	
	private Time time = null;
	
	public EpmSP2400( int port ) {
		
		configSerialParams();
		
		activePort( port );
		
		readReturn();
		
	}
	
	protected void readReturn() {
		
		try {
			
			if(buffer!=null) {
			
				String reading = new String( buffer );			
				
				System.out.println(reading);
				
				parseString(reading);				
				
			}
			else {
				System.out.println("Buffer is null!");
			}			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void setDate(Date date) {
		
		this.date = date;		
	}

	
	public Date getDate() {
 
		return date;
	
	}

	private void setTime(Time time) {
		
		this.time = time; 
	
	}
	
	public Time getTime() {
		
		return time;		
	}

	private void parseString(String str) {
		
		String strweight = "";
		String strdate = "";
		String strtime = "";
		
		try {
			
			int posicaobranca = str.indexOf( " " );
			
			if(posicaobranca<24 && posicaobranca>-1) {
				str = str.substring( posicaobranca );
				str = StringFunctions.alltrim( str );
			}
			
			if(str.length()>=24) {
			
				str = str.substring( 0, 24 );
				
				String validador = str.substring( 11, 12 )  + str.substring( 14, 15 ) + str.substring( 19, 20 );
				
				if("//:".equals( validador )) {
					
					CtrlPort.getInstance().disablePort();
										
					System.out.println("Finalizou leitura e fechou a porta!");

					strweight = str.substring( 0,  07 );
					strdate = str.substring( 9,  17 );
					strtime = str.substring( 17 );
					
					strtime = StringFunctions.clearString(strtime);
					
					setWeight( ConversionFunctions.stringToBigDecimal( strweight ) );
					setDate( ConversionFunctions.strDate6digToDate( strdate ) );
					setTime( ConversionFunctions.strTimetoTime( strtime ) );

				}
				
				
			}
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void setWeight( BigDecimal weight ) {
		
		this.weight = weight;
		
	}
	
	public BigDecimal getWeight() {
		
		return weight;
	}
	
	private void configSerialParams() {

		serialParams.setTimeout( 1000 );
		serialParams.setBauderate( 9600 );
		serialParams.setDatabits( SerialPort.DATABITS_8 );
		serialParams.setStopbits( SerialPort.STOPBITS_1 );
		serialParams.setParity( SerialPort.PARITY_NONE );
		
	}
	
	

}
