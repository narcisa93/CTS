package Teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import Clase.Contract;
import Clase.Factura;

public class TestFactura {
	private Contract c;
	private Factura f;
	
	@Before
	public void setUp(){
		try{
	    c=new Contract();
		c.setNrContract(2929);
		c.setPret(999.88);
		f=new Factura();
		f.setContract(c);
	
		}
		catch(Exception ex)
		{
			ex.getMessage();
		}
	}
		
	
	@Test
	public void testCalculeazaRataValoareCorecta(){
		try{
			double rata=f.calculeazaRata(3);
			assertEquals("Calculeaza rata incorect",333.26,rata,0.0);
		}
		catch(Exception ex)
		{
			ex.getMessage();
		}
	}
	@Test
	public void testCalculeazaRataValoareZero(){
		try{
			double rata=f.calculeazaRata(0);
			fail("Metoda nu genereaza eroare pe valoare 0");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	@Test
	public void testCalculeazaRataValoareNegativa(){
		try{
			double rata=f.calculeazaRata(-5);
			fail("Metoda nu genereaza eroare pe valoare negativa");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	@Test
	public void testCalculeazaRataValoareMaxima(){
		try{
			double rata=f.calculeazaRata(8);
			fail("Metoda nu genereaza eroare pe valoare prea mare");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();;
		}
	}
	
}
