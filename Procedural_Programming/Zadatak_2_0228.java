package itbootcamp.domaci0228;

import java.util.Scanner;

public class Zadatak_2_0228 {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		
		System.out.println("Molimo unesite broj elemenata niza:");
		int n = s.nextInt();
		int [] niz = new int [n];
		int [] niz1 = new int [n];
		
		System.out.println("Molimo unesite elemente niza: ");
		for (int i = 0; i<n; i++) {
			niz[i] = s.nextInt();
		}
		System.out.println("Inverzni niz je: ");
		for(int j = 0; j<n; j++) {
			niz1[j] = niz[n-(j+1)];
			System.out.print(niz1[j] + " ");
		}

	}

}
