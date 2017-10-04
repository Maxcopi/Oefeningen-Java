package oefeningen;

import java.util.Scanner;

public class Oefening10 {
	/*
	 * Schrijf een programma voor het berekenen van de eindejaarspremie voor de bedienden van een firma.
	 *  Volgende gegevens dienen ingegeven te worden: bruto jaarwedde en beoordelingscode 
	 *  (1 = slecht, 2 = voldoende, 3 = goed, 4 = schitterend)
	 *  Berekening van de eindejaarspremie: Het vaste gedeelte van het premiebedrag 
	 *  bedraagt 1/20ste van de bruto jaarwedde. Het variabele gedeelte is als volgt samengesteld: 
	 *  een bepaald percentage naargelang de beoordelingscode: 0% van het vaste gedeelte indien code = 1 18% van 
	 *  het vaste gedeelte indien code = 2 25% van het vaste gedeelte 
	 *  indien code = 3 33% van het vaste gedeelte indien code = 4
	 *  Geef via het toetsenbord de bruto jaarwedde en de beoordelingscode in. Druk de eindejaarspremie af.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		float eindejaarsPremie, brutoWedde;
		char code;
		eindejaarsPremie = 0;

		System.out.println("Geef het brutowedde in");
		brutoWedde = keyboard.nextFloat();
		System.out.println("Geef de code op");
		code = keyboard.next().charAt(0);
	
		switch(code) {
		case '1': eindejaarsPremie = (1 / 20f * brutoWedde);
			break;
		case '2': eindejaarsPremie = (1 / 20f * brutoWedde) + 0.18f * (1 / 20f * brutoWedde);
			break;
		case '3': eindejaarsPremie = (1 / 20f * brutoWedde) + 0.25f * (1 / 20f * brutoWedde);
			break;
		case '4': eindejaarsPremie = (1 / 20f * brutoWedde) + 0.33f * (1 / 20f * brutoWedde);
			break;
		}
		
		System.out.println("Bruto: " + brutoWedde + " Code: " + code + " Eindejaarspremie: " + eindejaarsPremie);
		
		keyboard.close();
	}

}
