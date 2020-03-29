package Zadatak_2_0313;

public class Glumac extends Zaposleni {

	private String nazivUloge;

	public Glumac(String imePrezime, Pozoriste p, String nazivUloge) {
		super(imePrezime, p);
		this.nazivUloge = nazivUloge;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nazivUloge).append("_").append(imePrezime).append("[").
		append(pozoriste).append("]");
		return sb.toString();
	}

}
