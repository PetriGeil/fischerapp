import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Admin extends Personen {

	// Attribute
	private String ort;
	private String plz;
	private double breitengrad;
	private double laengengrad;
	private BufferedReader br = null;
	private FileReader fr = null;
	private boolean enthalten = false;
	private ArrayList<Standort> standort = new ArrayList<Standort>();
	
	// Methoden definieren
	// Verifikation

	public void erstellenOrt(String ort, String plz, double breitengrad, double laengengrad) {

		try {
			String filename = "Location.txt";
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
			String sCurrentLine;

			File file = new File(filename);
			BufferedWriter buff = new BufferedWriter(new FileWriter("Location.txt", file.exists()));
			buff.write(ort + "," + plz + "," + breitengrad + "," + laengengrad);
			buff.newLine();
			buff.close();
			System.out.println("Der Ort wurde neu im File erfasst.");

		} catch (

		FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void validationPlz(String plz) {
		try {
			String filename = "Location.txt";
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				abbruch = 0;
				if (sCurrentLine.equals(plz)) {
					abbruch = 1;
					break;
				} else {
				}

			}

		}

		catch (

		FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	
			

	

		
	
	public void erstellenSupermarkt(String supermarkt, String plz) {

		try {

			String filename = "See.txt";
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);

				if (sCurrentLine.equals(supermarkt)) {
					enthalten = true;
				}
			}

			if (enthalten == true) {
				System.out.println("Der Supermarkt " + supermarkt + " wurde bereits erfasst.");
			} else {
				File file = new File(filename);
				BufferedWriter buff = new BufferedWriter(new FileWriter("See.txt", file.exists()));
				buff.write(ort + "," + plz + "," + breitengrad + ',' + laengengrad);
				buff.newLine();
				buff.close();
				System.out.println("Der Ort " + ort + " wurde erfolgreich eingetragen.");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}

// See CRUD
// Wie können mehrere Seen erfasst werden?
// public void createSee(String seename, double gpsB, double gpsH) {
// See s = new See();
//
// for (int i = 0; i < s.seename.length; i++)
// if (s.seename[i] == null) {
// s.seename[i] = seename;
// s.gpsSee[i][0] = gpsB;
// s.gpsSee[i][1] = gpsH;
//
// System.out.println(s.seename[i]);
// System.out.println(s.gpsSee[i][0]);
// System.out.println(s.gpsSee[i][1]);
// break;
// }
//
// }
//
// // Supermarkt CRUD
// public void createSupermarkt(String supermarkt, double gpsB, double gpsH) {
// this.supermarkt = supermarkt;
// this.gpsSupermarkt[0] = gpsB;
// this.gpsSupermarkt[1] = gpsH;
//
// }
//
// // Ort CRUD
// public void createOrt(String ort, double gpsB, double gpsH) {
// this.ort = ort;
// this.gpsOrt[0] = gpsB;
// this.gpsOrt[1] = gpsH;
//
// }
//
// // Wetter CRUD
// public void createWeather(String weather, double wind, double luftdruck,
// double lufttemperatur, double niederschlag,
// double sonnenaufgang, double sonnenuntergang) {
//
// }
