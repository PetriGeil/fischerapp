import java.util.Scanner;
import java.util.ArrayList;

public class TestLogin {
	public static void main(String[] args) {

		// Instanzierung
		Kunde a = new Kunde();
		Scanner scanner = new Scanner(System.in);
		String benutzername;

		// Login mit Benutzername & Passwort
		System.out.println("Geben Sie einen Benutzernamen ein:");
		benutzername = scanner.nextLine();

		System.out.println("Geben Sie ein gewünschtes Passwort ein: ");
		String passwort = scanner.nextLine();

		boolean ok = a.login(benutzername, passwort);
		if (ok) {
			System.out.println("Weiter gehts.");

			ok = false;
			// do {
			System.out.println("Wollen Sie die Funktion 'Suche See/Ort'(S) oder 'AroundMe' (A) benützen?");
			String auswahl = scanner.nextLine().toLowerCase();

			if (auswahl == "s") {
				// ok = true;
				System.out.println("Wollen Sie nach einem See(S) oder einem Ort(O) suchen?");
				auswahl = scanner.nextLine().toLowerCase();

				if (auswahl == "s") {
					System.out.println("Gebe den gewünschten See ein:");
					auswahl = scanner.nextLine().toLowerCase();

				} else if (auswahl == "o") {
					System.out.println("Gebe den gewünschten See ein:");
					auswahl = scanner.nextLine().toLowerCase();

				} else {
					System.out.println("Treffen Sie Bitte eine gültige Auswahl S oder O");
				}

			} else if (auswahl == "a") {
				// ok = true;
				System.out.println("Wo befinden Sie sich? Zuhause(z) oder an einem anderen Ort(o)?");
			} else {
				System.out.println("Treffen Sie Bitte eine gültige Auswahl S oder A");
			}
			// } while (!ok);

		} else {
			System.out.println("Nochmals.");
		}
	}
}
