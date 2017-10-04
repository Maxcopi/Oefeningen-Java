package oefeningenIteraties;

import java.util.Scanner;

public class oefening2 {
	/*
	 * Lees twee getallen in, 
	 * maak er de som en het verschil van en druk dit af. 
	 * Herhaal dit tot de twee getallen die men ingeeft beiden nul zijn.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int getal1, getal2, som, verschil;
		Scanner keyboard = new Scanner(System.in);
		
		while(true) {
			System.out.println("Geef getal 1 in");
			getal1 = keyboard.nextInt();
			System.out.println("Geef getal 2 in");
			getal2 = keyboard.nextInt();
			if ((getal1 == 0) && (getal2 == 0)) {
				break;
			}
			som = getal1 + getal2;
			verschil = getal1 - getal2;
			
			System.out.println("De som is: " + som + " en het verschil is: " + verschil);
			
		}
		
		keyboard.close();
	}

}
