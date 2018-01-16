
public class Kunde extends Personen {

	// Attribute
	String vorname;
	String nachname;
	private String mail;
	private String telefon;
	private String strasse;
	private Ort ort;
	String sana;
	private boolean newsletter;
	private boolean authentifiziert = false;
	private double gpsMeinZuhause;
	private double gpsMeinStandort;
	private Wetter wetter;
	// BestätigungWetter bestätigungwetter;
	String[] favoriten = new String[5];

	// Methoden
	// Methode Authentifizierung
	public boolean isAuthentifiziert() {
		return authentifiziert;
	}

	public boolean authentifizierung(String vorname, String nachname, String sana) {
		if (this.vorname.equals(vorname) && this.nachname.equals(nachname) && this.sana.equals(sana)) {
			System.out.println("Sie wurden authentifiziert.");
			return true;
		} else {
			System.out.println("Sie wurden nicht authentifiziert");
			return false;
		}
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public boolean validationName(String name) {
		return name.length() > 1;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getEmail() {
		return mail;
	}

	public boolean validationMail(String mail) {
		return mail.contains("@");
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public boolean validationTelefon(String telefon) {
		return (telefon.startsWith("0041") && telefon.length() == 11);
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {

	}
	
	public boolean validationStrasse(String strasse) {
		return strasse.length() > 6;
	}

	// public String getOrt() {
	// return ort;
	// }
	//
	// public void setOrt(String ort) {
	// this.ort = ort;
	// }

	public String getSana() {
		return sana;
	}

	public void setSana(String sana) {
		this.sana = sana;
	}

	public boolean validationSana(String sana) {
		return (sana.contains("-") && sana.length() == 9);
	}

	public boolean isNewsletter() {
		return newsletter;
	}

	public void setNewsletter(boolean news) {
		this.newsletter = news;
	}

	public double getGpsMeinZuhause() {
		return gpsMeinZuhause;
	}

	public void setGpsMeinZuhause(double gpsMeinZuhause) {
		this.gpsMeinZuhause = gpsMeinZuhause;
	}

	public double getGpsMeinStandort() {
		return gpsMeinStandort;
	}

	public void setGpsMeinStandort(double gpsMeinStandort) {
		this.gpsMeinStandort = gpsMeinStandort;
	}

	public String[] getFavoriten() {
		return favoriten;
	}

	public void setFavoriten(String[] favoriten) {
		this.favoriten = favoriten;
	}



}
