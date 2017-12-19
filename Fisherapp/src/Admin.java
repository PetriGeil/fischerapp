import java.util.Scanner;

public class Admin extends Personen {

	// Attribute
	
	//test

	String supermarkt;
	double[] gpsSupermarkt = new double[2];
	String ort;
	double[] gpsOrt = new double[2];

	// Methoden definieren
	// Verifikation

	// See CRUD
	//Wie können mehrere Seen erfasst werden?
	public void createSee(String seename, double gpsB, double gpsH) {
		See s = new See();

		for (int i = 0; i < s.seename.length; i++)
			if (s.seename[i] == null) {
				s.seename[i] = seename;
				s.gpsSee[i][0] = gpsB;
				s.gpsSee[i][1] = gpsH;

				System.out.println(s.seename[i]);
				System.out.println(s.gpsSee[i][0]);
				System.out.println(s.gpsSee[i][1]);
				break;
			}

	}

	// Supermarkt CRUD
	public void createSupermarkt(String supermarkt, double gpsB, double gpsH) {
		this.supermarkt = supermarkt;
		this.gpsSupermarkt[0] = gpsB;
		this.gpsSupermarkt[1] = gpsH;

	}

	// Ort CRUD
	public void createOrt(String ort, double gpsB, double gpsH) {
		this.ort = ort;
		this.gpsOrt[0] = gpsB;
		this.gpsOrt[1] = gpsH;

	}

	// Wetter CRUD
	public void createWeather(String weather, double wind, double luftdruck, double lufttemperatur, double niederschlag,
			double sonnenaufgang, double sonnenuntergang) {

	}

}
