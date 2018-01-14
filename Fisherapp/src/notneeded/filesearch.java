package notneeded;

import java.io.*;
import java.util.Scanner;

class filesearch {

	private static final String FILENAME = "Location.txt";

	public static void main(String[] args) {

		BufferedReader br = null;
		FileReader fr = null;
		Scanner scanner = new Scanner(System.in);
		int z =0;
		boolean enthalten = false;

		try {

			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			String sCurrentLine;
			System.out.println("Geben Sie das Wort nach, nach welchem die Datei durchsucht werden soll:");
			String suche = scanner.nextLine();

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
				if (sCurrentLine.contains(suche)) 
				{
					enthalten = true;
					z ++;
				}
				
			}

			if (enthalten==true) 
			{
				System.out.println(suche + " ist " + z + " in der Zeile enthalten");
			}
			else {
				System.out.println(suche + " ist nicht in der Zeile enthalten");
			}
		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
	}
}