public class AdminSee {

	public static void main(String[] args) {
		See a = new See();
		
		
		//Instanzierung
		
		a.setSee("Greifensee");
		a.setSee("Z�richsee");
		a.setSee("Pf�ffikersee");
		
		for (Object object : a.seeListe) {
			System.out.println(object);
		}
		
		a.removeSee("Greifensee");
		
		
	}
	
	
}
