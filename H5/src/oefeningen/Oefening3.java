package oefeningen;

import java.util.Scanner;

public class Oefening3 {
	/*
	 * Wat kost mijn auto? Prijsbewuste personen willen weten hoeveel het verbruik 
	 * per jaar van hun auto echt kost. Achtereenvolgens wordt ingevoerd: aantal 
	 * afgelegde km per jaar (afgKm) verbruik in l per 100 km (verbruik) prijs van 1 l 
	 * brandstof (prijsL) Als uitvoer wordt verlangd: de totale verbruikskosten per jaar 
	 * voor het opgegeven aantal km. de kostprijs per km rijden.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int afgKm;
		float prijsL, verbruik, kostprijsKm, verbruikskostJaar;
		
		System.out.println("Geef het aantal afgelegde km in");
		afgKm = keyboard.nextInt();
		
		System.out.println("Geef het verbruik in l/100km");
		verbruik = keyboard.nextFloat();
		
		System.out.println("Geef de prijs van 1l brandstof");
		prijsL = keyboard.nextFloat();
		
		kostprijsKm = prijsL / verbruik;
		verbruikskostJaar = prijsL * (afgKm / verbruik);
		
		System.out.println("De totale verbruikskost per jaar is: " + verbruikskostJaar);
		System.out.println("De kostprijs/km rijden is: " + kostprijsKm);
		
		keyboard.close();
		
	}

}
