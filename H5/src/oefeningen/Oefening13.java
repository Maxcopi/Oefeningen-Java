package oefeningen;

import java.util.Scanner;

public class Oefening13 {
	/*
	 * Schrijf een programma dat een getal tussen 1 en 100 opvraagt. 
	 * Zorg ervoor dat elke foutieve invoer geweigerd wordt. 
	 * Telkens een verkeerde invoer gebeurt dient er op het scherm een foutboodschap te verschijnen. 
	 * Ofwel “Fout! Het getal moet groter zijn dan 1” ofwel, “Fout! Het getal moet kleiner zijn dan 100”. 
	 * Het programma stopt als er een juiste invoer gedaan is. Het getal wordt dan weergegeven op het scherm.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		byte getal;
		
		System.out.println("Geef een getal in tussen 1 en 100");
		getal = keyboard.nextByte();
		
		while((getal > 100) || (getal <= 1)) {
			if(getal > 100) {
				System.out.println("Fout! Het getal moet kleiner zijn dan 100");
			} else {
				System.out.println("Fout! Het getal moet groter zijn dan 1");
			}
			System.out.println("Geef een getal in tussen 1 en 100");
			getal = keyboard.nextByte();
		}
		
		System.out.println("Het getal was " + getal);
		
		keyboard.close();
	}

}
