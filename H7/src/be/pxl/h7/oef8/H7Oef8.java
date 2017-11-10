package be.pxl.h7.oef8;

import java.util.Scanner;

public class H7Oef8 {
/*
 * Maak een programma om het juiste sterrenbeeld van meerdere personen af te drukken.
 * Geef de naam en de voornaam van de persoon in, de geboortedag en de geboortemaand.
 * De invoer stopt wanneer voor de naam een “/” wordt ingegeven. De sterrenbeelden zijn 
 * (in volgorde van de maanden van het jaar): waterman, vissen, ram, stier, tweelingen,
 * kreeft, leeuw, maagd, weegschaal, schorpioen, boogschutter, steenbok. 
 * We gaan er van uit dat telkens de 21ste van de maand een nieuw sterrenbeeld begint.
 * Dus wie jarig is tussen 21 januari en 20 februari is een waterman, 
 * wie jarig is tussen 21 februari en 20 maart heeft als sterrenbeeld vissen, … 
 * Het bepalen van het juiste sterrenbeeld moet met een methode gebeuren. 
 * Voor elke persoon moet de eerste letter van de voornaam gevolgd 
 * door een punt gevolgd door de achternaam (dit alles in hoofdletters) afgedrukt worden. 
 * Maak hier op een zinvolle manier gebruik van een StringBuilder.
 * Dit dient te gebeuren in een methode. Bv.: Hans Andersen geboren op 3/2 geeft: H. ANDERSEN waterman
 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String naam, voornaam, sterrenbeeld, volledigeNaam;
		byte geboortedag, geboortemaand;
		
		String[] sterrenbeelden = {"waterman", "vissen", "ram", "stier",
				"tweelingen", "kreeft", "leeuw", "maagd", "weegschaal", "schorpioen",
				"boogschutter", "steenbok"};
	
		System.out.println("Geef de naam in");
		naam = keyboard.next();
		
		while(!naam.equals("\\")) {
			System.out.println("Geef de voornaam in");
			voornaam = keyboard.next();
			
			System.out.println("Geef de geboortedag");
			geboortedag = keyboard.nextByte();
			
			System.out.println("Geef de geboortemaand");
			geboortemaand = keyboard.nextByte();
			
			sterrenbeeld = bepaalSterrenbeeld(geboortedag, geboortemaand, sterrenbeelden);
			
			volledigeNaam = structureerNaam(naam, voornaam);
			
			System.out.println(volledigeNaam + " " + sterrenbeeld);
			
			System.out.println("Geef de naam in");
			naam = keyboard.next();
			
		}
		
		keyboard.close();
	}
	public static String bepaalSterrenbeeld(byte dag, byte maand, String[] sterrenBeelden) {
		String sterrenbeeld;
		
		if(dag > 20) {
			sterrenbeeld = sterrenBeelden[maand-1];
		} else {
			if(maand == 1) {
				sterrenbeeld = sterrenBeelden[sterrenBeelden.length - 1];
			} else {
				sterrenbeeld = sterrenBeelden[maand-2];
			}
			
		}
		
		return sterrenbeeld;
	}
	public static String structureerNaam(String naam, String voornaam) {
		StringBuilder volledigeNaam = new StringBuilder();;
		
		volledigeNaam.append(voornaam.substring(0,1).toUpperCase());
		volledigeNaam.append(". ");
		volledigeNaam.append(naam.toUpperCase());
		
		return volledigeNaam.toString();
	}

}
