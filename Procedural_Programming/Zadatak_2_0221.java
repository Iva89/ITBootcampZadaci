package itbootcamp.domaci0221;

public class Zadatak_2_0221 {

	public static void main(String[] args) {
		
		/*
		 * Napisati program koji ce prebrojati koliko je brojeva od 
		 * 9 do 250 (ukljucujuci i njih) deljivih brojem 3.
		 */
		int brojac = 0;
		for(int i = 9; i<=250; i++) {
			if (i%3==0) {
				brojac++;
			}

		}
		System.out.println("Od 9 do 250 postoji " + brojac + " broj koji je deljiv sa 3.");

	}

}
