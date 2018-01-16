import java.util.ArrayList;

public class Supermarkt extends Standort {
	ArrayList<String> supermarktListe = new ArrayList<String>();

	// Attribute
	private String supermarkt;
	int abbruch =1;


	// Methoden
	public String getSupermarkt(int i) {
		return supermarktListe.get(i);
	}

	public void setSupermarkt(String supermarkt) {
		supermarktListe.add(supermarkt);
	}

	public void löschenSupermarkt(String supermarkt) {
		supermarktListe.remove(supermarkt);
	}

	public void anzeigenSupermarkt() {
		for (Object object : supermarktListe) {
			System.out.println(object);
		}
	}

	public void validationSupermarkt(String s) {
		if (supermarktListe.contains(s)) {
			System.out.println("Supermarkt bereits vorhanden.");
			abbruch =1;
		} else {
			System.out.println("Supermarkt befindet sich noch nicht in der Liste ");
		}
	}

	// Konstruktor
	public Supermarkt() {

	}

}
