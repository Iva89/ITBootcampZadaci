package itbootcamp.domaci;

import java.util.Scanner;

public class Zadatak_1_0206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * U zgradi se nalazi lift nosivosti 680kg. Napisati program koji proverava da
		 * li ce lift bezbedno krenuti u zavisnostii od tezine koju treba da ponese.
		 * Podrazumevane 3 opcije: Lift je preopterecen; Na granici je; Lift je pokrenut
		 */

		Scanner s = new Scanner(System.in);
		int nosivost = 680;
		float opterecenje;
		boolean pokazatelj = true;
		int odgovor;

		System.out.println("Unesite opterecenje:");

		opterecenje = s.nextFloat();

		while (pokazatelj = true)

		{
			if (opterecenje < 0) {

				System.out.println("Opterecenje ne moze biti negativno. Unesite opterecenje ponovo.");
				opterecenje = s.nextFloat();
			} else {
				if (opterecenje < nosivost) {
					System.out.println("Lift je pokrenut.");
				} else if (opterecenje == nosivost) {
					System.out.println("Na granici je.");
				} else {
					System.out.println("Lift je preopterecen.");
				}
				
			}
			System.out.println("Da li zelite ponovni unos? Unesite 1 za Da ili 2 za Ne.");
			odgovor = s.nextInt();
			if (odgovor == 1) {
				pokazatelj = true;
				System.out.println("Unesite opterecenje:");
				opterecenje = s.nextFloat();
				
			} 
			else {
				break;
			}	
		}
		
	}
}
