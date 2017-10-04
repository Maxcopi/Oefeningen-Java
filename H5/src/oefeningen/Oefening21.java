package oefeningen;

import java.util.Scanner;

public class Oefening21 {
	/*
	 * Vertrek van de oplossing van oefening 10 en pas je oplossing aan.
	 * Schrijf een programma voor het berekenen van de eindejaarspremie voor de bedienden van een firma. 
	 * Volgende gegevens dienen ingegeven te worden: bruto jaarwedde en de beoordelingscode.
	 * De invoer eindigt wanneer voor de bruto jaarwedde de waarde 0 wordt ingegeven.
	 * De berekening van de eindejaarspremie dient met een methode te gebeuren.
	 * Druk het percentage af van de personeelsleden dat de code schitterend heeft.
	 */
	
	public static float bereken(float bruto, char code) {
		
		float premie = 0;
		switch(code) {
		case '1': premie = (1 / 20f * bruto);
			break;
		case '2': premie = (1 / 20f * bruto) + 0.18f * (1 / 20f * bruto);
			break;
		case '3': premie = (1 / 20f * bruto) + 0.25f * (1 / 20f * bruto);
			break;
		case '4': premie = (1 / 20f * bruto) + 0.33f * (1 / 20f * bruto);
			break;
		}
		
		return premie;
	}
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		float eindejaarsPremie, brutoWedde;
		char code;
		eindejaarsPremie = 0;

		System.out.println("Geef het brutowedde in");
		brutoWedde = keyboard.nextFloat();
		System.out.println("Geef de code op");
		code = keyboard.next().charAt(0);
		
		eindejaarsPremie = bereken(brutoWedde, code);
		
		System.out.println("Bruto: " + brutoWedde + " Code: " + code + " Eindejaarspremie: " + eindejaarsPremie);
		
		keyboard.close();
	}

}
