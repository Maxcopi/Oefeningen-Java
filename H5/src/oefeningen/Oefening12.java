package oefeningen;

import java.util.Scanner;

public class Oefening12 {
	/*
	 * Schrijf een programma om het gewicht van een persoon te berekenen op 3 planeten.
	 *  Volgende gegevens worden via het toetsenbord ingevoerd: percentage van het gewicht t.o.v. aarde.
	 *   Bvb voor de Maan, Jupiter en Mars.: Maan 16,5%; Jupiter 253,7 % en Mars 37,8%.
	 *   AARDE MAAN JUPITER MARS 
	 *   50    …    …       … 
	 *   55    … 	… 		… 
	 *   … 	   … 	… 		… 
	 *   120   … 	… 		…
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		float percentage, gewichtAarde, gewichtPlaneet;
		String planeetNaam = new String();
		gewichtAarde = 50;
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Wat is de naam van de planeet?");
			planeetNaam = keyboard.next();
			System.out.println("Geef het percentage vh. gewicht tov. aarde van planeet " + planeetNaam);
			percentage = keyboard.nextFloat();
			
			gewichtPlaneet = gewichtAarde / 100 * percentage;
			
			System.out.println("Het gewicht van de persoon op " + planeetNaam + " bedraagt " + gewichtPlaneet);
		}
		keyboard.close();
	}

}
