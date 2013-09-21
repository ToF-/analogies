import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;


public class DictionnaireTest {

	private Dictionnaire dictionnaire;
	
	@Before
	public void setup() {
		dictionnaire = new Dictionnaire();
	}
	
	@Test
	public void UnDictionnaireVideNeConnaitPasDAnagrammes() {
		assertTrue(dictionnaire.anagrammes("CHIEN").isEmpty());
	}
	
	@Test
	public void UnDictionnaireAvecUneEntreeAnagrammeConnaitSonAnagramme() {
		dictionnaire.ajoute("CHIEN");
		assertEquals(Arrays.asList("CHIEN"), dictionnaire.anagrammes("NICHE"));
	}
}
