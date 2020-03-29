package ucionica;

public class GlavniProgram {

	public static void main(String[] args) {
		
		Polaznik p1 = new Polaznik("pera", "peric");
		Polaznik p2 = new Polaznik("zika", "peric");
		Polaznik p3 = new Polaznik("mika", "peric");
		Polaznik p4 = new Polaznik("mika", "mikic");
		Polaznik p5 = new Polaznik("mika", "zikic");
		
		Laptop l1 = new Laptop(p1, "lenovo");
		l1.setDodajPolaznika(p1);
		l1.setDodajPolaznika(p2);
		Laptop l2 = new Laptop(p3,"acer");
		l2.setDodajPolaznika(p3);
		l2.setDodajPolaznika(p4);
		l2.setDodajPolaznika(p5);
		
		System.out.println((l1.getMarka()).toUpperCase() + l1.getPolaznici());
		l1.setObrisiPolaznika(p2);
		System.out.println((l1.getMarka()).toUpperCase() + l1.getPolaznici());
		System.out.println((l2.getMarka()).toUpperCase() + l2.getPolaznici());
	}

}
