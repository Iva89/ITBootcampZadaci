package itbootcamp.domaci0302;

import java.util.Scanner;

public class Zadatak_2_0302 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Molimo unesite duzinu niza: ");
		int n = s.nextInt();
		
		int proizvod = 1;
		int[] niz = new int[n];
		System.out.println("Molimo unesite clanove niza: ");
		for(int i = 0; i<n; i++) {
			niz[i] = s.nextInt();
		}
		for (int i = 0; i<n; i++) {
			if(niz[i]> i) {
				proizvod *= niz[i];
			}
		}
		System.out.println("Proizvod clanova niza koji su veci od svog indeksa je: " + proizvod);
			
		
	}

}
