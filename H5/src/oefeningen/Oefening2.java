package oefeningen;

import java.util.Scanner;

public class Oefening2 {
	/*
	 * De eenheidsprijs van een bepaald artikel is €11,5 het btwPercentage 
	 * bedraagt 21%. Vraag de klant hoeveel artikels hij wil bestellen en toon 
	 * dan het bedrag exclusief BTW, het BTW-bedrag en het bedrag inclusief BTW.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		float eenheidsprijs, bedragExBtw, bedragInBtw;
		short aantal;
		byte btwPercentage;
		
		eenheidsprijs = 11.5f;
		btwPercentage = (byte)21;
		
		System.out.println("Geef het aantal artikels om te bestellen in");
		aantal = (short)keyboard.nextInt();
		
		bedragExBtw = aantal * eenheidsprijs;
		bedragInBtw = (aantal * eenheidsprijs) + ((float)btwPercentage / 100) * (aantal * eenheidsprijs);
		
		System.out.println("Het bedrag exclusief btw: " + bedragExBtw);
		System.out.println("Het bedrag inclusief btw: " + bedragInBtw);
		
		keyboard.close();
		
	}

}
