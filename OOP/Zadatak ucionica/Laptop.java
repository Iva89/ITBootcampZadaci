package ucionica;

import java.util.ArrayList;
import java.util.Arrays;

public class Laptop {

	private ArrayList<Polaznik> polaznici;
	private String marka;
	
	public Laptop(String marka) {
		this.marka = marka;
	}

	public Laptop(Polaznik polaznici, String marka) {
		this.polaznici = new ArrayList<>();
		this.marka = marka;
	}

	public String getMarka() {
		return marka;
	}
	
	public void setDodajPolaznika(Polaznik p) {
		polaznici.add(p);
	}

	public void setObrisiPolaznika(Polaznik p) {
		int index = polaznici.size();
		polaznici.remove(index-1);
	}
	
	public String getPolaznici () {
		String  s = Arrays.toString(polaznici.toArray());
	return s;
	} 
	

	

	
}
