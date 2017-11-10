package extra_oefeningen;

import java.util.Scanner;

public class Oefening6 {
	/*
	 * Bereken de vereiste frankering van een brief waarvan het gewicht via het toetsenbord wordt ingegeven. 
	 * Gebruik hierbij de volgende tarieven: 
	 * massa van de brief bedrag (in euro)
	 */
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		float prijs;
		short gram;
		
		System.out.println("Geef de massa van de brief in gram");
		gram = keyboard.nextShort();
		
		if(gram > 250) {
			prijs = 1.9f;
		} else {
			if(gram > 150) {
				prijs = 1.0f;
			} else {
				if(gram > 50) {
					prijs = 0.7f;
				} else {
					if(gram > 20) {
						prijs = 0.5f;
					} else {
						prijs = 0.3f;
					}
				}
			}
		}
		
		System.out.println("De prijs van de brief is " + prijs);
		
		keyboard.close();
	}

}
