public class TestAdminSee {

	public static void main(String[] args) {
		
		//Instanzierung
		See a = new See();
		Supermarket b = new Supermarket();
		
		
		
		
		a.setSee("Greifensee");
		a.setSee("Zürichsee");
		a.setSee("Pfäffikersee");
		
		for (Object object : a.seeListe) {
			System.out.println(object);
		}
		
		a.removeSee("Greifensee");
		
		b.setSupermarkt("Migros MM Bülach");
		for (Object object : b.supermarktListe) {
			System.out.println(object);
		}
		
		
		
	}
	
	
}
