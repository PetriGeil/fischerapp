package notneeded;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class createNewFile { 

	public static void main(String[] args) {

		File file = new File("huhu.txt"); //Es ist auch möglich den ganzen Pfad einzugeben.
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Dateiname: " + file.getName());
	}
}
