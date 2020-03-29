package nasledjivanje;

import java.util.ArrayList;

public class Autobus {

	private String naziv;
	private Vozac vozac;
	private double cenaKarte=0.0;
	private ArrayList <Putnik> putnici;
	
	public Autobus(String naziv, Vozac vozac, double cenaKarte) {
		this.naziv = naziv;
		this.cenaKarte = cenaKarte;
		putnici = new ArrayList<>();
	}

	public String getNaziv() {
		return naziv;
	}

	public Vozac getVozac() {
		return vozac;
	}

	public double getCenaKarte() {
		return cenaKarte;
	}

	public ArrayList<Putnik> getPutnici() {
		return putnici;
	}
	
	public void dodajPutnika(Putnik p) {
		if (p.oduzmiNovac(this)== true)
		putnici.add(p);
		else {System.out.println("Karta nije naplacena.");
			System.out.println("Putnik ce biti uklonjen.");
		this.ukloniPutnika(p);}
	}
	
	public void ukloniPutnika(Putnik p) {
			putnici.remove(p);
			}

	
	public void ukloniVozaca(Vozac v) {
		vozac = null;
	}
	
	public void dodajVozaca(Vozac v) {
		vozac = v;
	}
	public boolean vozacPrisutan() {
		if (vozac != null)
			return true;
		else 
			return false;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(naziv).append(" ").append("(").append(vozac).append("-");

		for(int i = 0; i<putnici.size(); i++) {
			sb.append(putnici.get(i)).append("[").
			append(putnici.get(i).getNovac()).append("]").append(", ");
		}
		sb.append(")");
		return sb.toString();
	}
	
}
