public abstract class Standort {

	// Attribute
	Ort ort;
	Supermarkt supermarkt;
	private double gpspoint = 0;
	private int fischwetter = 0; // Bewertung 6, 4, 1 Bezug von Enumeration "BewertungWetter"
	
	
	// Methoden


	public double getGpspoint() {
		return gpspoint;
	}

	public void setGpspoint(double gpspoint) {
		this.gpspoint = gpspoint;
	}

	public int getFischwetter() {
		return fischwetter;
	}

	public void setFischwetter(int fischwetter) {
		this.fischwetter = fischwetter;
	}
	
	
	

//	public abstract void suchen();
	
//	// abstrakte Methoden
//	public abstract void erfassen();
//
//	public abstract void löschen();
//
//	public abstract void calcDistanz();
//
//	public abstract void aroundMe();
//
	 //Konstruktor der den Längen- und Breitengrad der Klasse GPSPoint bezieht
	public Standort(double lg, double bg) {
		ort.lg = lg;
		ort.bg = bg;
	}
	
	public Standort() {
		
	}

	/*
	 * Distanz zwischen zwei GPS-Koordinaten in Kilometer berechnen, kopiert von
	 * https://www.daniel-braun.com/technik/distanz-zwischen-zwei-gps-koordinaten-in
	 * -java-berchenen/
	 * 
	 * public static double distanceInKm(double lat1, double lon1, double lat2,
	 * double lon2) { int radius = 6371;
	 * 
	 * double lat = Math.toRadians(lat2 - lat1); double lon = Math.toRadians(lon2-
	 * lon1);
	 * 
	 * double a = Math.sin(lat / 2) * Math.sin(lat / 2) +
	 * Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
	 * Math.sin(lon / 2) * Math.sin(lon / 2); double c = 2 *
	 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a)); double d = radius * c;
	 * 
	 * return Math.abs(d); }
	 * 
	 */
}
