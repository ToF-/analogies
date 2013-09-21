import java.util.Arrays;


public class Entree {

	private String mot;
	private String clef;

	public Entree(String mot) {
		this.mot = mot;
		char[] chars  = mot.toCharArray();
		Arrays.sort(chars);
		this.clef = new String(chars);
	}

	public String mot() {
		return mot;
	}

	public boolean estAnagramme(Entree entree) {
		return (!this.mot().equals(entree.mot()) && this.clef().equals(entree.clef()));
	}

	public String clef() {
		return clef;
	}
}
