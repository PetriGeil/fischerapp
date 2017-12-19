
public abstract class Personen {

	// Attribute
	String passwort ;
	String benutzername;

	// Methode
	public boolean login( String benutzername, String passwort ) {
		if (this.passwort.equals(passwort) && this.benutzername.equals(benutzername)) {
			System.out.println("Login successful");
			return true;
		}
		else {
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

	public String getBenutzername() {
		return benutzername;
	}

	public void setBenutzername(String benutzername) {
		this.benutzername = benutzername;
	}
}
