package itbootcamp.domaci0309;

public class Klub {

	private String naziv;
	private String sediste;
	private int godOsnivanja;
	private Sportista[] nizSportista  =new Sportista[10];
	

	
	public Klub (String naziv, String sediste, int godOsnivanja) {
		this.naziv = naziv;
		this.sediste = sediste;
		this.godOsnivanja = godOsnivanja;
	}
	
	public String getNaziv() {
		return naziv;
	}
	
	public void setNaziv(String naz) {
		naziv = naz;
	}
	
	public String getSediste() {
		return sediste;
	}
	
	public int getGodOsnivanja() {
		return godOsnivanja;
	}
	
	public String toString() {
		return naziv;
	}
	
	public void setNizSportista(Sportista s) {
		for (int i=0; i<nizSportista.length; i++) {
			if (nizSportista[i]== null) {
				nizSportista[i] = s;
				break;
			}
		}
			
	}
	
	public Sportista [] getnizSportista(){
		return nizSportista;
	}
	
}
