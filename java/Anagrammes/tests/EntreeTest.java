import static org.junit.Assert.*;

import org.junit.Test;


public class EntreeTest {

	@Test
	public void UneEntreePossedeUnMot() {
		Entree entree = new Entree("CHAT");
		assertEquals("CHAT", entree.mot());
	}
	
	@Test 
	public void UneEntreePeutEtreAnagrammeDuneAutreEntree() {
		Entree entree1 = new Entree("CHIEN");
		Entree entree2 = new Entree("NICHE");
		assertTrue(entree1.estAnagramme(entree2));
	}

	@Test
	public void UneEntreeNEstPasAnagrammeDelleMeme() {
		assertFalse(new Entree("CHAT").estAnagramme(new Entree("CHAT")));
	}
}
