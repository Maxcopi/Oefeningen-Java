package be.pxl.h6.oef3;

import java.util.Scanner;

public class H6Oef3 {
/*
 * Schrijf een programma om een ingevoerde tekst (String) om te keren.
Vb “dit is een tekst” wordt dan “tsket nee si tid”
 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een tekst in");
		String tekst = new String(keyboard.nextLine());
		
		for(int pos = tekst.length() -1; pos >=0; pos--) {
			System.out.print(tekst.charAt(pos));
		}
		
		keyboard.close();
	}

}
