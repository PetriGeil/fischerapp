import java.util.Calendar;
import java.util.TimeZone;

import com.luckycatlabs.sunrisesunset.dto.SunriseSunsetCalculator;
import com.luckycatlabs.sunrisesunset.dto.Location;

public class TestSunset {
	public static void main(String[] args) {
		// Location loc = new Location("40.730610", "73.935242");
		// SunriseSunsetCalculator calc = new SunriseSunsetCalculator(loc,
		// TimeZone.getTimeZone("Europe/Zurich"));
		// Calendar sunriseheute = calc
		// .getAstronomicalSunsetCalendarForDate(Calendar.getInstance(TimeZone.getTimeZone("MEZ")));
		// sunriseheute.setTimeZone(TimeZone.getTimeZone("America/NewYork"));
		// System.out.println(sunriseheute.());


		Location loc = new Location("47.36667", "8.55");
		// erster Wert: latitude, zweiter Wert: longtitude
		SunriseSunsetCalculator calculator = new SunriseSunsetCalculator(loc, "Europe/Zurich");

		Calendar calendar = Calendar.getInstance();
		calendar.set(2017, 6, 15); // Datum eingeben: YYYY, mm, dd
		calendar.setTimeZone(TimeZone.getTimeZone("Europe/Zurich"));

		String officialSunriseForDate = calculator.getOfficialSunriseForDate(calendar);
		// assertEquals("06:19", officialSunriseForDate);
		String officialSunsetForDate = calculator.getOfficialSunsetForDate(calendar);

		System.out.println("Die Sonne geht um: " + officialSunriseForDate + " auf");
		System.out.println("Die Sonne geht um: " + officialSunsetForDate + " unter");
	}
}