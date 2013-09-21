import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Dictionnaire {

	private ArrayList<Entree> entrees;

	public Dictionnaire() {
		entrees = new ArrayList<Entree>();
	}
	public List<String> anagrammes(String mot) {
		Entree autre = new Entree(mot);
		ArrayList<String> resultat = new ArrayList<String>();
		for(int i=0; i<entrees.size(); i++) {
			Entree entree = entrees.get(i);
			if(entree.estAnagramme(autre))
				resultat.add(entree.mot());
		}
		return resultat;
	}

	public void ajoute(String mot) {
		entrees.add(new Entree(mot));
	}

}
