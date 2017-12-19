package Standort;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Geben Sie Ihren Standort ein: ");
		
		// HWZ-Koordinaten gem. Google-Maps: 47.376835, 8.534014
		GPSPoint gpsp = new GPSPoint(47.376835, 8.534014);
		System.out.println("Ihr Standort hat folgende GPS-Daten: " + gpsp.laengengrad + " & " + gpsp.breitengrad);
		
		// Resultat ist 6, somit die richtige Bewertung
		System.out.println("Das Fischwetter ist "+ BewertungWetter.GUT.name() + " ("+BewertungWetter.GUT.getFischwetter()+")"); 
		
	}
}
