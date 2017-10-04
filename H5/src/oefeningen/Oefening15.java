package oefeningen;

import java.util.Scanner;

public class Oefening15 {
	/*
	 * Lees via het toetsenbord de temperatuur gemeten om 12u ’s middags in van 10 dagen.
	 *  Gevraagd een afdruk van . de hoogste temperatuur voor deze 10 dagen.
	 *  De gemiddelde temperatuur voor deze 10 dagen
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		byte middagTemperatuur;
		short totaal, gemiddelde, hoogste;
		totaal = 0;
		hoogste = -127;
		
		for(int i=1; i < 11; i++) {
			
			System.out.println("Wat was de middagtemperatuur van dag " + i);
			middagTemperatuur = keyboard.nextByte();
			
			if(middagTemperatuur > hoogste) {
				hoogste = middagTemperatuur;
			}
			totaal += middagTemperatuur;
			
		}
		gemiddelde = (short)(totaal / 10);
		System.out.println("De hoogste temperatuur: " + hoogste);
		System.out.println("De gemiddelde temperatuur: " + gemiddelde);
		
		keyboard.close();
	}

}
