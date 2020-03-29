package itbootcamp.domaci0228;

import java.util.Scanner;

public class Zadatak_3_0228 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Molimo unesite broj elemenata niza: ");
		int n = s.nextInt();

		int[] niz = new int[n];

		System.out.println("Molimo unesite elemente niza: ");
		for (int i = 0; i < n; i++) {
			niz[i] = s.nextInt();
		}

		int brojac = 0;
		for (int i = 0; i < n - 1; i++) {
			if (niz[i] < niz[i + 1]) {
				brojac += 1;
			}
		}
		//brojac se uporedjuje sa n-1 zato sto petlja prolazi toliko iteracija
		//ako je brojac jednak broju iteracija to znaci da je svakom iteracijom ispunjen uslov
		if (brojac == n - 1) {
			System.out.println("Niz je rastuci.");
		} else {
			System.out.println("Niz nije rastuci.");
		}
	}

}
