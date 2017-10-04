package oefeningen;

import java.util.Scanner;

public class oefening3 {

	/*
		Maak een programma om het te betalen bedrag te berekenen van aangekochte goederen.
		Geef via het toetsenbord een aantal en een eenheidsprijs in. Bereken vervolgens:
		• de totaalprijs van de goederen
		• een mogelijke korting: bij een totaalprijs van meer dan 500 euro wordt een korting
		van 10 euro toegekend
		• te betalen bedrag
		Druk deze bedragen af met bijhorende tekst.
		Uitbreiding :
		• vanaf een totaalprijs van 1000 euro wordt een korting van 22 euro toegekend.
	 */
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int aantalGoederen, eenheidsprijs, totaalPrijs;
		
		System.out.println("Geef het aantal goederen in");
		aantalGoederen = keyboard.nextInt();
		
		System.out.println("Geef de eenheidsprijs in");
		eenheidsprijs = keyboard.nextInt();
		
		totaalPrijs = eenheidsprijs * aantalGoederen;
		if(totaalPrijs > 1000) {
			totaalPrijs -= 22;
		} else {
			if(totaalPrijs > 500){
				totaalPrijs -= 10;
			}
		}
		System.out.println("De totaalprijs van " + aantalGoederen + " aan " + eenheidsprijs + " is " + totaalPrijs);
		keyboard.close();
	}

}
