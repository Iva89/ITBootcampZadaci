package Zadatak_2_0313;

public class Reditelj extends Zaposleni{

	private String nadimak;

	public Reditelj(String imePrezime, Pozoriste p, String nadimak) {
		super(imePrezime, p);
		this.nadimak = nadimak;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(nadimak).append("_").append(imePrezime).append("[").
		append(pozoriste).append("]");
		
		return sb.toString();
	}
}
