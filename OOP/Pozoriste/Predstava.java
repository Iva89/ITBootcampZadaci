package Zadatak_2_0313;

import java.util.ArrayList;

public class Predstava {

	private String naziv;
	private Pozoriste pozoriste;
	private  ArrayList <Zaposleni> listaZaposlenih;
	private static int brZaposlenih;
	public Predstava(String naziv, Pozoriste pozoriste) {
		super();
		this.naziv = naziv;
		this.pozoriste = pozoriste;
		listaZaposlenih = new ArrayList<Zaposleni>();
		
	}
	
	
	public void dodajZaposlenog(Zaposleni z) {
		listaZaposlenih.add(z);
		brZaposlenih++;
	}
	
	public void ukloniZaposlenog(Zaposleni z) {
		listaZaposlenih.remove(z);
		brZaposlenih--;
	}
	
	public static int getBrZaposlenih() {
		return brZaposlenih;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(naziv).append(", ");
		sb.append("Zaposleni: ");
		sb.append("\n");
		for (int i = 0; i< listaZaposlenih.size(); i++) {
			sb.append(listaZaposlenih.get(i));
			sb.append("\n");
		}
		
		return sb.toString();
	}
}
