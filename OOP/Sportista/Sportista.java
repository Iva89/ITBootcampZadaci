package itbootcamp.domaci0306;

public class Sportista {

	private String imePrezime;
	private String sport;
	private String klub;
	private int brDresa;
	
	public Sportista(String ip, String sp, String k, int br) {
		imePrezime = ip;
		sport = sp;
		klub = k;
		brDresa = br;
	}
	
	public String getImePrezime() {
		return imePrezime;
	}
	
	public String getSport() {
		return sport;
	}
	
	public String getKlub() {
		return klub;
	}
	
	public void setKlub(String k) {
		klub = k;
	}
	
	public int getBr() {
		return brDresa;
	}
	
	public void setBr(int b) {
		brDresa = b;
	}
}
