import java.util.ArrayList;

public class Supermarket extends Standort {
	ArrayList<String> supermarktListe = new ArrayList<String>();

	// Attribute
	String seename;
	Ort ort; 


	// Methoden
	public String getSupermarkt(int i) {
		return supermarktListe.get(i);
	}

	public void setSupermarkt(String supermarkt) {
		supermarktListe.add(supermarkt);
	}

	public void removeSupermarkt(String supermarkt) {
		supermarktListe.remove(supermarkt);
	}

	// Konstruktor
	public Supermarket() {

	}

}
