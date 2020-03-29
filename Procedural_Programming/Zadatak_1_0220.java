package itbootcamp.domaci;

import java.util.Scanner;

public class Zadatak_1_0220 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji racuna sumu parnih brojeva i 
		 * proizvod neparnih brojeva od 0 do n - za resavanje ovog zadatka 
		 * koristiti samo jednu petlju (ne jednu vrstu petlje, vec samo jednu petlju).
		 */

		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Molimo unesite neki broj (n) za koji zelite da se prikaze suma i proizvod brojeva od 0-n.");
		
		int n = s.nextInt();
		int zbir = 0;
		int proizvod = 1;
		
		for (int i = 1; i <= n; i++) {
			
			if(i%2 == 0) {
			zbir += i;}
			else {
			proizvod *= i;}
			
		}
		System.out.println("Suma je " + zbir);
		System.out.println("Proizvod je " + proizvod);
	}

}
