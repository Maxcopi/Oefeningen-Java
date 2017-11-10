package be.pxl.h7.oef6;

import java.util.Scanner;

public class H7Oef6 {
/*
 * In een array zitten de cijfers behaald op 4 vakken (punten op 20) van 5 studenten. 
 * Geef deze array student per student in.
 * Bepaal voor elk vak de laagst behaalde score en de gemiddeld behaalde score. 
 * Druk deze resultaten ook af, het gemiddelde met 1 cijfer na de komma.
Uitbreiding: druk telkens per vak ook af welke student de laagste score behaalde. 
Je mag er vanuit gaan dat er zo maar 1 student is.

 */
	public static void main(String[] args) {
		int[][] studentenpunten = new int[5][4];
		Scanner keyboard = new Scanner(System.in);
		
		int laagst = 20, som = 0;
		int studentLaagst=0;
		float gemiddeld;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Geef de punten van student " + (i + 1));
			for(int j = 0; j < 4; j++) {
				System.out.println("Geef de punten van vak " + (j + 1));
				studentenpunten[i][j] = keyboard.nextInt();
			}
		}
		
		for(int j = 0; j < 4; j++) {
			laagst = 20;
			som = 0;
			for(int i = 0; i < 5; i++) {
				som+= studentenpunten[i][j];
				if(studentenpunten[i][j]<laagst) {
					laagst = studentenpunten[i][j];
					studentLaagst = i;
				}
				
			}
			gemiddeld = (float)som / studentenpunten[j].length;
			System.out.printf("Het gemiddelde van vak %d was %.1f en het laagste was %d door student %d"
					, j+1, gemiddeld, laagst, studentLaagst);
		}
		
		keyboard.close();
	}

}
