package oefeningen;

import java.util.Scanner;

public class Oefening11 {
	/*
	 * Lees gehele getallen in en druk de som af. De invoer stopt wanneer
	 * je het getal 0 inleest. Druk ook af hoeveel strikt negatieve getallen er werden ingegeven.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int getal, count, som;
		count = 0;
		
		System.out.println("Geef een getal in");
		getal = keyboard.nextInt();
		som = getal;
		
		while(getal != 0) {
			System.out.println("Geef een getal in");
			getal = keyboard.nextInt();
			
			if(getal < 0) {
				count++;
			}
			som += getal;
		}
		
		System.out.println("De som van de ingegeven getallen is " + som + ", er werden " + count + " negatieve getallen ingevoerd");
		keyboard.close();
	}

}
