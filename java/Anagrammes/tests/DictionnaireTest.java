import static org.junit.Assert.*;

import org.junit.Test;


public class DictionnaireTest {

	@Test
	public void test() {
		Dictionnaire dictionnaire = new Dictionnaire();
		assertTrue(dictionnaire.anagrammes("CHIEN").isEmpty());
	}

}
