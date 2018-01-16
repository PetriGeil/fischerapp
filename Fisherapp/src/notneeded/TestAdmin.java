import java.util.Scanner;

public class TestAdmin {
	public static void main(String[] args) {

		Admin a = new Admin();
		Scanner scanner = new Scanner(System.in);
		Supermarkt s = new Supermarkt();
		int abbruch = 0;

		// Login mit Benutzername & Passwort
		do {
			System.out.println("Geben Sie einen Benutzernamen ein:");
			String benutzername = scanner.nextLine();

			System.out.println("Geben Sie ein gewünschtes Passwort ein: ");
			String passwort = scanner.nextLine();

			boolean ok = a.login(benutzername, passwort);
			if (ok) {
				System.out.println("Weiter gehts.");
				System.out.println("Wählen Sie Ort(O), Supermarkt(SU), See(S) oder Wetter(W)");
				String auswahl = scanner.nextLine().toLowerCase();
				
				if (auswahl == "o") {
				// Orte erfassen im File Location.txt
				 do {
				 System.out.println("Sie erstellen einen neuen Ort.");
				 System.out.println("Eingabe PLZ:");
				 a.plz = scanner.nextLine();
				 a.validationPlz(a.plz);
				
				 if (a.abbruch == 1) {
				 System.out.println("PLZ bereits erfasst.");
				 } else {
				 System.out.println("PLZ ist noch nicht im File eingetragen.");
				 System.out.println("Eingabe Ort:");
				 a.ort = scanner.nextLine().toLowerCase();
				 System.out.println("Eingabe Breitengrad:");
				 a.breitengrad = Double.parseDouble(scanner.nextLine());
				 System.out.println("Eingabe Längengrad:");
				 a.laengengrad = Double.parseDouble(scanner.nextLine());
				 }
				 } while (a.abbruch == 1);
				
				 a.erstellenOrt(a.ort, a.plz, a.breitengrad, a.laengengrad);
				}
				
				else

				// Neuen Supermarkt erfassen
				do {
					System.out.println("Sie erstellen einen neuen Supermarkt.");
					System.out.println("Eingabe Name");
					String u = scanner.nextLine();

					s.validationSupermarkt(u);

				} while (s.abbruch == 1);

			} else {
				System.out.println("Nochmals.");
				abbruch = 1;
			}
		} while (abbruch == 1);

	}
}
