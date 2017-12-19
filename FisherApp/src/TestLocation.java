import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestLocation {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(new File("Location.txt")));
			String line = null;
			while ((line = br.readLine()) != null) {
				// Ganze Zeile:
				// System.out.println(line);
				String[] parts = line.split(",");
				System.out.println("Ortschaft: \t" + parts[0]);
				System.out.println("latitude: \t" + parts[1]);
				System.out.println("longitude: \t" + parts[2]);
				System.out.println();
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
