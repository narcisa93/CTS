package Teste;

import static org.junit.Assert.*;
import interfata.InvalidValueException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Clase.BonDeComanda;
import Clase.Produs;

public class TestBonDeComanda {
	
private BonDeComanda bon;
private Produs p;

   @Before
	public void setUp(){
	System.out.println("Before");	
	bon=new BonDeComanda();
	p=new Produs();
    p.setDenumireProdus("excursie");
    p.setPret(900.9);
	}
   
   @After
    public void tearDown()
    {
	   System.out.println("After");
    }
   
   
	@Test
	public void testAddProdus() {
	bon.addProdus(p);
	assertEquals("Verificare pretTotal",900.9,bon.getPretTotal(),0.0);
	}

	@Test
	public void testRemoveProdus(){
		bon.removeProdus(p);
		assertEquals("Verificare pretTotla",0,bon.getPretTotal(),0.0);
	}
	
	@Test 
	public void testCalculAvans()
	{
		int procent=10;
		bon.addProdus(p);
		try {
			assertEquals("Calcul incorect avans",90.09,bon.calculAvans(10),0.0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testCalculAvansValoareMare(){
		
		bon.addProdus(p);
		try {
			bon.calculAvans(100000);
			fail("Nu exista exceptie pentru valoare negativa");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testCalculAvansValoareNegativa(){
		bon.addProdus(p);
		try {
			double avans=bon.calculAvans(-60);
			fail("Nu exista exceptie pentru valoare negativa");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
