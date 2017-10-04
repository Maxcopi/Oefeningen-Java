package oefeningen;

import java.util.Scanner;

public class Oefening14 {
	/*
	 * Geef via het toetsenbord artikelnummer, hoeveelheid en eenheidsprijs in. 
	 * De invoer eindigt met artikelnummer = 999. Gevraagd een 
	 * afdruk van: de gegevens per artikel (artikelnummer, hoeveelheid, eenheidsprijs, bedrag) 
	 * het totaal te betalen bedrag per aankoop.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		short artikelNummer, aantal;
		float eenheidsPrijs, totaalPrijs;
		
		System.out.println("Geef het artikelnummer in");
		artikelNummer = keyboard.nextShort();
		
		while(artikelNummer != (short)999) {
			System.out.print("Geef het aantal artikels op");
			aantal = keyboard.nextShort();
			System.out.println("Wat is het bedrag van een artikel?");
			eenheidsPrijs = keyboard.nextFloat();
			
			totaalPrijs = eenheidsPrijs * aantal;
			
			System.out.println("Artikelnummer: " + artikelNummer + " Hoeveelheid: " + aantal);
			System.out.println("Eenheidsprijs: " + eenheidsPrijs + " Totaalprijs: " + totaalPrijs);
			
			System.out.println("Geef het artikelnummer in");
			artikelNummer = keyboard.nextShort();
		}
		
		
		
		keyboard.close();
	}

}
