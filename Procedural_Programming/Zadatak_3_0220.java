package itbootcamp.domaci;

import java.util.Scanner;

public class Zadatak_3_0220 {

	public static void main(String[] args) {
		/*
		 * Napisati 8 primera za post inkrementu (i++), pre inkrementu (++i), post
		 * dekrementu (i--) i pre dekrementu (--i) i u programu u komentarima opisati
		 * kako koji primer funkcionise. Napisati po 2 primera o svakom, koristeci
		 * promenljive a, b, c koje su i deklarisane i definisane
		 */

		Scanner s = new Scanner(System.in);

		int a, b, c;

		System.out.println("Primeri za post inkrementu:");
		a = 10;
		b = 12;
		c = a++ + b++ - a++;
		System.out.println("Za a = 10 i b = 12, c= a++ + b++ - a++, c iznosi: " + c);
		/*
		 * Ucita se vrednost a = 10 (pa se poveca za 1 i a postaje 11), ucita se b =
		 * 12(nakon toga se doda 1 u b, b postaje 13) i na kraju ucita se
		 * poslednja vrednost a = 11 (nakon cega a uzima vrednost 12, koja ne ulazi u
		 * sumu, znaci c = 10 + 12 - 11)
		 */

		a = 5;
		b = -3;
		c = a++ - b++ - b++;
		System.out.println("Za a = 5 i b = -3, c= a++ - b++, c iznosi: " + c);
		/*
		 * c = 5 - (-3) - (-2) = 10
		 */

		System.out.println("Primeri za pre inkrementu:");
		a = 10;
		b = 12;
		c = ++a + ++b - ++a;
		System.out.println("Za a = 10 i b = 12, c= ++a + ++b - ++a, c iznosi: " + c);
		/*
		 * c = 11 + 13 - 12 = 12
		 */
		a = 5;
		b = -3;
		c = ++a - ++b - ++b;
		System.out.println("Za a = 5 i b = -3, c= ++a - ++b - ++b, c iznosi: " + c);
		/*
		 * c = 6 - (-2) - (-1) = 9
		 */
		
		System.out.println("Primeri za post dekrementu:");
		a = 10;
		b = 12;
		c = a-- + b-- - a--;
		System.out.println("Za a = 10 i b = 12, c = a-- + b-- - a--, c iznosi: " + c);
		/*
		 * c = 10 + 12 - 9 = 13
		 */
		a = 5;
		b = -3;
		c = a-- - b-- - b--;
		System.out.println("Za a = 5 i b = -3, c = a-- - b-- - b--, c iznosi: " + c);
		/*
		 * c = 5 - (-3) - (-4) = 12
		 */
	
		System.out.println("Primeri za pre dekrementu:");
		a = 10;
		b = 12;
		c = --a + --b - --a;
		System.out.println("Za a = 10 i b = 12, c = --a + --b - --a, c iznosi: " + c);
		/*
		 * c = 9 + 11 - 8 = 12
		 */
		a = 5;
		b = -3;
		c = --a - --b - --b;
		System.out.println("Za a = 5 i b = -3, c = --a - --b - --b, c iznosi: " + c);
		/*
		 * c = 4 - (-4) - (-5) = 13
		 */
	}

}
