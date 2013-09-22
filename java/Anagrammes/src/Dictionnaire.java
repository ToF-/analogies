import java.util.ArrayList;
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
		if(!contient(mot)) { 
			Entree entree = new Entree(mot);
			entrees.add(entree);
		}
		
	}
	public boolean contient(String mot) {
		for(int i=0; i<entrees.size(); i++) {
			if(entrees.get(i).mot().equals(mot))
				return true;
		}
		return false;
	}

}
