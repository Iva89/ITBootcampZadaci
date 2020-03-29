package Zadatak_2_0313;

public class GlavniProgramPozoriste {

	public static void main(String[] args) {
		
		Pozoriste p1 = new Pozoriste("Pozoristance");
		Glumac g1 = new Glumac("Pera Peric", p1, "programer");
		Glumac g2 = new Glumac("Mika Mikic", p1, "programer2");
		Reditelj r1 = new Reditelj("Zika Zikic", p1, "Ziks");	
		
		Predstava p = new Predstava("Programeri", p1);
		
		p.dodajZaposlenog(g1);
		p.dodajZaposlenog(g2);
		p.dodajZaposlenog(r1);
		
		System.out.println(Predstava.getBrZaposlenih());
		
		System.out.println(g1.toString());
		System.out.println(p.toString());
		
		p.ukloniZaposlenog(g1);
		System.out.println(Predstava.getBrZaposlenih());
		
	
		
		

	}

}
