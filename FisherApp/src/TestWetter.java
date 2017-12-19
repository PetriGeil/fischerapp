import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestWetter {
	public static void main(String[] args) {
		int x = 900; // Luftdruck
		int y = 1; // Regen: 0=Regen, 1=kein Regen
		Wetter a = new Wetter();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		// Scanner // liest
		Scanner sc = new Scanner(System.in);

		System.out.println("Eingabeformat:\t\tdd-mm-YYYY");
		System.out.print("Enter date: \t\t");
		String str = sc.nextLine() + " 00:00:00";
		a.setWind(5.6);
		a.setLufttemperatur(8);

		try {

			Date date = sdf.parse(str);
			Wetter w = new Wetter();
			w.setDate(date);
			System.out.println("Sonnenaufgang:\t\t" + w.getSonnenaufgang());
			System.out.println("Sonnenuntergang:\t" + w.getSonnenuntergang());

		} catch (ParseException e) {
			System.out.println("\t\t\tEingabe Datumformat uerberpruefen, heutiges Datum wurde automatisch eingesetzt");
		}

		System.out.println("Windstärke in : \t" + a.getWind() + "km/h");
		System.out.println("Lufttemperatur in: \t" + "" + a.getLufttemperatur() + "°C");

		if (x < 800) {
			System.out.println("Luftdruck: \t\tschlechte Fischerbedingungen was den Luftdruck angeht");
		} else {
			if (x >= 800) {
				System.out.println("Luftdruck:\t\tgute Fischerbedingungen was den Luftdruck angeht");

			}
		}
		if (y == 1) {
			System.out.println("Niederschlag:\t\tes regnet");
		} else {
			if (y == 0) {
				System.out.println("Niederschlag:\t\tkein Regen");
			}

		}
	}
}
