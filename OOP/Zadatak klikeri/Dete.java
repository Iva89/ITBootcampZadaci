package Zadatak_1_0313;

public class Dete {

	private String ime;
	private String prezime;
	private int brGod;
	private int brKlikera;
	private static int globalBrKlikera;
	private static int globalbrGod;
	private static int brojac;
	
	public Dete(String ime, String prezime, int brGod, int brKlikera) {
		this.ime = ime;
		this.prezime = prezime;
		this.brGod = brGod;
		this.brKlikera = brKlikera;
		globalBrKlikera += brKlikera;
		globalbrGod += brGod;
		brojac +=1;
		
	}
	
	public String getIme() {
		return ime;
	}
	
	public String getPrezime(){
		return prezime;
	}
	
	public int getBrGod() {
		return brGod;
	}
	
	public static int getProsecanBrGodina() {
		return globalbrGod / brojac;
	}
	
	public void dodajKlikere(int brKlikera) {
		this.brKlikera += brKlikera;
		globalBrKlikera += brKlikera;
	}
	
	public void oduzmiKlikere(int brKlikera) {
		this.brKlikera -= brKlikera;
		globalBrKlikera -= brKlikera;
	}
	
	public static int getUkupanBrKlikera() {
		return globalBrKlikera;
	}
	public int getBrKlikera() {
		return brKlikera;
	}
	
}
