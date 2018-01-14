import java.util.Scanner;

public class TestAdmin {
	public static void main(String[] args) {

		Admin a = new Admin();
		Scanner scanner = new Scanner(System.in);

		//Orte erfassen im File Location.txt
		do {
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
}
