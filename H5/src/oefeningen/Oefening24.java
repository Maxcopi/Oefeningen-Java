package oefeningen;

import java.util.Scanner;

public class Oefening24 {
	/*
	 * Schrijf een programma om de prijs van de huur van films en de huurtijd te berekenen. 
	 * Je geeft het aantal films in die een persoon huurt. Vervolgens geef je per film het genrenummer 
	 * (getal bestaande uit 5 cijfers), het aantal sterren, het jaar van uitgave en de speeltijd in minuten in.
	 * De huurprijs wordt als volgt berekend:
		• 4 en 5 sterrenfilms kosten 4,5€ 3 en 2 sterrenfilms kosten 3,75€ 1 sterrenfilms kosten 3€
		• Voor films ouder dan 10 jaar betaal je 0,50€ minder
	Let op: beide voorgaande regels gelden niet voor tekenfilms (genrenummer begint met een 1). Hiervoor geldt een huurprijs van 0,5 eurocent per minuut speeltijd.
De huurtijd wordt als volgt berekend:
voor recente films (films die hoogstens 2 jaar oud zijn), die ofwel 5 sterren 
hebben, ofwel van het genre science fiction (genrenummer begint met een 5) zijn, 
geldt een huurtijd van 1 dag, voor anderen 2 dagen.
Maak voor het berekenen van de huurprijs en de huurtijd gebruik van methoden. 
Druk per persoon voor elke gehuurde film de kostprijs en de huurtijd af. 
Druk ook de totale kostprijs af en de gemiddelde kostprijs per film af.
Voorbeeld van afdruk voor een persoon die 3 films huurt 
Film1 € 4.5 1 dag Film2 € 3.75 2 dagen Film3 € 2.5 2 dagen Te betalen: € 10.75 Gemiddelde kostprijs per film: € 3.5833333
Extra: Zorg ervoor dat het gemiddelde wordt weergegeven met 2 decimalen.
	 */
	
	/*
	public static float berekenHuurPrijs(short speeltijd, short jaarUitgave) {
		float huurPrijs;
		if((genre.charAt(0) == '1')) {
			huurprijs = 0.005 * speeltijd;
		}
		return huurPrijs;
	}
	
	public static byte berekenHuurTijd(short genre) {
		byte huurtijd;
		
		
		
		//return huurTijd;
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		float prijsHuur;
		short aantal, genrenummer, jaarUitgave, speeltijdMin;
		byte huurTijd;
		char sterren;
		
		System.out.println("Geef het aantal films in");
		aantal = keyboard.nextShort();
		
		for(int i = 1; i <= aantal; i++) {
			System.out.println("Geef het aantal sterren in");
			sterren = keyboard.next().charAt(0);
			System.out.println("Geef het genrenummer in");
			genrenummer = keyboard.nextShort();
			System.out.println("Wat was het jaar van de uitgave?");
			jaarUitgave = keyboard.nextShort();
			System.out.println("Geef de speeltijd in minuten");
			speeltijdMin = keyboard.nextShort();
			
			//prijsHuur = berekenHuurPrijs(sterren, jaarUitgave);
			huurTijd = berekenHuurTijd(genrenummer);
		}
		
		
		
		
		keyboard.close();
	}
*/
}
