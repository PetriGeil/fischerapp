package Standort;

public class Supermarkt extends Standort {
	// Attribute
	String supermarkt;

	// Methoden (teilweise aus abstrakter Klasse Standort übernommen)
	@Override
	public void suchen() {
		// TODO Auto-generated method stub

	}

	@Override
	public void erfassen() {
		// TODO Auto-generated method stub

	}

	@Override
	public void löschen() {
		// TODO Auto-generated method stub

	}

	@Override
	public void calcDistanz() {
		// TODO Auto-generated method stub

	}

	@Override
	public void aroundMe() {
		// TODO Auto-generated method stub

	}

	// Konstruktor
	// lg = Längengrad / bg = Breitengrad
	public Supermarkt(double lg, double bg) {
		super(lg, bg);
	}
}
