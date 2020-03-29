package nasledjivanje;

public class Covek {

	private String ime;
	private String prezime;
	
	
	public Covek(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}
	
	public String getIme() {
		return ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	public String toString() {
		return ime +"_"+prezime;
	}
	
}
