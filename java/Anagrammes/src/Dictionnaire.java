import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class Dictionnaire {

	private ArrayList<Entree> entrees;
	private HashMap<String,ArrayList<String>> anagrammes;

	public Dictionnaire() {
		entrees = new ArrayList<Entree>();
		anagrammes = new HashMap<String,ArrayList<String>>();
	}
	
	private String calculeClef(String mot) {
		char[] chars  = mot.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}
	
	public List<String> anagrammes(String recherche) {
		String clef = calculeClef(recherche);
		ArrayList<String> resultat = new ArrayList<String>();
		ArrayList<String> mots = anagrammes.get(clef);
		if(mots!=null)
			for(int i=0; i<mots.size(); i++) {
				String mot = mots.get(i);
				if (!mot.equals(recherche))
					resultat.add(mot);
			}
		return resultat;
	}

	public void ajoute(String mot) {
		if(contient(mot))
			return;
		Entree entree = new Entree(mot);
		entrees.add(entree);
		String clef = entree.clef();
		ArrayList<String> mots = anagrammes.get(clef);
		if(mots == null) {
			anagrammes.put(clef,new ArrayList<String>());
			mots = anagrammes.get(clef);
		}
		mots.add(mot);
	}
	public boolean contient(String mot) {
		Entree entree = new Entree(mot);
		String clef = entree.clef();
		ArrayList<String> mots = anagrammes.get(clef);
		if (mots != null)
			for(int i=0; i<mots.size(); i++) {
				if(mots.get(i).equals(mot))
					return true;
			}
		return false;
	}

}
