package oefeningen;

import java.util.Scanner;

public class Oefening20 {
	/*
	 * Vertrek van de oplossing van oefening 18 en pas je oplossing als volgt 
	 * aan: het berekenen van de faculteit dient met een methode te gebeuren.
	 */
	public static int bereken(short getal) {
		int faculteit = 1;
		for(short i = 1; i <= getal; i++) {
			faculteit = faculteit * i;
		}
		return faculteit;
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		short getal;
		int faculteit;
		
		System.out.println("Geef een getal in");
		getal = keyboard.nextShort();
		
		
		while(getal != 0) {
			
			faculteit = bereken(getal);
			System.out.println(faculteit);
			
			System.out.println("Geef een getal in");
			getal = keyboard.nextShort();
		}
		
		
		keyboard.close();
	}

}
