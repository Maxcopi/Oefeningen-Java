package oefeningenIteraties;

import java.util.Scanner;

public class oefening4 {
	/*
	 * Je geeft via het toetsenbord een aantal getallen in. De computer drukt het grootste en het kleinste getal af.
	 *  Het aantal getallen wordt vooraf ingelezen. Je mag ervan uitgaan dat minstens 1 getal wordt ingevoerd.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int kleinste, grootste, getal;
		System.out.println("Geef een getal in");
		getal = keyboard.nextInt();
		kleinste = getal;
		grootste = getal;
		
		for(int i=0; i < 9; i++) {
			System.out.println("Geef een getal in");
			getal = keyboard.nextInt();
			
			if(getal > grootste) {
				grootste = getal;
			}
			if(getal < kleinste) {
				grootste = getal;
			} 
		}
		
		System.out.println("Het grootste getal was: " + grootste + " en het kleinste: " + kleinste);
		keyboard.close();
	}

}
