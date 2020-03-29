package itbootcamp.domaci0221;

import java.util.Scanner;

public class Zadatak_1_0221 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		boolean b = false;
		int unos;
		float iznosRacuna = 0;
		float cena;

		do {
			System.out.println("Molimo unesite neku od ponudjenih opcija:\r\n0-izlaz iz programa\r\n"
					+ "1 - ubacivanje u potrosacku korpu\r\n" + "2 - naplata racuna\r\n");
			unos = s.nextInt();
			b = false;

			if (unos == 1) {
				while (b == false) {
					System.out.println("Molimo unesite cenu proizvoda:");
					cena = s.nextFloat();
					iznosRacuna += cena;
					System.out.println(iznosRacuna);
					System.out.println("Dodajte nov proizvod: da ili ne");
					String odgovor = s.next();
					odgovor = odgovor.toLowerCase();

					if (odgovor.equals("da")) {
						b = false;
						continue;
					} else {
						b = true;
						continue;
					}
				}

			}

			else if (unos == 2) {
				System.out.println("Molimo unesite kolicinu novca za naplatu racuna:");
				float placanje = s.nextFloat();

				if (placanje < iznosRacuna) {
					System.out.println("Nemate dovoljno novca. Molimo pokusajte ponovo.");
					continue;
				} else {
					System.out.println("Kusur iznosi " + (placanje - iznosRacuna));
					iznosRacuna = 0;
					continue;
				}
			}

			else {
				continue;
			}
		} while (unos != 0);

	}
}
