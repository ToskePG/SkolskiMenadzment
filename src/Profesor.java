
public class Profesor{
		
	private String ime;
	private String prezime;
	private int brojPredmeta;
	private Predmet[] predmeti;
	private int staz;
	private int godine;
	
	public Profesor(String ime, String prezime, int brojPredmeta, int staz, int godine) {
		this.ime = ime;
		this.prezime = prezime;
		this.brojPredmeta = brojPredmeta;
		this.predmeti = new Predmet[brojPredmeta];
		this.staz = staz;
		this.godine = godine;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getBrojPredmeta() {
		return brojPredmeta;
	}

	public void setBrojPredmeta(int brojPredmeta) {
		this.brojPredmeta = brojPredmeta;
	}

	public Predmet[] getPredmeti() {
		return predmeti;
	}

	public void setPredmeti(Predmet[] predmeti) {
		this.predmeti = predmeti;
	}

	public int getStaz() {
		return staz;
	}

	public void setStaz(int staz) {
		this.staz = staz;
	}

	public int getGodine() {
		return godine;
	}

	public void setGodine(int godine) {
		this.godine = godine;
	}
	
	public void printProfesor() {
		System.out.println("Ime profesora: "+ this.ime +"\nPrezime profesora: "+this.prezime 
				+ "\nBroj predmeta: "+this.brojPredmeta +"\nStaz profesora: "+this.staz +
				"\nGodine: "+this.godine+ "\nPredmeti: ");
		this.printPredmeti();
	}
	
	public void printPredmeti() {
		for (int i = 0; i < predmeti.length; i++) {
			if(predmeti[i] == null) {
				System.out.println("Predmeti [" +i+ "]: Prazno");
			}else {
				System.out.println("Predmeti [" +i+ "]: " +this.predmeti[i].getIme_predmeta());

			}
		}
	}
	
	public boolean isFull() {
		for (int i = 0; i < predmeti.length; i++) {
			if(predmeti[i] == null) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isEmpty() {
		for (int i = 0; i < predmeti.length; i++) {
			if(predmeti[i] != null) {
				return false;
			}
		}
		return true;
	}
	
	public boolean addPredmet(Predmet p) {
		if(this.isFull()) {
			System.out.println("Niz je pun. ");
			return true;
		}else {
			for(int i=0; i<predmeti.length; i++) {
				if(predmeti[i] == null) {
					predmeti[i] = p;
					System.out.println("Predmet je dodat na poziciju " +i);
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean deletePredmet(Predmet p) {
		if(this.isEmpty()) {
			System.out.println("Niz je prazan, nema elemenata za brisanje. ");
			return false;
		}
		for (int i = 0; i < predmeti.length; i++) {
			if(predmeti[i] != null && predmeti[i].getIme_predmeta() == p.getIme_predmeta()) {
				predmeti[i] = null;
				System.out.println("Predmet je obrisan! ");
				return true;
			}
		}
		System.out.println("Ne postoji takav predmet! ");
		return false;
	}
	
	public boolean deletePredmetByPosition(int position) {
		// Obrisi predmet na pozicij koja je predata.
		return false;
	}
	
	
}
