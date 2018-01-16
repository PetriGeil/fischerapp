import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public abstract class Personen {
	private static final String filename = "Konto.txt";
	// Attribute
	private String passwort;
	private String benutzername;
	private BufferedReader br = null;
	private FileReader fr = null;
	private boolean enthalten = false;
	public int abbruch;

	// Methoden
	// public String getBenutzername() {
	// return benutzerListe.get();
	// }

	public void setBenutzername(String benutzername) {

		try {
			fr = new FileReader(filename);
			br = new BufferedReader(fr);

			File file = new File(filename);
			BufferedWriter buff = new BufferedWriter(new FileWriter("Konto.txt", file.exists()));
			buff.write(benutzername + ",");
			buff.close();
			System.out.println("Der Benutzername wurde erfolgreich erfasst.");
			this.benutzername = benutzername;

		} catch (

		FileNotFoundException e) {
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

	public boolean validateTelefon(String telefon) {
		return (telefon.startsWith("0041") && telefon.length() == 11);
	}

	// Andere art zu lösen mit boolean returncode?
	public void validationBenutzername(String benutzername) {
		try {
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				abbruch = 0;
				if (sCurrentLine.contains(benutzername)) {
					abbruch = 1;
					break;
				} else {
				}

			}

		}

		catch (

		FileNotFoundException e) {
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

	public void setPasswort(String passwort) {
		try {
			fr = new FileReader(filename);
			br = new BufferedReader(fr);

			File file = new File(filename);
			BufferedWriter buff = new BufferedWriter(new FileWriter("Konto.txt", file.exists()));
			buff.write(passwort);
			buff.newLine();
			buff.close();
			System.out.println("Das Passwort wurde erfolgreich erfasst.");
			this.passwort = passwort;

		} catch (

		FileNotFoundException e) {
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

	public boolean login(String benutzername, String passwort) {
		try {
			
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
				if (sCurrentLine.contains(benutzername)) {
					String[] sCurrentWord = sCurrentLine.split(",");
					this.benutzername = sCurrentWord[0];
					this.passwort = sCurrentWord[1];
				}
			}

			if (this.passwort.equals(passwort) && this.benutzername.equals(benutzername)) {
				System.out.println("Login successful");
				return true;
			} else {
				System.out.println("Login unsuccessful");
				return false;
			}

		} catch (

		FileNotFoundException e) {
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

		if (this.passwort.equals(passwort) && this.benutzername.equals(benutzername)) {
			System.out.println("Login successful");
			return true;
		} else {
			System.out.println("Login unsuccessful");
			return false;
		}
	}

	// public boolean login(String benutzername, String passwort) {
	// if (this.passwort.equals(passwort) && this.benutzername.equals(benutzername))
	// {
	// System.out.println("Login successful");
	// return true;
	// } else {
	// System.out.println("Login unsuccessful");
	// return false;
	// }
	// }

	public String getPasswort() {
		return passwort;
	}

}
