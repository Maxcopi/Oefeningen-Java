package oefeningen;

import java.util.Scanner;

public class Oefening18 {
	/*
	 * Schrijf een programma om van een ingevoerd getal de faculteit te berekenen 
	 * (bvb. faculteit van het getal 5: 5! = 1󫎿󫶙). Geef een afdruk van deze waarde. 
	 * Meerdere getallen kunnen ingevoerd worden. Het programma eindigt wanneer voor het getal een 0 wordt ingegeven.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		short getal;
		
		System.out.println("Geef een getal in");
		getal = keyboard.nextShort();
		
		
		while(getal != 0) {
			int faculteit = 1;
			for(short i = 1; i <= getal; i++) {
				faculteit = faculteit * i;
			}
			System.out.println(faculteit);
			
			System.out.println("Geef een getal in");
			getal = keyboard.nextShort();
		}
		
		
		keyboard.close();
	}

}
