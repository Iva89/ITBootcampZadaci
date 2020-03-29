package itbootcamp.domaci0221;

import java.util.Scanner;

public class Zadatak_3_0221 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("Molimo unesite broj redova:");
		int n = s.nextInt();
		System.out.println("Molimo unesite broj kolona:");
		int m = s.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
