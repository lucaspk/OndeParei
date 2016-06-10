package model;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.*;

public class SerieTest {
	
	private List<Serie> minhasSeries;
	
	@Before
	public void setUp(){
		minhasSeries = new ArrayList<Serie>();
	}
	
	@Test
	public void deveriaLancarInvalidNameExceptionNameNull(){
		String InvalidNameExceptionMessage = "The name is invalid, because is null or empty.";
		try {
			new Serie(null, null, null);
			fail();
		} catch (Exception e) {
			assertEquals(InvalidNameExceptionMessage, e.getMessage());
		}
	}
	
	@Test
	public void deveriaLancarInvalidNameExceptionNameVazio(){
		String InvalidNameExceptionMessage = "The name is invalid, because is null or empty.";
		try {
			new Serie("", null, null);
			fail();
		} catch (Exception e) {
			assertEquals(InvalidNameExceptionMessage, e.getMessage());
		}
	}
	
	@Test
	public void deveriaLancarInvalidSerieDataExceptionSeasonVazia(){
		String InvalidNameExceptionMessage = "The value  is invalid, because he doesn't match with the regex format ^([1-9]{2,5}[0-9]*|[0-9][1-9])$.";
		try {
			new Serie("Arrow", "", null);
			fail();
		} catch (Exception e) {
			assertEquals(InvalidNameExceptionMessage, e.getMessage());
		}
	}
	
	@Test
	public void deveriaLancarInvalidSerieDataExceptionEpisodeVazio(){
		String InvalidNameExceptionMessage = "The value  is invalid, because he doesn't match with the regex format ^([1-9]{2,5}[0-9]*|[0-9][1-9])$.";
		try {
			new Serie("Arrow", "15", "");
			fail();
		} catch (Exception e) {
			assertEquals(InvalidNameExceptionMessage, e.getMessage());
		}
	}
	
	@Test
	public void deveriaLancarInvalidSerieDataExceptionSeasonNull(){
		String InvalidNameExceptionMessage = "The value null is invalid, because he doesn't match with the regex format ^([1-9]{2,5}[0-9]*|[0-9][1-9])$.";
		try {
			new Serie("Arrow", null, null);
			fail();
		} catch (Exception e) {
			assertEquals(InvalidNameExceptionMessage, e.getMessage());
		}
	}
	
	@Test
	public void deveriaLancarInvalidSerieDataExceptionEpisodeNull(){
		String InvalidNameExceptionMessage = "The value null is invalid, because he doesn't match with the regex format ^([1-9]{2,5}[0-9]*|[0-9][1-9])$.";
		try {
			new Serie("Arrow", "15", null);
			fail();
		} catch (Exception e) {
			assertEquals(InvalidNameExceptionMessage, e.getMessage());
		}
	}
	
	@Test
	public void deveriaLancarInvalidSerieDataExceptionEpisodeApenasUmDigito(){
		String InvalidNameExceptionMessage = "The value 1 is invalid, because he doesn't match with the regex format ^([1-9]{2,5}[0-9]*|[0-9][1-9])$.";
		try {
			new Serie("Arrow", "1", "1");
			fail();
		} catch (Exception e) {
			assertEquals(InvalidNameExceptionMessage, e.getMessage());
		}
	}
	
	@Test
	public void deveriaLancarInvalidSerieDataExceptionSeasonApenasUmDigito(){
		String InvalidNameExceptionMessage = "The value 1 is invalid, because he doesn't match with the regex format ^([1-9]{2,5}[0-9]*|[0-9][1-9])$.";
		try {
			new Serie("Arrow", "12", "1");
			fail();
		} catch (Exception e) {
			assertEquals(InvalidNameExceptionMessage, e.getMessage());
		}
	}
	
	@Test
	public void deveriaLancarInvalidSerieDataExceptionEpisodeFormatoInvalido(){
		String InvalidNameExceptionMessage = "The value 023456 is invalid, because he doesn't match with the regex format ^([1-9]{2,5}[0-9]*|[0-9][1-9])$.";
		try {
			new Serie("Arrow", "023456", null);
			fail();
		} catch (Exception e) {
			assertEquals(InvalidNameExceptionMessage, e.getMessage());
		}
	}
	
	@Test
	public void deveriaLancarInvalidSerieDataExceptionSeasonFormatoInvalido(){
		String InvalidNameExceptionMessage = "The value 023456 is invalid, because he doesn't match with the regex format ^([1-9]{2,5}[0-9]*|[0-9][1-9])$.";
		try {
			new Serie("Arrow", "12", "023456");
			fail();
		} catch (Exception e) {
			assertEquals(InvalidNameExceptionMessage, e.getMessage());
		}
	}

	@Test
	public void deveriaLancarInvalidSerieDataExceptionEpisodeDoisDigitosZero(){
		String InvalidNameExceptionMessage = "The value 00 is invalid, because he doesn't match with the regex format ^([1-9]{2,5}[0-9]*|[0-9][1-9])$.";
		try {
			new Serie("Arrow", "00", null);
			fail();
		} catch (Exception e) {
			assertEquals(InvalidNameExceptionMessage, e.getMessage());
		}
	}
	
	@Test
	public void deveriaLancarInvalidSerieDataExceptionSeasonDoisDigitosZero(){
		String InvalidNameExceptionMessage = "The value 00 is invalid, because he doesn't match with the regex format ^([1-9]{2,5}[0-9]*|[0-9][1-9])$.";
		try {
			new Serie("Arrow", "12", "00");
			fail();
		} catch (Exception e) {
			assertEquals(InvalidNameExceptionMessage, e.getMessage());
		}
	}
	
	@Test
	public void deveriaAdicionarNaColecaoDeSeriesDadosComDoisDigitos() throws Exception{
		minhasSeries.add(new Serie("The Flash","03","01"));
		minhasSeries.add(new Serie("Arrow","05","01"));
		minhasSeries.add(new Serie("Gotham","03","01"));
		minhasSeries.add(new Serie("The Originals","04","01"));
		assertTrue(minhasSeries.size() == 4);
	}
	
	@Test
	public void deveriaAdicionarNaColecaoDeSeriesDadosComMaisDeDoisDigitos() throws Exception{
		minhasSeries.add(new Serie("The Flash","123","54561"));
		minhasSeries.add(new Serie("Arrow","1230515","44561"));
		minhasSeries.add(new Serie("Gotham","1230123","4554601"));
		minhasSeries.add(new Serie("The Originals","1230124","56052541"));
		assertTrue(minhasSeries.size() == 4);
	}
	
}
