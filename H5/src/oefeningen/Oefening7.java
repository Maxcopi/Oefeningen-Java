package oefeningen;

import java.util.Scanner;

public class Oefening7 {
	/*
	 * De prijs van een vliegtuigticket wordt bepaald door een aantal factoren, nl.:
• de lengte van de vlucht of de afstand in km
<1000 km korte afstandsvlucht: 25 eurocent/km
1000-2999 km middellange afstandsvlucht: 20 eurocent/km
>2999 km lange afstandsvlucht: 12 eurocent/km
• de soort vlucht of klasse: toeristenklasse, charter -20%, zakenreis +30%
Schrijf een programma dat de prijs van een vliegtuigticket berekent. De afstand
 in km en de klasse (1 = toeristenklasse, 2 = charter en 3 = zakenreis) dienen 
 ingegeven te worden. Druk de uiteindelijke ticketprijs af. Deze prijs moet uitgedrukt zijn 
 in euro’s. Extra: prijs afgedrukt in euro’s geen cijfers na de komma laten zien.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		float prijsTicket, prijsAfstand;
		short afstand;
		char klasse;
		
		System.out.println("Geef de afstand van de vlucht in km");
		afstand = keyboard.nextShort();
		
		System.out.println("Geef de klasse van de vlucht in (1,2 of 3)");
		klasse = keyboard.next().charAt(0);
		
		if(afstand > 2999) {
			prijsAfstand = (float)0.12 * afstand;
		} else {
			if(afstand >= 1000) {
				prijsAfstand = (float)0.20 * afstand;
			} else {
				prijsAfstand = (float)0.25 * afstand;
			}
		}
		
		if(klasse == '2') {
			prijsTicket = prijsAfstand * 0.8f;
		} else {
			if(klasse == '3') {
				prijsTicket = prijsAfstand * 1.3f;
			} else {
				prijsTicket = prijsAfstand;
			}
		}
		
		System.out.println("De prijs van het ticket is €" + prijsTicket);
		
		keyboard.close();
	}

}
