package itbootcamp.domaci0221;

import java.util.Scanner;

public class Zadatak_4_0221 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("Molimo unesite broj za koji zelite da proverite Fibonacijev niz:");
		
		int n = s.nextInt();
		int a = 0;
		int b = 1;
		int clanNiza = 0;
		for (int i = 0; i < n; i++) {
			System.out.print(clanNiza + " ");
			clanNiza =a + b;
			b = a;
			a = clanNiza;
		}
	}

}
