import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestAdminCreateLocation {
	private static final String filename = "Location.txt";

	public static void main(String[] args) {
		// Buffered Reader oder FIle Reader oder Kombination?
		BufferedReader br = null;
		FileReader fr = null;
		boolean enthalten = false;

		String ort = "Test";
		String plz = "8600";
		double latitude = 80.000;
		double longitude = 80.00;

		try {

			fr = new FileReader(filename);
			br = new BufferedReader(fr);
			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);

				if (sCurrentLine.contains(ort)) {
					enthalten = true;
				} 
			}

			if (enthalten == true) {
				System.out.println("Der Ort " + ort + " wurde bereits erfasst.");
			} else {
				File file = new File(filename);
				BufferedWriter buff = new BufferedWriter(new FileWriter("Location.txt", file.exists()));
				buff.newLine();
				buff.write(ort + "," + plz + "," + latitude + ',' + longitude);
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
