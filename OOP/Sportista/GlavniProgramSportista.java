package itbootcamp.domaci0306;

public class GlavniProgramSportista {

	public static void main(String[] args) {
		
		Sportista s1 = new Sportista("pera peric", "hokej", "partizan", 22);
		System.out.println(s1.getBr());
		s1.setBr(23);
		System.out.println(s1.getBr());
		
	}

}
