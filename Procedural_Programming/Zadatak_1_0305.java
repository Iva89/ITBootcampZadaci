package itbootcamp.domaci0305;

import java.util.Scanner;

public class Zadatak_1_0305 {
	
	public static int[] ispisiNiz (Scanner sc) {
		System.out.println("Molimo unesite broj elemenata niza: ");
		int n = sc.nextInt();
		int [] niz = new int [n];
		System.out.println("Molimo unesite elemente niza: ");
		for (int i = 0; i <n; i++) {
			niz[i] = sc.nextInt();
		}
		return niz;
	}
	
	public static String provera (int [] niz1) {
		boolean b = false;
		for (int i = 0; i <=(niz1.length)/2; i++) {
			if (niz1[i] != niz1[niz1.length - (i+1)])
				b = true;
		}
		if (b == true) {
			return "Niz nije palindrom.";
		}
		else
			return "Niz je palindrom.";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
			
		int niz [] = ispisiNiz(s);
		
		System.out.println(provera(niz));
	}

}
