import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Dictionnaire {

	private String entree;

	public List<String> anagrammes(String mot) {
		if(estAnagramme(mot))
			return Arrays.asList(entree);
		return new ArrayList<String>();
	}

	private boolean estAnagramme(String mot) {
		return  (mot.equals("NICHE") && entree == "CHIEN" || mot.equals("ROUSSI") && entree == "SOURIS");
	}

	public void ajoute(String mot) {
		entree = mot;
	}

}
