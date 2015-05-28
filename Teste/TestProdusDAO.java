package Teste;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import org.junit.Test;


import Clase.Produs;
import static org.junit.Assert.*;

import interfata.MyConnection;
import interfata.ProdusDAO;

public class TestProdusDAO {


	@Test
	public void testFindProductsByDestination_1(){
	       ProdusDAO pd=new ProdusDAO();
	       List<Produs>listaProd=pd.findProductsByDestination("Bulgaria");
	       assertNotNull(listaProd);
	       for(Produs d:listaProd)
	       {
	    	   System.out.println(d.getDenumireProdus());
	       }
		}
	
	@Test
	public void testFindProductsByDestination_2(){
	       ProdusDAO pd=new ProdusDAO();
	       List<Produs>listaProd=pd.findProductsByDestination("Bulgaria");
	       assertEquals("excursie Grecia",listaProd.get(0).getDenumireProdus());
	      
		}
	@Test
	public void testfindUnitatiCazareByDestination(){
		   ProdusDAO pd=new ProdusDAO();
	       List<String>listaUnitati=pd.findUnitatiCazareByDestination("Bulgaria","Vila");
	       assertNotNull(listaUnitati);
	       for(String d:listaUnitati)
	       {
	    	   System.out.println(d);
	       }
	}
	@Test
	public void testfindUnitatiCazareByDestination_2(){
		   ProdusDAO pd=new ProdusDAO();
	       List<String>listaUnitati=pd.findUnitatiCazareByDestination("Bulgaria","Vila");
	      assertTrue(listaUnitati.size()>1);
	}
	
	@Test
	public void testfindUnitatiCazareByDestination_3(){
		   ProdusDAO pd=new ProdusDAO();
	       List<String>listaUnitati=pd.findUnitatiCazareByDestination("Bulgaria","Vila");
	       assertEquals("Rezultatele returnate nu coincid ","Vila Haki",listaUnitati.get(0));
	}
	
}
