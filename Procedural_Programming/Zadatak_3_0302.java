package itbootcamp.domaci0302;

import java.util.Scanner;

public class Zadatak_3_0302 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Molimo unesite recenicu za proveru: ");
		
		String recenica = s.nextLine();
		
		String[] niz = recenica.split(" ");
		
		int broj = 0;
		
		for (int i = 0; i < niz.length; i++) {
			String rec = niz[i];
			if(rec.charAt(0) == 'd') {
				broj ++;
			}
		}
		System.out.println("Postoji/e " + broj + " reci koje pocinju na slovo d.");
	}

}
