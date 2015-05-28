package Teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Clase.Client;

public class TestClient {
  
	private Client nou;
	
	@Test
	public void testSetCNPValoareIncorecta() {
		try{
		nou =new Client.ClientBuilder("Tulceanu", "Cristina").areCNP("3939939399993993").build();
        fail("Formatul nu este valid!");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	@Test
	public void testSetCNPValoareCorecta() {
		try{
		nou =new Client.ClientBuilder("Tulceanu", "Cristina").areCNP("1939939399993").build();
        assertEquals("Verificare setCNP","1939939399993",nou.getCNP());
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	@Test
	public void testSetEmailValoareCorecta() {
		try{
		nou =new Client.ClientBuilder("Tulceanu", "Cristina").areEmail("cristina@yahoo.com").build();
        assertEquals("Verificare setEmail","cristina@yahoo.com",nou.getEmail());
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	@Test
	public void testSetEmailValoareIncorecta() {
		try{
		nou =new Client.ClientBuilder("Tulceanu", "Cristina").areEmail("99939anana.").build();
         fail("Lipsa exceptie pe setEmail");	}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	@Test
	public void testSetEmailValoareIncorecta_2() {
		try{
		nou =new Client.ClientBuilder("Tulceanu", "Cristina").areEmail("--wkwwm99.").build();
         assertNull(nou.getEmail());	}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	@Test
	public void testSetTelefonValoareIncorecta() {
		try{
		nou =new Client.ClientBuilder("Tulceanu", "Cristina").areTelefon("--wkwwm99.").build();
         assertNull(nou.getTelefon());	}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	@Test
	public void testSetTelefonValoareCorecta(){
		
			try{
			nou =new Client.ClientBuilder("Tulceanu", "Cristina").areTelefon("0766889097").build();
	         assertEquals("Fail pe setTelefon","0766889097",nou.getTelefon());	}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	@Test
	public void testSetTelefonLungimeIncorecta(){
		try{
			nou =new Client.ClientBuilder("Tulceanu", "Cristina").areTelefon("07668890").build();
	         assertNull(nou.getTelefon());	}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
	}
}
