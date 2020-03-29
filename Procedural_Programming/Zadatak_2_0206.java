package itbootcamp.domaci;

import java.util.Locale;
import java.util.Scanner;

public class Zadatak_2_0206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		String mesec = null;
		String slovo;
		
	
		while (mesec != " ") {
			System.out.println("Unesite naziv meseca:");
			mesec = s.next();
			mesec = mesec.toLowerCase();
			if (!(mesec.equals("januar")) && !(mesec.equals("februar")) && !(mesec.equals("mart"))
					&& !(mesec.equals("april")) && !(mesec.equals("maj")) && !(mesec.equals("jun"))
					&& !(mesec.equals("jul")) && !(mesec.equals("avgust"))&& !(mesec.equals("septembar"))
					&& !(mesec.equals("oktobar")) && !(mesec.equals("novembar")) && !(mesec.equals("decembar"))) {
				System.out.println("Nije unet ispravan naziv meseca.");
				continue;
			} else {
				slovo = String.valueOf(mesec.charAt(0));
				
				switch (slovo) {
				case "j":
					System.out.println("Na pocetno slovo izabranog meseca pocinje naziv 3 meseca u godini.");
					break;
				case "m":
				case "a":
					System.out.println("Na pocetno slovo izabranog meseca pocinje naziv 2 meseca u godini.");
					break;
				case "f":
				case "s":
				case "o":
				case "n":
				case "d":
					System.out.println("Na pocetno slovo izabranog meseca pocinje naziv jednog meseca u godini.");
					break;
				}
				
			}
			break;
			
		}

	}
}
