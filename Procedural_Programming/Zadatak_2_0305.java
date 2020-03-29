package itbootcamp.domaci0305;

import java.util.Scanner;

public class Zadatak_2_0305 {

	public static int[] upisiNiz(Scanner sc) {
		int niz[] = new int[4];
		for (int i = 0; i < 4; i++) {
			niz[i] = sc.nextInt();
		}
		return niz;
	}

	public static boolean proveraUnosa(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] > 8 || niz[i] < 1) {
				return true;
			}
		}
		return false;
	}

	public static String proveraPionNapada(int[] niz) {
		if (niz[2] == niz[0] - 1 && (niz[3] == niz[1] - 1 || niz[3] == niz[1] + 1)) {
			return "Skakac je napadnut.";
		} else {
			return "Skakac nije napadnut.";
		}

	}
	
	public static String proveriSkakacNapada(int[] niz) {
		if ((niz[2] == niz[0] + 2 && (niz[3] == niz[1] +1 || niz[3] == niz[1]-1)) ||
		(niz [2] == niz[0]+1 && (niz[3] == niz[1]-2 || niz[3] == niz[1]+2)) ||
		(niz [2] == niz[0]-1 && (niz[3] == niz[1]-2 || niz[3] == niz[1]+2)) ||
		(niz [2] == niz[0]-2 && (niz[3] == niz[1]-1 || niz[3] == niz[1]+1))){
			return "Pion je napadnut.";
		}
		else return "Pion nije napadnut.";
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int[] niz1 = new int[4];
		System.out.println("Molimo unesite pozicije piona i skakaca: ");
		niz1 = upisiNiz(s);
		
		
		boolean provera = proveraUnosa(niz1);
		while ( provera == true) {
			System.out.println("Niste uneli validnu vrednost.\r\n" + "Prihvataju se indeksi pozicija od 1 do 8.\r\n"
					+ "Molimo unesite poziciju ponovo.");
			niz1 = upisiNiz(s);
			provera = proveraUnosa(niz1);
		}
		
		System.out.println(proveraPionNapada(niz1));
		
		System.out.println(proveriSkakacNapada(niz1));
		
	}
}


