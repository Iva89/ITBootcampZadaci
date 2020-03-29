package nasledjivanje;

public class GlavniProgAutobus {

	public static void main(String[] args) {

		Covek c1 = new Covek("Pera", "Peric");
		Putnik p1 =new Putnik("Pera", "Peric", 500.0);
		Putnik p2 = new Putnik("Zika", "Peric", 300.0);
		Putnik p3 = new Putnik("Mika", "Zikic", 100.0);
		
		System.out.println(p2.getIme());
		Vozac v1 = new Vozac("Zika", "Mikic", "sofer");
		Autobus aaa = new Autobus("Autobus1", v1, 200.0);
		
		System.out.println("Cena karte je: " + aaa.getCenaKarte());
		
		System.out.println("p1: ");
		aaa.dodajPutnika(p1);
		System.out.println("p2: ");
		aaa.dodajPutnika(p2);
		System.out.println("p3: ");
		aaa.dodajPutnika(p3);
		
		aaa.dodajVozaca(v1);
		
		System.out.println(aaa);
		
		
	}

}
