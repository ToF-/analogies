import java.util.Arrays;


public class Entree {

	private String mot;
	private String clef;

	public String mot() { return mot; }
	public String clef() { return clef; }

	public Entree(String mot) {
		calculeClef(mot);
	}
	private void calculeClef(String mot) {
		this.mot = mot;
		char[] chars  = mot.toCharArray();
		Arrays.sort(chars);
		this.clef = new String(chars);
	}

	public boolean estAnagramme(Entree entree) {
		return (!this.mot().equals(entree.mot()) && this.clef().equals(entree.clef()));
	}

}
