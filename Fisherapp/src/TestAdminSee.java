public class TestAdminSee {

	public static void main(String[] args) {
		
		//Instanzierung
		See a = new See();
		Supermarket b = new Supermarket();
		
		
		
		
		a.setSee("Greifensee");
		a.setSee("Z�richsee");
		a.setSee("Pf�ffikersee");
		
		for (Object object : a.seeListe) {
			System.out.println(object);
		}
		
		a.removeSee("Greifensee");
		
		b.setSupermarkt("Migros MM B�lach");
		for (Object object : b.supermarktListe) {
			System.out.println(object);
		}
		
		
		
	}
	
	
}
