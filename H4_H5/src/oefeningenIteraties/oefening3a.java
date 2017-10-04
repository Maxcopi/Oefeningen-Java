package oefeningenIteraties;

import java.util.Scanner;

public class oefening3a {
	/*
	 * a)Geef via het toetsenbord de dagtemperaturen in voor de maand januari.
	 * Gevraagd: druk de gemiddelde temperatuur af.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int dagTemperatuur, somTemperatuur, gemiddeldeTemperatuur;
		somTemperatuur = 0;
		
		for(int i = 1; i < 32; i++) {
			System.out.println("Geef de dagtemperatuur van dag " + i + " in");
			dagTemperatuur = keyboard.nextInt();
			somTemperatuur += dagTemperatuur;
		}
		gemiddeldeTemperatuur = somTemperatuur / 31;
		
		System.out.println("De gemiddelde temperatuur bedraagt: " + gemiddeldeTemperatuur);
		
		keyboard.close();
	
	}

}
