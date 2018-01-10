import java.util.ArrayList;

public class See {

	ArrayList<String> seeListe = new ArrayList<String>();
	
	//Attribute 
	String seename ;
	double gpsSee;
	
	//Methoden
	public String getSeename(int i) {
		return seeListe.get(i);
	}

	public void setSee(String seename) {
		seeListe.add(seename);
	}
	
	public void removeSee(String seename) {
		seeListe.remove(seename);
	}
	
	//Konstruktor
	 public See (){ 

	    } 
	
	
}
