package itbootcamp.domaci0302;

import java.util.Scanner;

public class Zadatak_1_0302 {

	public static void main(String[] args) {
		
		//palindrom, cesto na intervjuu
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Molimo unesite br elemenata niza: ");
		int n = s.nextInt();
		int[] niz = new int[n];
		System.out.println("Molimo unesite elemente niza: ");
		for (int i = 0; i <n; i++) {
			niz[i] = s.nextInt();
		}
		boolean b = false;
		for (int i = 0; i <= n/2; i++) {
			if (niz[i] != niz[n-(i+1)]) {
				b = true;
			}
		}
		if (b == true) {
			System.out.println("Niz nije palindrom.");
		}
		else {
			System.out.println("Niz je palindrom.");
		}
			
		
	}

}
