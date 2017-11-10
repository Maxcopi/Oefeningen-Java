package opdrachten;

import java.util.Scanner;

public class Opdracht13b {
	/*
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int getal;
		
		System.out.println("Oplossing met een while");
		System.out.println("Geef een getal tussen 0 en 10");
		getal = keyboard.nextInt();
		
		while(getal < 0 || getal > 10) {
			System.out.println("Geef een getal tussen 0 en 10");
			getal = keyboard.nextInt();
		}
		
		System.out.println("Oplossing met do-while");
		int getal2;
		do {
			System.out.println("Geef een getal in tss 0 en 10");
			getal2 = keyboard.nextInt();
		} while(getal2 < 0 || getal2 > 10);
		keyboard.close();
	}

}

	