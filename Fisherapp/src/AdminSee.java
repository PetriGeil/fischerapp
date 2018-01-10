public class AdminSee {

	public static void main(String[] args) {
		See a = new See();
		
		
		//Instanzierung
		
		a.setSee("Greifensee");
		a.setSee("Zürichsee");
		a.setSee("Pfäffikersee");
		
		for (Object object : a.seeListe) {
			System.out.println(object);
		}
		
		a.removeSee("Greifensee");
		
		
	}
	
	
}
