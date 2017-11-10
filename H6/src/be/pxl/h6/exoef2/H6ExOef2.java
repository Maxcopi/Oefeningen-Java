package be.pxl.h6.exoef2;

import java.util.Scanner;

public class H6ExOef2 {
/*
 * Schrijf een programma om een tekst waarvan het aantal letters deelbaar is door 3
 *  om te zetten naar hoofdletters, als het aantal letters niet deelbaar is door 3 moet de tekst 
 *  omgezet worden naar kleine letters.
 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String tekst = new String();

		System.out.println("Geef een tekst in");
		tekst = keyboard.nextLine();
		
		if(tekst.length() % 3 == 0) {
			tekst = tekst.toUpperCase();
		} else {
			tekst = tekst.toLowerCase();
		}
		
		System.out.println(tekst);
		
		keyboard.close();
	}

}
