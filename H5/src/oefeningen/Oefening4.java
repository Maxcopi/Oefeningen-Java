package oefeningen;

import java.util.Scanner;

public class Oefening4 {
	/*
	 * Schrijf een programma dat een ingegeven tijd in seconden omzet naar uren, minuten en seconden.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int seconden;
		byte minuten, uren;
		
		System.out.println("Geef het aantal seconden in");
		seconden = keyboard.nextInt();
		
		uren = (byte)(seconden / 3600);
		
		minuten = (byte)((seconden % 3600) / 60);
		
		seconden = seconden % 60;
		
		System.out.println("uren: " + uren + " minuten: " + minuten + " seconden: " + seconden);
		
		keyboard.close();

	}

}
