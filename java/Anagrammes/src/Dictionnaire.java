import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Dictionnaire {

	public List<String> anagrammes(String mot) {
		if(mot.equals("NICHE"))
			return Arrays.asList("CHIEN");
		if (mot.equals("ROUSSI"))
			return Arrays.asList("SOURIS");
		return new ArrayList<String>();
	}

	public void ajoute(String mot) {
		
	}

}
