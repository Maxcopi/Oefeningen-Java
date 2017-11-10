package oefeningen;

import java.util.Scanner;

public class Oefening19 {
	/*
	 * Schrijf een programma om volgende schermafdruk te verkrijgen.
	 * @ @ @ @ @ @ @ @ @ @
	 * etc.
	 * @
	 * De grootte van de driehoek wordt als gegeven via het toetsenbord ingegeven.
	 *  Ter info: de hoogte en de breedte van de driehoek zijn gelijk
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		byte grootte;
		
		System.out.println("Geef de grootte van de driehoek");
		grootte = keyboard.nextByte();
		
		
		for(int y = grootte; y > 0; y--) {
			for(int x = y; x > 0; x--) {
				System.out.print("@");
			}
			System.out.print("\n");
		}
		
		
		keyboard.close();
	}

}
