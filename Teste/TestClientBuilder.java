package Teste;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import junit.framework.TestCase;
import interfata.BonDAO;
import interfata.InvalidFormatException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Clase.BonDeComanda;
import Clase.Client;

public class TestClientBuilder{
	private FileReader reader;
	private BufferedReader bf;
	private Client nou;
	
	@Before
	public void setUp() throws IOException{
		reader=new FileReader("fisier.txt");
		bf=new BufferedReader(reader);
	}
	
	@Test
	public void testClientBuilder() 
	{
		try{
				 nou=new Client.ClientBuilder("Busuioc", "Roxana").areAdresa("Targoviste").areTelefon("0767940309").areCNP("2929929298829").areEmail("roxana@yahoo.com").build();
		         assertEquals("Testare metode builder", "Targoviste",nou.getAdresa());
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	
	@Test
	public void testBuilderDinFisier() 
	{
		try{
				String linieCurenta;
			
			while((linieCurenta = bf.readLine())!=null){
					String[] values = linieCurenta.split(",");
                     nou=new Client.ClientBuilder(values[0], values[1]).areCNP(values[2]).areAdresa(values[3]).areEmail(values[4])
                    		.areTelefon(values[5]).areFax(values[6]).areCont(values[7]).areSerie(values[8]).build();
                     assertEquals("Testare builder din fisier","Ion",nou.getPrenume());
			}
		}
		catch(FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	 
	@After
	public void tearDown() throws IOException{
		bf.close();
		reader.close();
	}
}
