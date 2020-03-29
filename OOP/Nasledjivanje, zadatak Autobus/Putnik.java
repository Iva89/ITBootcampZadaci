package nasledjivanje;

public class Putnik extends Covek{

	private double novac;
	
	public Putnik(String ime, String prezime, double novac) {
		super(ime, prezime);
		this.novac = novac;
	}
	
	public double getNovac() {
		return novac;
	}
	
	public boolean ImaLiNovca(Autobus a) {
		if((novac - a.getCenaKarte())> 0) {
			return true;
		}
		else return false;
	}
	public boolean dodajNovac(Autobus a) {
		if(ImaLiNovca(a) == true) {
				this.novac += (novac - a.getCenaKarte());
				return true;}
		else return false;
		}

	
	public boolean oduzmiNovac(Autobus a) {
		if(novac>= a.getCenaKarte()) {
		novac -=a.getCenaKarte();
		return true;}
		else {
			return false;
		}
	}
}
