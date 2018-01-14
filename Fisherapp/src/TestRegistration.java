import java.util.Scanner;

public class TestRegistration {
	public static void main(String[] args) {

		// Instanzierung
		Kunde a = new Kunde();
		Scanner scanner = new Scanner(System.in);
		boolean ok = false;
		String benutzername;

		// Konto erstellen
		// Vorname Eingabe & überprüfung

		do {
			System.out.println("Geben Sie Ihren Vornamen ein:");
			String vorname = scanner.nextLine();
			if (a.validationName(vorname)) {
				a.setVorname(vorname);
				ok = true;
			} else {
				System.out.println("Geben Sie Bitte einen gültigen/vollständigen Namen ein:");
			}
		} while (!ok);

		// Nachname Eingabe & überprüfung
		ok = false;
		do {
			System.out.println("Geben Sie Ihren Nachnamen ein:");
			String nachname = scanner.nextLine();
			if (a.validationName(nachname)) {
				a.setNachname(nachname);
				ok = true;
			} else {
				System.out.println("Geben Sie Bitte einen gültigen/vollständigen Namen ein:");
			}
		} while (!ok);

		// E-Mail Eingabe + Validation
		ok = false;
		do {
			System.out.println("Geben Sie Ihre E-Mail Adresse ein:");

			String tempmail = scanner.nextLine().toLowerCase();
			if (a.validationMail(tempmail)) {
				a.setMail(tempmail);
				ok = true;
			} else {
				System.out.println("Geben Sie Bitte eine gültige E-Mail Adresse ein!");
			}
		} while (!ok);
		// Wenn E-Mail ungültig erneute Eingabe

		// Telefonnr Eingabe + Validation
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
		// Wenn Telnr. ungültig erneute Eingabe

		// Strasse Eingabe & Validation
		ok = false;
		do {
			System.out.println("Geben Sie den Namen Ihrer Strasse sowie die Hausnummer ein:");
			String tempStrasse = scanner.nextLine();
			if (a.validationStrasse(tempStrasse)) {
				a.setStrasse(tempStrasse);
				ok = true;
			} else {
				System.out.println("Geben Sie Bitte den vollständigen Strassennamen ein:");
			}
		} while (!ok);

		// // PLZ Eingabe
		// System.out.println("Geben Sie den Namen Ihre PLZ ein:");
		// a.setPlz(scanner.nextLine().toLowerCase());
		//
		// // Ortsname Eingabe
		// ok = false;
		// do {
		// System.out.println("Geben Sie den Ortsnamen ein:");
		// String ort = scanner.nextLine();
		//
		// } while (!ok);
		//
		// a.setOrt(scanner.nextLine().toLowerCase());

		// SanaNr. Eingabe
		ok = false;
		do {
			System.out.println("Geben Sie ihre SANA Nummer ein:");
			String tempSana = scanner.nextLine().toLowerCase();
			if (a.validationSana(tempSana)) {
				a.setSana(tempSana);
				ok = true;
			} else {
				System.out.println("Geben Sie Bitte eine gültige SANA Nr. ein.");
			}

		} while (!ok);

		// Newsletter Eingabe + Validation
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

		// Benutzername eingeben und überprüfen
		do {
			System.out.println("Wählen Sie einen Benutzernamen:");
			benutzername = scanner.nextLine().toLowerCase();
			a.validationBenutzername(benutzername);

			if (a.abbruch == 1) {
				System.out.println("Benutzername bereits erfasst.");
			} else {
				System.out.println("Der Benutzername ist noch nicht vergeben.");

			}
		} while (a.abbruch == 1);

		a.setBenutzername(benutzername);

		// Passwort setzen
		System.out.println("Setzen Sie ein Passwort:");
		a.setPasswort(scanner.nextLine());

		// Authentifizierung mit Vor- Nachname sowie SANA Nr.
		ok = a.authentifizierung(a.vorname, a.nachname, a.sana);
		if (ok) {
			System.out.println("Sie wurden erfolgreich authentifiziert. ");
		} else {
			System.out.println(
					"Sie wurden nicht erfolgreich authentifiziert. /n Probieren Sie die Registierung nochmals.");
			// Wie kann ich an nach oben springen ?
			// Wie kann ich all die oberen Variablenwerte wieder löschen? Alle = null setzen
			// ?
		}

	}

}
