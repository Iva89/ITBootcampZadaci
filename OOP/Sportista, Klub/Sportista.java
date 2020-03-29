package itbootcamp.domaci0309;

public class Sportista {

	private String ime;
	private String prez;
	private int godR;
	private Klub[] nizKlubova = new Klub[10];
	
	public Sportista (String i, String p, int godRodjenja) {
		ime = i;
		prez = p;
		godR = godRodjenja;
	}
	
	public String getIme() {
		return ime;
	}
	
	public String getPrezime() {
		return prez;
	}
	
	public int getGodRodjenja() {
		return godR;
	}
	
	public String toString() {
		return ime.toUpperCase() + "_"+ prez.toUpperCase() + "(" + godR + ")"; // \n da prebaci noovog sportistu u nov red
		//prvo def String s = ...
		//for(int i = 0; i< sp.length; i++){
		// s += sp[i]+"\n"
		// return s
	}
	
	public void setnizKlubova(Klub k) {
		for (int i = 0; i<nizKlubova.length; i++) {
			if (nizKlubova[i] == null) {
				nizKlubova[i]= k;
				break;
			}
		}
	}
	
	public Klub[] getNizKlubova(){
		return nizKlubova;
	}
}
