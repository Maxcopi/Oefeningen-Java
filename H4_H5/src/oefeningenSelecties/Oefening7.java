package oefeningenSelecties;

import java.util.Scanner;

public class Oefening7 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		float prijsVorig;
		byte leeftijd;
		char beoordeling, type; 
		short punten;
		float prijshuidig;
		
		System.out.println("Geef de prijs van het vorig speeljaar");
		prijsVorig = keyboard.nextFloat();
		System.out.println("Geef de leeftijd van de speler");
		leeftijd = keyboard.nextByte();
		System.out.println("Geef het beoordelingscijfer");
		beoordeling = keyboard.next().charAt(0);
		System.out.println("Geef het type speler");
		type = keyboard.next().charAt(0);
		if(type=='4') {
			System.out.println("Geef het aantal doelpunten ingelaten");
		} else {
			System.out.println("Geef het aantal doelpunten");
		}
		punten = keyboard.nextShort();
		
		
		prijshuidig = prijsVorig;
		
		if(leeftijd > 30) {
			prijshuidig -= prijshuidig * 0.05f;
		} else {
			if(leeftijd < 25) {
				prijshuidig += prijshuidig * 0.10f;
			}
		}
		
		if(type=='1') {
			if(punten < 6) {
				prijshuidig += 10000 * punten;
			} else {
				prijshuidig += 10000 * 5;
				prijshuidig += 20000 * (punten - 5);
			}
		} else {
			prijshuidig += 10000 * (byte)beoordeling;
			if(type=='4') {
				if(punten>=20) {
					prijshuidig -= 9000;
				}
			}
		}
		System.out.println(prijshuidig);
		
		keyboard.close();
	}

}
