package Zadatak_2_0313;

public class Pozoriste {

	private static int id=0;
	private String naziv;
	
	public Pozoriste(String naziv) {
		this.naziv = naziv;
		id +=1;
	}
	
	public String getNazivPozorista() {
		return naziv;
	}
	
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append(naziv).append("[").append(id).append("]");
		return sb.toString();
	}
	
}
