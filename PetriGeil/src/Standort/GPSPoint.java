package Standort;

// Klasse Location --> Fabian (mit Berger kreiert)

public class GPSPoint {
	// Attribute
	double laengengrad = 0;
	double breitengrad = 0;

	// HWZ-Koordinaten gem. Google-Maps: 47.376835, 8.534014

	// Methoden
	public double getLaengengrad() {
		return laengengrad;
	}

	public void setLaengengrad(double laengengrad) {
		this.laengengrad = laengengrad;
	}

	public double getBreitengrad() {
		return breitengrad;
	}

	public void setBreitengrad(double breitengrad) {
		this.breitengrad = breitengrad;
	}

	// Konstruktor
	public GPSPoint(double lg, double bg) {
		this.laengengrad = lg;
		this.breitengrad = bg;

	}
}
