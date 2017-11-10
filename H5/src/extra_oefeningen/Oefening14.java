package extra_oefeningen;

import java.util.Scanner;

public class Oefening14 {
	/*
	 * Van werknemers in een bedrijf wil men de conditie nagaan.
	 * Volgende gegevens worden via het toetsenbord ingegeven: het geslacht (gesl) (1 = man, 2 = vrouw)
	 * de afstand afgelegd in km na 12 minuten lopen (afgKm). 
	 * De invoer stopt wanneer er voor geslacht een getal wordt ingegeven dat niet 1 of 2 is.
	 * Op basis van de afgelegde km kan men volgend conditiegetal berekenen: 
	 * Gevraagd: Geef het percentage van de werknemers die een slechte conditie hebben. 
	 * We spreken voor vrouwen over een slechte conditie 
	 * als het conditiegetal kleiner is dan 29, voor mannen als het conditiegetal kleiner dan 36 is.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		char geslacht;
		float afgKm, conditiegetal;
		byte percentageSlecht, aantalSlecht, aantal;
		byte conditiegetalVrouwen, conditiegetalMannen;
		
		conditiegetalVrouwen = 29;
		conditiegetalMannen = 36;
		aantalSlecht = 0;
		aantal = 0;
		
		System.out.println("Wat is het geslacht van de werknemer?");
		geslacht = keyboard.next().charAt(0);
		
		while(geslacht == '1' || geslacht == '2') {
			System.out.println("Wat is de afgelegde afstand?");
			afgKm = keyboard.nextFloat();
			conditiegetal = (afgKm - 504.9f) / 44.73f;
			if(geslacht == '1') {
				if(conditiegetal < conditiegetalVrouwen) {
					aantalSlecht++;
				}
			} else {
				if(conditiegetal < conditiegetalMannen) {
					aantalSlecht++;
				}
			}
			aantal++;	
			
			System.out.println("Wat is het geslacht van de werknemer?");
			geslacht = keyboard.next().charAt(0);
		}
		percentageSlecht = (byte)(aantalSlecht / (float)aantal * 100);
		System.out.println("Het percentage werknemers met een slechte conditie: " + percentageSlecht + "%");
				
		keyboard.close();
	}
}
