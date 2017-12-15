package Standort;

public enum BewertungWetter {
	// Bewertungszuteilung: 6 = gut, 4 = mittel und 1 = schlecht
	
	// Idee von http://javatutorialspot.com/java/java-enum-examples-advantages-disadvantages/
	GUT(6), MITTEL(4), SCHLECHT(1);

	private int bewertung;

	public int getFischwetter() {
		return bewertung;
	}
	private BewertungWetter (int bewertung){
		this.bewertung = bewertung;
	}
	
}
