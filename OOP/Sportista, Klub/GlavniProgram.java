package itbootcamp.domaci0309;

import java.util.Arrays;

public class GlavniProgram {

	public static void main(String[] args) {


		Sportista s1 = new Sportista("pera", "peric", 1988);
		Sportista s2 = new Sportista("zika", "zikic", 1989);
		Sportista s3 = new Sportista("peka", "zeka", 1988);
		
		Klub k1 = new Klub("Zvezda", "Beograd", 1950);
		Klub k2 = new Klub("Partizan", "Beograd", 1950);
		
		
		System.out.println(s1.getIme());
		System.out.println(s1.getGodRodjenja());
		
		System.out.println(k1);
		
		k1.setNizSportista(s1);
		k1.setNizSportista(s2);
		
		System.out.println("Za klub k1 igraju: "+ Arrays.toString(k1.getnizSportista()));
		
		s3.setnizKlubova(k1);
		s3.setnizKlubova(k2);
		
		System.out.println("Sportista s3 je igrao u klubovima: " + Arrays.toString(s3.getNizKlubova()));
	}

}
