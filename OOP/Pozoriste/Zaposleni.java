package Zadatak_2_0313;

public class Zaposleni {

	protected String imePrezime;
	protected Pozoriste pozoriste;
	
	public Zaposleni(String imePrezime, Pozoriste p) {
		this.imePrezime = imePrezime;
		this.pozoriste = p;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(imePrezime).append("[").append(pozoriste).append("]");
		return sb.toString();
	}
}
