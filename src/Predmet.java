
public class Predmet {
	
	private String ime_predmeta;
	private int broj_casova;
	
	public Predmet(String ime_predmeta, int broj_casova) {
		this.ime_predmeta = ime_predmeta;
		this.broj_casova = broj_casova;
	}

	public String getIme_predmeta() {
		return ime_predmeta;
	}

	public void setIme_predmeta(String ime_predmeta) {
		this.ime_predmeta = ime_predmeta;
	}

	public int getBroj_casova() {
		return broj_casova;
	}

	public void setBroj_casova(int broj_casova) {
		this.broj_casova = broj_casova;
	}
	
	public void predmet() {
		System.out.println("Ime predmeta: "+ this.ime_predmeta + "\nBroj casova: "+ this.broj_casova );
	}

}
