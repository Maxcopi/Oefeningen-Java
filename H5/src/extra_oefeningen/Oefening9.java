package extra_oefeningen;

import java.util.Scanner;

public class Oefening9 {
	/*
	 * Bereken de leeftijd van een persoon in jaren. 
	 * Geboortedag, geboortemaand en geboortejaar wordt als gegeven ingegeven. 
	 * De huidige dag, huidige maand, huidig jaar moet ook als gegeven worden ingegeven.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		byte leeftijd, geboorteDag, geboorteMaand, huidigDag, huidigMaand;
		int geboorteJaar, huidigJaar;
		boolean verjaard = false;
		
		System.out.println("Geef de geboortedag");
		geboorteDag = keyboard.nextByte();
		
		System.out.println("Geef de geboortemaand");
		geboorteMaand = keyboard.nextByte();
		
		System.out.println("Geef het geboortejaar");
		geboorteJaar = keyboard.nextInt();
		
		System.out.println("Geef de dag van vandaag");
		huidigDag = keyboard.nextByte();
		
		System.out.println("Geef de huidige maand");
		huidigMaand = keyboard.nextByte();
		
		System.out.println("Geef het huidig jaar");
		huidigJaar = keyboard.nextInt();
		
		if(geboorteMaand > huidigMaand) {
			verjaard = true;
		} else {
			if(geboorteMaand == huidigMaand) {
				if(geboorteDag >= huidigDag) {
					verjaard = true;
				}
			}
		}
		if(verjaard) {
			leeftijd = (byte)(huidigJaar - (geboorteJaar + 1));
		} else {
			leeftijd = (byte)(huidigJaar - geboorteJaar);
		}
		
		
		System.out.println(leeftijd);
		
		keyboard.close();
		
		}
	}


