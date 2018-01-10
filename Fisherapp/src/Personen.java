import java.util.ArrayList;

public abstract class Personen {

	// Attribute
	String passwort;
	String benutzername;
	ArrayList<String> benutzerListe = new ArrayList<String>();

	// Methode
	// public String getBenutzername() {
	// return benutzerListe.get();
	// }

	public void setBenutzername(String benutzername) {
		benutzerListe.add(benutzername);
	}

	//Wie funktioniert das? 
	public boolean validateBenutzername(String benutzername) {
		for (Object object : benutzerListe) {
			if (benutzerListe.equals(benutzername)) {
				return true;
			} else {
				return false;
			}
		}
	}

	public boolean login(String benutzername, String passwort) {
		if (this.passwort.equals(passwort) && this.benutzername.equals(benutzername)) {
			System.out.println("Login successful");
			return true;
		} else {
			System.out.println("Login unsuccessful");
			return false;
		}
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

}
