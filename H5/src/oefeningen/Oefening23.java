package oefeningen;

import java.util.Scanner;

public class Oefening23 {
	/*
	 * Vertrek van de oplossing van oefening 19 en pas je oplossing aan. Maak een methode om de driehoek af te drukken.
	 */
	
	public static void tekenDriehoek(byte grootte) {
		for(int y = grootte; y > 0; y--) {
			for(int x = grootte; x > 0; x--) {
				System.out.print("@");
			}
			grootte -= 1;
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		byte grootte;
		
		System.out.println("Geef de grootte van de driehoek");
		grootte = keyboard.nextByte();
		
		
		tekenDriehoek(grootte);
		
		
		keyboard.close();

	}

}
