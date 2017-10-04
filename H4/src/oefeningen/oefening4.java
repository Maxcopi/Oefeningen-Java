package oefeningen;

import java.util.Scanner;

public class oefening4 {

	/*
		Maak een programma om de aankoopprijs van een DVD te berekenen.
		Geef via het toetsenbord in van welk jaar de film is en welke rating (getal 1-5).
		De basisprijs is steeds 5 euro.
		Voor een film die minder dan 2 jaar oud is, wordt een euro extra betaald.
		Voor films met rating 4 of 5 betaal je 2 euro meer.
		Druk de prijs van de film af.
		Uitbreiding :
		• Voor films met rating 3 of 2 betaal je 1 euro meer
		• Let erop dat een film nooit meer kost dan 7 euro
	 */
	public static void main(String[] args) {
		int jaar, rating, prijs;
		prijs = 5;
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Wat is het jaartal van de film?");
		jaar = keyboard.nextInt();
		
		System.out.println("Wat was de rating van de film?");
		rating = keyboard.nextInt();
		
		if (jaar >= 2015) {
			prijs += 1;
		}
		if (rating == 4||rating == 5) {
			prijs += 2;
		} else {
				if (rating == 3||rating == 2) {
					prijs += 1;
				}
			}
		if (prijs >= 7 ) {
			prijs = 7;
		}
		
		System.out.println("De prijs van de film is €" + prijs);
		
		keyboard.close();
		}
		
	}

