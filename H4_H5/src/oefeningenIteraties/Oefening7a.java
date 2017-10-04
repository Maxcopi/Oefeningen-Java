package oefeningenIteraties;

import java.util.Scanner;

public class Oefening7a {
	/*
	 * a)	Via het toetsenbord wordt de naam van een student en zijn
	 *  behaald percentage ingegeven. Doe een invoercontrole op het behaald 
	 *  percentage (enkel 0-100 is toegelaten). Telkens een verkeerde invoer gebeurt, dient 
	 *  er op het scherm een foutboodschap te verschijnen. 
	 *  Ofwel Fout! het getal moet minstens 0  zijn ofwel Fout! het getal mag maximum 100 zijn. 
	 * Bepaal vervolgens de behaalde graad en druk naam en graad af.
			< 60%		onvoldoende
			60 < 70%	voldoende
			70 < 80%	onderscheiding
			80 < 85%	grote onderscheiding
			≥ 85%		grootste onderscheiding

	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String naam = new String();
		double percentage;
		
		System.out.println("Geef de naam van de student in");
		naam = keyboard.next();
		System.out.println("Geef het behaald percentage van " + naam);
		percentage = keyboard.nextDouble();
		
		while((percentage > 100) || (percentage < 0)) {
			System.out.println("U heeft geen geldig percentage doorgestuurd, geen een geldig percentage " + naam);
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
		
		
		
		
		keyboard.close();

	}

}
