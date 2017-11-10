package be.pxl.h7.exoef3;

import java.util.Scanner;

public class H7ExOef3 {
/*
 * Schrijf een programma dat van een positief geheel getal elk cijfer als 
 * een Nederlands woord weergeeft. Bv. ingave “123” output “een twee drie”.
 * Maak hierbij gebruik van een StringBuilder.
 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String[] getalWoorden = {"een", "twee", "drie","vier",
							"vijf", "zes", "zeven", "acht", "negen"};
		StringBuilder uitvoer = new StringBuilder();
		
		System.out.println("Geef een geheel getal in");
		String userGetal = keyboard.next();
		
		int lengte = userGetal.length();
		
		for(int i = 0; i < lengte; i++) {
			int getal = Character.getNumericValue(userGetal.charAt(i));
			uitvoer.append(getalWoorden[getal-1]+ " ");
		}
		
		
		System.out.println(uitvoer);
		keyboard.close();
	}

}
