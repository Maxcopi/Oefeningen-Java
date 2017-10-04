package oefeningenSelecties;

import java.util.Scanner;

public class oefening1 {

	/*
	 * Geef via het toetsenbord het brutoloon van een werknemer in. 
	 * Gevraagd wordt het jaarlijks vakantiegeld en de jaarlijkse bijdrage te 
	 * berekenen en af te drukken. Het vakantiegeld is 5% van dit brutoloon. 
	 * Is dit vakantiegeld minstens 350 euro dan is de jaarlijkse bijdrage gelijk aan 
	 * 8% van 350 euro. Is dit vakantiegeld kleiner dan 350 euro dan is de jaarlijkse 
	 * bijdrage 8% van het vakantiegeld. Druk af voor deze werknemer: brutoloon, vakantiegeld en jaarlijkse bijdrage. 
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double brutoloon, vakantiegeld, bijdrage;
		
		System.out.println("Geef het brutoloon in");
		brutoloon = keyboard.nextDouble();
		
		vakantiegeld = brutoloon * 0.05;
		
		if (vakantiegeld >= 350) {
			bijdrage = 350 * 0.08;
		} else {
			bijdrage = vakantiegeld * 0.08;
		}
		
		System.out.println("Brutoloon: €" + brutoloon);
		System.out.println("Vakantiegeld: €" + vakantiegeld);
		System.out.println("Jaarlijkse bijdrage: €" + bijdrage);
		
		keyboard.close();
		
	}
}
