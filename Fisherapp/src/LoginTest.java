import java.util.Scanner;
import java.util.ArrayList;

public class LoginTest {
	public static void main(String[] args) {

	
		
		// Instanzierung
		Kunde a = new Kunde();
		Scanner scanner = new Scanner(System.in);

		//Konto erstellen
		 System.out.println("Geben Sie Ihren Vornamen ein:");
		 a.setVorname(scanner.nextLine().toLowerCase());
		
		 System.out.println("Geben Sie Ihren Nachnamen ein ");
		 a.setNachname(scanner.nextLine().toLowerCase());
		
		boolean ok = false;
		 do {
		 System.out.println("Geben Sie Ihre E-Mail Adresse ein:");
		
		 String tempmail = scanner.nextLine().toLowerCase();
		 if (a.validateEmail(tempmail)) {
		 a.setEmail(tempmail);
		 ok = true;
		 } else {
		 System.out.println("Geben Sie Bitte eine gültige E-Mail Adresse ein!");
		 }
		 } while (!ok);
		 // Wenn E-Mail ungültig erneute Eingabe
		
		 ok = false;
		 do {
		 System.out.println("Geben Sie Ihre Telefonnummer ein in folgendem Format 00417457352:");
		
		 String tempnr = scanner.nextLine().toLowerCase();
		 if (a.validateTelefon(tempnr)) {
		 a.setTelefon(tempnr);
		 ok = true;
		 } else {
		 System.out.println("Geben Sie Bitte eine gültige Telefonnummer ein.");
		 }
		 } while (!ok);
		 // Wenn E-Mail ungültig erneute Eingabe
		
		 System.out.println("Geben Sie den Namen Ihrer Strasse sowie die Hausnummer ein:");
		 a.setStrasse(scanner.nextLine().toLowerCase());
		
		 System.out.println("Geben Sie den Namen Ihre PLZ ein:");
		 a.setPlz(scanner.nextLine().toLowerCase());
		
		 System.out.println("Geben Sie den Ortsnamen ein:");
		 a.setOrt(scanner.nextLine().toLowerCase());
		
		 System.out.println("Geben Sie ihre SANA Nummer ein:");
		 a.setSana(scanner.nextLine().toLowerCase());

		ok = false;
		do {
			System.out.println("Wollen Sie unseren Newsletter abonieren? Bitte antworten Sie mit Ja oder Nein.");
			String news = scanner.nextLine().toLowerCase();
			if (news.equals("ja")) {
				System.out.println("Sie haben den Newsletter erfolgreich abonniert. Wir freuen uns darüber.");
				a.setNewsletter(true);
				ok = true;
			} else {
				if (news.equals("nein")) {
					System.out.println(
							"Wir bedauern Ihre Entscheidung, Sie können den Newsletter jedoch jederzeit in Ihrem Konto aktivieren.");
					a.setNewsletter(false);
					ok = true;
				} else {
					System.out.println("Geben Sie entweder Ja oder Nein als Antwort ein.");
				}
			}
		} while (!ok);

		System.out.println("Wählen Sie einen Benutzernamen:");
		a.setBenutzername(scanner.nextLine());

		System.out.println("Setzen Sie ein Passwort:");
		a.setPasswort(scanner.nextLine());

		// Registration mit Vor- Nachname sowie SANA Nr.

		ok = a.registration(a.vorname, a.nachname, a.sana);
		if (ok) {
			System.out.println("Sie können sich nun mit Ihrem Benutzernamen anmelden ");
		} else {
			System.out.println("Probieren Sie die Registierung nochmals.");
			// Wie kann ich an nach oben springen ?
			// Wie kann ich all die oberen Variablenwerte wieder löschen? Alle = null setzen
			// ?
		}

		// Login mit Benutzername & Passwort
		System.out.println("Geben Sie einen Benutzernamen ein:");
		String benutzername = scanner.nextLine();

		System.out.println("Geben Sie ein gewünschtes Passwort ein: ");
		String passwort = scanner.nextLine();

		boolean ok1 = a.login(benutzername, passwort);
		if (ok1) {
			System.out.println("Weiter gehts.");
		} else {
			System.out.println("Nochmals.");
		}
	}
}
