package Teste;

import static org.junit.Assert.*;
import interfata.ClientDAO;
import interfata.InvalidFormatException;

import org.junit.Before;
import org.junit.Test;

import Clase.Client;

public class TestClientDAO {
	private ClientDAO c;
	private Client nou;
	
	@Before
	public void setUp(){
		c=new ClientDAO();
	}
	
	@Test
	public void testgetClientById() {
		
	    assertNotNull("Test gasire client dupa id",c.getClientById(49));
	
		
	}
	@Test
	public void testgetClientById_2(){
		nou=c.getClientById(49);
		assertEquals("Toreador",nou.getNume());
	}
    @Test
    public void testinsertClient(){
    	
			try {
				nou = new Client.ClientBuilder("Enache", "Andrei").areCNP("2939933938329").areTelefon("0767940309").areAdresa("Ploiesti")
						.areCont("RO928822").areEmail("enache@yahoo.com").areFax("929922222").areSerie("92922").build();
				c.insertClient(nou);
			} catch (InvalidFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
    }
    @Test 
    public void  testDeleteClientById()
    {
    	c.deleteClientById(56);
    	assertNull("Test delete client",c.getClientById(56));
    }
}
