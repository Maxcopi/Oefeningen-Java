package oefeningenIteraties;

import java.util.Scanner;

public class Oefening6b {
	/*
	 * Pas je programma aan:
	 * Geef de gegevens in voor 3 studenten en druk het gevraagde af.
	 * Hoeveel studenten zijn geslaagd? Men slaagt vanaf 60%.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int resultaat, totaalResultaat, geslaagden;
		double gemResultaat, percentage;
		
		totaalResultaat = 0;
		geslaagden = 0;
		
		for(int i=1; i < 4; i++) {
			System.out.println("Nu komen de resultaten van student " + i);
			for (int j=1; j < 14; j++) {
				System.out.println("Geef resultaat " + j + " in");
				resultaat = keyboard.nextInt();
				totaalResultaat += resultaat;
			}
			gemResultaat = totaalResultaat / 13;
			percentage = (gemResultaat / 20) * 100;
			
			System.out.println("De resultaten van student " + i + " zijn:");
			System.out.println("Gemiddelde: " + gemResultaat + " Percentage: " + percentage + "%");
			
			if(percentage >= 60) {
				geslaagden += 1;
			}
			
		}
		System.out.println("Het aantal geslaagden is " + geslaagden);

		keyboard.close();

	}

}
