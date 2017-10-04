package oefeningen;

import java.util.Scanner;

/*
 * De resultaten van een student behaald op 3 verschillende examens, 
 * moeten via het toetsenbord ingegeven worden. Deze resultaten staan 
 * op 20 en alleen gehele punten worden gegeven. Bepaal het behaald percentage 
 * van deze student en geef hiervan een afdruk weer samen met zijn behaalde graad
 *  <60% onvoldoende <70% voldoende <80% onderscheiding <90% grote onderscheiding ≥90% grootste onderscheiding.
 */

public class Oefening8 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		byte percentage, resultaat, totaalResultaat;
		totaalResultaat = (byte)0;
		
		for(int i = 1; i < 4; i++) {
			System.out.println("Geef het resultaat van examen "+i+" in");
			resultaat = keyboard.nextByte();
			totaalResultaat += resultaat;
		}
		System.out.println(totaalResultaat);
		percentage = (byte)((float)totaalResultaat / 60 * 100);
		
		if(percentage >= 90) {
			System.out.println(percentage + "% = Grootste onderscheiding");
		} else {
			if(percentage >= 80) {
				System.out.println(percentage + "% = Grote onderscheiding");
			} else {
				if(percentage >= 70) {
					System.out.println(percentage + "% = Onderscheiding");
				} else {
					if(percentage >= 60) {
						System.out.println(percentage + "% = Voldoende");
					} else {
						System.out.println(percentage + "% = Onvoldoende");
					}
				}
			}
		}
		
		keyboard.close();

	}

}
