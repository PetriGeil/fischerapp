import java.util.Scanner;

public class RegistrationTest{
	public static void main(String[] args) {

		Kunde a = new Kunde();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Geben Sie Ihren Vornamen ein:");
		String vorname = scanner.nextLine().toLowerCase();

		System.out.println("Geben Sie Ihren Nachnamen ein ");
		String nachname = scanner.nextLine().toLowerCase();

		System.out.println("Geben Sie Ihre E-Mail Adresse ein:");
		String email = scanner.nextLine().toLowerCase();

		System.out.println("Geben Sie Ihre Telefonnummer ein:");
		String telefon = scanner.nextLine().toLowerCase();

		System.out.println("Geben Sie den Namen Ihrer Strasse sowie die Hausnummer ein:");
		String strasse = scanner.nextLine().toLowerCase();
		
		System.out.println("Geben Sie den Namen Ihre PLZ ein:");
		String plz = scanner.nextLine().toLowerCase();
		
		System.out.println("Geben Sie den Ortsnamen ein:");
		String ort = scanner.nextLine().toLowerCase();

		System.out.println("Geben Sie ihre SANA Nummer ein:");
		String sana = scanner.nextLine().toLowerCase();

		System.out.println("Wollen Sie unseren Newsletter abonieren? Bitte antworten Sie mit Ja oder Nein.");
		String newsletter = scanner.nextLine().toLowerCase();
		
		System.out.println("Geben Sie einen Benutzernamen ein:");
//		string benutzername = scanner.nextLine();
		a.setBenutzername(scanner.nextLine().toLowerCase());
		
		System.out.println(a.benutzername);
		
		System.out.println("Setzen Sie ein Passwort:");
		a.setPasswort(scanner.nextLine().toLowerCase());
		System.out.println(a.passwort);
		
		//Registration mit Vor- Nachname sowie SANA Nr. 
		
		boolean ok = a.registration(vorname, nachname, sana);
		if (ok) {
			System.out.println("Sie können sich nun mit Ihrem Benutzernamen anmelden ");
		}
		else {
			System.out.println("Probieren Sie die Registierung nochmals.");
		}

	}

}
