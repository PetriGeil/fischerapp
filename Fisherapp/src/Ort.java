
public class Ort extends Standort {
	// Attribut
	String ort;
	String plz;
	int breitengrad;
	int laengengrad;
	
	
	//Methoden
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public String getPlz() {
		return plz;
	}
	public void setPlz(String plz) {
		this.plz = plz;
	}
	public int getBreitengrad() {
		return breitengrad;
	}
	public void setBreitengrad(int breitengrad) {
		this.breitengrad = breitengrad;
	}
	public int getLaengengrad() {
		return laengengrad;
	}
	public void setLaengengrad(int laengengrad) {
		this.laengengrad = laengengrad;
	}
	

	

//	// Methoden (teilweise aus der Klasse Standort übernommen)
//	@Override
//	public void suchen() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void erfassen() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void löschen() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void calcDistanz() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void aroundMe() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	// Konstruktor
//	// lg = Längengrad / bg = Breitengrad
//	public Ort(double lg, double bg) {
//		super(lg, bg);
//	}
}
