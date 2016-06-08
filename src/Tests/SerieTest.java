package Tests;

import model.*;
import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;


public class SerieTest {
	
	private List<Serie> minhasSeries;
	private Serie 	serieValida, 
					serieNomeVazio, 
					serieSeasonInvalida, 
					serieEpisodeInvalido, 
					serieNomeNull;
					
	@Before
	public void setUp() throws Exception{
		minhasSeries = new ArrayList<Serie>();
		serieValida = new Serie("The Flash","03","01");
		try {
			
			serieSeasonInvalida = new Serie("The BlackList","5","02");
			serieEpisodeInvalido = new Serie("The Originals","04","1");
			serieNomeNull = new Serie(null,"07","03");
			serieNomeVazio = new Serie("","07","03");
			
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	@Test
	public void deveriaCadastrarSerie() throws Exception{
		minhasSeries.add(serieValida);
		assertEquals(1,minhasSeries.size());
		minhasSeries.add(serieSeasonInvalida);
		minhasSeries.add(serieEpisodeInvalido);
		minhasSeries.add(serieNomeNull);
		assertEquals(1,minhasSeries.size());
	}
	
//	@Test
//	public void naoDeveriaCadastrarComSerieNomeVazio() throws Exception{
//		try {
//			Serie serie = new Serie("","03","01");
//			Serie serie2 = new Serie("","05","02");
//			Serie serie3 = new Serie("","04","01");
//			Serie serie4 = new Serie("","07","03");
//			Serie serie5 = new Serie("","05","02");
//			minhasSeries.add(serie);
//			minhasSeries.add(serie2);
//			minhasSeries.add(serie3);
//			minhasSeries.add(serie4);
//			minhasSeries.add(serie5);
//		} catch (Exception e) {
//			e.getMessage();
//		}		
//		assertFalse(minhasSeries.size() == 5);
//	}
//	
//	@Test
//	public void naoDeveriaCadastrarSerieComSeasonFormatoInvalido() throws Exception{
//		try {
//			Serie serie = new Serie("The Flash","3","01");
//			Serie serie2 = new Serie("The BlackList","5","02");
//			Serie serie3 = new Serie("The Originals","4","01");
//			Serie serie4 = new Serie("The Walking Dead","7","03");
//			Serie serie5 = new Serie("Arrow","5","02");
//			minhasSeries.add(serie);
//			minhasSeries.add(serie2);
//			minhasSeries.add(serie3);
//			minhasSeries.add(serie4);
//			minhasSeries.add(serie5);
//		} catch (Exception e) {
//			e.getMessage();
//		}		
//		assertFalse(minhasSeries.size() == 5);
//	}
//	
//	@Test
//	public void naoDeveriaCadastrarSerieComEpisodeFormatoInvalido() throws Exception{
//		try {
//			Serie serie = new Serie("The Flash","03","1");
//			Serie serie2 = new Serie("The BlackList","05","2");
//			Serie serie3 = new Serie("The Originals","04","1");
//			Serie serie4 = new Serie("The Walking Dead","07","3");
//			Serie serie5 = new Serie("Arrow","05","02");
//			minhasSeries.add(serie);
//			minhasSeries.add(serie2);
//			minhasSeries.add(serie3);
//			minhasSeries.add(serie4);
//			minhasSeries.add(serie5);
//		} catch (Exception e) {
//			e.getMessage();
//		}		
//		assertFalse(minhasSeries.size() == 5);
//	}	
}
