package oefeningen;

import java.util.Scanner;

public class Oefening6 {
	/*
	 * De eenheidsprijs van een bepaald artikel is €11,5 het btwPercentage bedraagt 21%.
	 *  Vraag de klant hoeveel artikels hij wil bestellen. Op de totale prijs inclusief BTW 
	 *  wordt een reductie van 10% gegeven indien het bedrag hoger is dan 1.000 euro. Toon 
	 *  het bedrag dat de klant moet betalen.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		float basisPrijs;
		double totaalPrijs;
		byte btw;
		short aantal;
		
		basisPrijs = 11.5f;
		btw = (byte)21;
		
		System.out.println("Hoeveel artikels wil u bestellen?");
		aantal = keyboard.nextShort();
		totaalPrijs = basisPrijs * aantal + (basisPrijs * aantal) * (btw / 100f); // btw = byte dus moet gecast worden anders = 0
		
		if(totaalPrijs > 1000) {
			totaalPrijs = 0.9 * totaalPrijs;
		}
		
		System.out.println("De totaalprijs bedraagt: " + totaalPrijs);
		
		keyboard.close();
	}

}
