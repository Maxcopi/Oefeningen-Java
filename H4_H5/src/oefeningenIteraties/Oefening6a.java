package oefeningenIteraties;

import java.util.Scanner;

public class Oefening6a {
	/*
	 * a)	Geef via het toetsenbord het resultaat (op 20) van 13 vakken in van een student. 
	 * Gevraagd: druk het gemiddelde resultaat en het behaald percentage af.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int resultaat, totaalResultaat;
		double gemResultaat, percentage;
		totaalResultaat = 0;
		
		for (int i=1; i < 14; i++) {
			System.out.println("Geef resultaat " + i + " in");
			resultaat = keyboard.nextInt();
			totaalResultaat += resultaat;
		}
		
		gemResultaat = totaalResultaat / 13;
		percentage = (gemResultaat / 20) * 100;
		
		System.out.println("Het gemiddelde resultaat was: " + gemResultaat + " en het percentage: " + percentage + "%");
		
		keyboard.close();

	}

}
