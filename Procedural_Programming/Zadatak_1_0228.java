package itbootcamp.domaci0228;

import java.util.Scanner;

public class Zadatak_1_0228 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Molimo unesite br elemenata niza:");
		int n = s.nextInt();

		int[] niz = new int[n];

		System.out.println("Molimo unesite br za koji zelite da proverite deljivost elemenata niza: ");
		int m = s.nextInt();

		System.out.println("Molimo unesite elemente niza:");

		for (int i = 0; i < n; i++) {
			niz[i] = s.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (niz[i] % m == 0) {
				System.out.print(niz[i]+ " ");
			}

		}

	}

}
