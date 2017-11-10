package oefeningenIteraties;

import java.util.Scanner;

public class Oefening7b {
	/*
	 * b)	Dezelfde opgave, maar het programma moet herhaald kunnen worden voor meerdere studenten.  
	 * Wanneer als studentnummer 99 of 999 wordt ingevoerd, eindigt het programma.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String naam = new String();
		double percentage;
		int studentnummer;
		
		System.out.println("Geef de het nummer van de student in");
		studentnummer = keyboard.nextInt();
		while(studentnummer != 99 || studentnummer != 999) {
			System.out.println("Geef het behaald percentage van " + naam);
			percentage = keyboard.nextDouble();
			
			while((percentage > 100) || (percentage < 0)) {
				System.out.println("U heeft geen geldig percentage doorgestuurd, geef een geldig percentage " + naam);
				percentage = keyboard.nextDouble();
			}
			
			if(percentage >= 85) {
				System.out.println("Grootste onderscheiding");
			} else {
				if(percentage >= 80) {
					System.out.println("Grote onderscheiding");
				} else {
					if(percentage >= 70) {
						System.out.println("Onderscheiding");
					} else {
						if(percentage >= 60) {
							System.out.println("Voldoende");
						} else {
							System.out.println("Onvoldoende");
						}
					}
				}
			}
			System.out.println("Geef de het nummer van de student in");
			studentnummer = keyboard.nextInt();
		}
		keyboard.close();

	}

}
