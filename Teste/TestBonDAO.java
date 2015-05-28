package Teste;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import interfata.BonDAO;
import interfata.ClientDAO;

import org.junit.Before;
import org.junit.Test;

import Clase.BonDeComanda;
import Clase.Client;

public class TestBonDAO {
private BonDAO bonDAO;
private BonDeComanda bon;
private ClientDAO clientDAO;
  @Before
	public void setUp(){
		System.out.println("Pregatire test-creare obiecte");
	     bonDAO=new BonDAO();
	     bon=new BonDeComanda();
	     clientDAO=new ClientDAO();
	} 
	
	@Test
	public void testInsertBon()
	{   Client nou=clientDAO.getClientById(54);
		bon.setNrBon(57);
		bon.setNr_nopti(2);
		bon.setNr_persoane(2);
		bon.setClient(nou);
		bon.setAlte_taxe(22.3);
		bon.setAvans(10.4);
		bon.setSolicitari("nimic");
		bon.setInformatii_generale("Viza nu");
		bonDAO.insertBon(bon);
	}
	@Test
	public void testgetBonByNr(){
		
		bon=bonDAO.getBonByNr(54);
		assertEquals(2,bon.getNr_nopti());
	}
}
