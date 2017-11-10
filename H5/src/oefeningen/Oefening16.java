package oefeningen;

import java.util.Scanner;

public class Oefening16 {
	/*
	 * Er wordt door renners een tijdrit gereden over een afstand van 36 km.
	 *  Van iedere renner wordt inschrijvingsnummer en zijn tijd in seconden gegeven. 
	 *  Deze gegevens dienen nog ingegeven te worden. 
	 *  De invoer stopt wanneer er voor het inschrijvingsnummer een negatief getal wordt ingegeven. 
	 *  We veronderstellen dat alle renners er een verschillende tijd over doen. 
	 *  Gevraagd: Welke renner is het snelst? Het percentage van de renners dat er langer dan 1 uur over doet? 
	 *  Zorg voor volgende afdruk: Snelste renner is de renner met inschrijvingsnummer: ......... 
	 *  Het percentage van de renners dat er langer dan 1 uur over doet :………
	 *  Extra: Geef van de snelste renner ook zijn tijd in uren, minuten en seconden. En druk dit ook af.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		short nummer, tijdSeconden, nummerSnelste, secondenSnelste, deelnemers;
		byte aantalPlusUur;
		
		aantalPlusUur = (byte)0;
		secondenSnelste = (short)10000;
		deelnemers = (short)0;
		nummerSnelste = (short)0;
		
		
		System.out.println("Geef het nummer van de renner in");
		nummer = keyboard.nextShort();
		
		while (nummer >= 0) {
			System.out.println("Geef de tijd van de renner in");
			tijdSeconden = keyboard.nextShort();
			
			if(tijdSeconden > 3600) {
				aantalPlusUur++;
			}
			if(tijdSeconden < secondenSnelste) {
				secondenSnelste = tijdSeconden;
				nummerSnelste = nummer;
			}
			
			deelnemers++;
			
			System.out.println("Geef het nummer van de renner in");
			nummer = keyboard.nextShort();
		}
		aantalPlusUur = (byte)(aantalPlusUur / (float)deelnemers * 100);
		
		System.out.println("Snelste renner is de renner met inschrijvingsnummer: " + nummerSnelste);
		System.out.println("Het percentage van de renners dat er langer dan 1 uur over doet: " + aantalPlusUur);
		System.out.println("Tijd van snelste renner: " + (secondenSnelste / 3600) + " uur, " 
		+ ((secondenSnelste / 60) % 60) + " minuten en " + (secondenSnelste % 60) + " seconden.");
		
		keyboard.close();
	}

}
