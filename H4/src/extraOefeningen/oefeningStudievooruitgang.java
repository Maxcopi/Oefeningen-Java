package extraOefeningen;

import java.util.Scanner;

public class oefeningStudievooruitgang {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String answer = new String();
		System.out.println("Studeerde je reeds aan de Hogeschool PXL?");
		
		answer = keyboard.next();
		if(answer.equals("Ja")) {
			System.out.println("Had je reeds individueel bindende voorwaarden?");
			answer = keyboard.next();
			if(answer.equals("Ja")) {
				System.out.println("Heb je de individueel bindende voorwaarden behaald?");
				answer = keyboard.next();
				if(answer.equals("Ja")) {
					System.out.println("Conclusie: Je kan je online inschrijven tenzij je een tekort hebt aan leerkrediet.");
				} else {
					System.out.println("Kreeg je afgelopen jaar positief advies op het examencommissie?");
					answer = keyboard.next();
					if(answer.equals("Ja")) {
						System.out.println("Behaalde je minstens 60% studierendement het afgelopen jaar?");
						answer = keyboard.next();
						if(answer.equals("Ja")) {
							System.out.println("Conclusie: Je kan je online inschrijven tenzij je een tekort hebt aan leerkrediet.");
						}
					} else {
						System.out.println("Conclusie: Je werd definitief uitgeschreven voor de opleiding.");
					}
				}
			
			} else {
				System.out.println("Was je afgelopen academiejaar voor de eerste maal ingeschreven aan het hoger onderwijs?");
				answer = keyboard.next();
				if(answer == "Ja") {
					System.out.println("Behaalde je minstens 60% studierendement het afgelopen jaar?");
					answer = keyboard.next();
				} else {
					System.out.println("Conclusie: Je kan je online inschrijven tenzij je een tekort hebt aan leerkrediet.");
				}
			}
			
		} else {
			System.out.println("Was je afgelopen academiejaar voor de eerste maal ingeschreven aan het hoger onderwijs?");
			answer = keyboard.next();
			if(answer.equals("Ja")) {
				System.out.println("Behaalde je minstens 60% studierendement het afgelopen jaar?");
				answer = keyboard.next();
				if(answer.equals("Ja")) {
					System.out.println("Conclusie: Je kan je online inschrijven tenzij je een tekort hebt aan leerkrediet.");
				}
			} else {
				System.out.println("Behaalde je minstens 60% studierendement het afgelopen jaar?");
				answer = keyboard.next();
				if(answer.equals("Ja")) {
					System.out.println("Conclusie: Je kan je online inschrijven tenzij je een tekort hebt aan leerkrediet.");
				} else {
					System.out.println("Conclusie: Je kan inschrijven met bindende voorwaarden.");
				}
			}
		}
		keyboard.close();
	}
}
