package nasledjivanje;

public class Vozac extends Covek{
	
	private String zvanje= null;

	public Vozac(String ime, String prezime, String zvanje) {
		super(ime, prezime);
		this.zvanje = zvanje;
	}

	public String getZvanje() {
		return zvanje;
	}
	
	public String toString() {
		return this.getIme() + " " +this.getPrezime();
	}
}
