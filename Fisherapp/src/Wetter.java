import java.util.Calendar;
import java.util.Date;

import com.luckycatlabs.sunrisesunset.dto.SunriseSunsetCalculator;
import com.luckycatlabs.sunrisesunset.dto.Location;

public class Wetter {

	// Attribute
	Location loc = new Location("47.36667", "8.55"); // default value Zurich
	//Location loc = new Location("46.204391", "6.143158"); // Genf
	Calendar calendar = Calendar.getInstance();
	double wind;
	double lufttemperatur;
	double luftdruck;
	double niederschlag;
	SunriseSunsetCalculator calculator;

	// Konstruktor
	public Wetter() {
		calculator = new SunriseSunsetCalculator(loc, "Europe/Zurich"); // default value Zurich / Europe --> Zeitzone
	}

	// Methoden
	public void setDate(Date wunschDatum) {
		calendar.setTime(wunschDatum);
	}

	public void setLocation(String altitude, String longtitude) {
		loc = new Location(altitude, longtitude);
	}

	public String getSonnenaufgang() {
		return calculator.getOfficialSunriseForDate(calendar);

	}

	public String getSonnenuntergang() {
		return calculator.getOfficialSunsetForDate(calendar);
	}

	public void setWind(double zahl) {
		wind = zahl;
	}

	public double getWind() {
		return wind;

	}

	public void setLufttemperatur(double zahl1) {
		lufttemperatur = zahl1;
	}

	public double getLufttemperatur() {
		return lufttemperatur;
	}

}