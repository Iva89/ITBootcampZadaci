package itbootcamp.domaci;

import java.util.Scanner;

public class Zadatak_1_0204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float sir;
		float duz;
		float vis;

		Scanner s = new Scanner(System.in);
		System.out.println("Program za izracunavanje povrsine za krecenje. Potreban je unos dimenzija sobe i dimenzija vrata.");
		System.out.println("Unesite dimenzije sobe i vrata u metrima.");
		System.out.println("Duzina sobe:");
		duz = s.nextFloat();
		if (duz <= 0) {
			System.out.println("Uneli ste neadekvatnu vrednost. Molimo ponovo unesite duzinu sobe.");
			duz = s.nextFloat();
		}
		System.out.println("Sirina sobe:");
		sir = s.nextFloat();
		if (sir <= 0) {
			System.out.println("Uneli ste neadekvatnu vrednost. Molimo ponovo unesite sirinu sobe.");
			sir = s.nextFloat();
		}
		System.out.println("Visina sobe:");
		vis = s.nextFloat();
		if (vis <= 0) {
			System.out.println("Uneli ste neadekvatnu vrednost. Molimo ponovo unesite visinu sobe.");
			vis = s.nextFloat();
		}

		System.out.println("Unesite sirinu vrata:");
		float sirV;
		sirV = s.nextFloat();
		if (sirV <= 0) {
			System.out.println("Uneli ste neadekvatnu vrednost. Molimo ponovo unesite sirinu vrata.");
			sirV = s.nextFloat();
		}
		System.out.println("Unesite visinu vrata:");
		float visV;
		visV = s.nextFloat();
		if (visV <= 0) {
			System.out.println("Uneli ste neadekvatnu vrednost. Molimo ponovo unesite visinu vrata.");
			visV = s.nextFloat();
		}

		float P;

		P = 2 * vis * (duz + sir) + duz * sir - (sirV * visV);
		System.out.println("Povrsina za krecenje iznosi: " + P + " m2.");

	}

}
