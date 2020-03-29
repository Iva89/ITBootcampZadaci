package Zadatak_1_0313;

public class GlavniProgramDete {

	public static void main(String[] args) {

		Dete Kosta = new Dete("Kosta", "Djokic", 3, 3);
		Dete Klara = new Dete("Klara", "Djokic", 1, 1);

		System.out.println(Dete.getProsecanBrGodina());
		System.out.println(Dete.getUkupanBrKlikera());
	}

}
