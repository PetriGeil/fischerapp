
public class Kunde extends Personen {

	// Attribute
	String vorname = "laura";
	String nachname = "sooder";
	String email;
	String telefon;
	String strasse;
	String plz;
	String ort;
	String sana = "0800-0800";
	boolean newsletter;

	boolean verifiziert;

	double[] meinStandort = new double[1];
	String[] proofedWeather = new String[3];
	String[] favoritenleiste = new String[4];

	// Methoden
	// Methode Registration
	public boolean registration(String vorname, String nachname, String sana) {
		if (this.vorname.equals(vorname) && this.nachname.equals(nachname) && this.sana.equals(sana)) {
			System.out.println("Sie wurden verifiziert.");
			return true;
		} else {
			System.out.println("Sie wurden nicht verifiziert");
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

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getEmail() {
		return email;
	}

	public boolean validateEmail(String email) {
		return email.contains("@");

	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {

		// App nur für Schweizernummer?
		boolean ok = telefon.startsWith("00");
		if (ok) {
			this.telefon = telefon;
		} else {
			System.out.println("Geben Sie Bitte eine gültige Telefonnummer ein.");
		}
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		// App nur für PLZ in der Schweiz? 4 Lang?
		int ok = plz.length();
		if (ok == 4) {
			this.plz = plz;
		} else {
			System.out.println("Geben Sie Bitte eine gültige Postleitzahl ein.");
		}

	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getSana() {
		return sana;
	}

	public void setSana(String sana) {
		this.sana = sana;
	}

	public boolean isNewsletter() {
		return newsletter;
	}

	public void setNewsletter(String news) {
		System.out.println(news);
		if (news.equals("ja")) {
			this.newsletter = true;
			System.out.println(this.newsletter);
			System.out.println("Sie haben den Newsletter erfolgreich abonniert. Wir freuen uns darüber.");
		} else {
			if (news.equals("nein")) {
				this.newsletter = false;
				System.out.println(
						"Wir bedauern Ihre Entscheidung, Sie können den Newsletter jedoch jederzeit in Ihrem Konto aktivieren.");
			} else {
				System.out.println("Geben Sie entweder Ja oder Nein ein.");
			}
		}
	}

	public boolean isVerifiziert() {
		return verifiziert;
	}

	public void setVerifiziert(boolean verifiziert) {
		this.verifiziert = verifiziert;
	}

	public double[] getMeinStandort() {
		return meinStandort;
	}

	public void setMeinStandort(double[] meinStandort) {
		this.meinStandort = meinStandort;
	}

	public String[] getProofedWeather() {
		return proofedWeather;
	}

	public void setProofedWeather(String[] proofedWeather) {
		this.proofedWeather = proofedWeather;
	}

	public String[] getFavoritenleiste() {
		return favoritenleiste;
	}

	public void setFavoritenleiste(String[] favoritenleiste) {
		this.favoritenleiste = favoritenleiste;
	}

}
