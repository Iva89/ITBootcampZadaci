package itbootcamp.domaci;

import java.util.Scanner;

public class Zadatak_2_0220 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan
		 * broj, i ispisuje njihov zbir (zbir pozitivnih brojeva). primer: ako korisnik
		 * unese 1 2 5 3 -1, program treba da ispise 11
		 */

		Scanner s = new Scanner(System.in);

		System.out.println("Molimo unesite brojeve za koje zelite da dobije zbir pozitivnih brojeva:");

		int zbir = 0;

		int n = s.nextInt();

		if (n > 0) {

			while (n >= 0) {

				zbir += n;

				n = s.nextInt();
			}

			System.out.println("Zbir je:" + zbir);
		} else {
			System.out.println("Uneli ste negativan broj. Program sabira samo pozitivne.");
			
		}
	}
}
