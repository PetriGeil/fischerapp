package Standort;

public class Supermarkt extends Standort {
	// Attribute
	String supermarkt;

	// Methoden (teilweise aus abstrakter Klasse Standort �bernommen)
	@Override
	public void suchen() {
		// TODO Auto-generated method stub

	}

	@Override
	public void erfassen() {
		// TODO Auto-generated method stub

	}

	@Override
	public void l�schen() {
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
	// lg = L�ngengrad / bg = Breitengrad
	public Supermarkt(double lg, double bg) {
		super(lg, bg);
	}
}
