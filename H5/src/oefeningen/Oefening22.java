package oefeningen;

import java.util.Scanner;

public class Oefening22 {
	/*
	 * Een verfhandelaar wenst snel te kunnen uitrekenen hoeveel liter verf 
	 * nodig is om een plafond te verven. Hij heeft ongeveer 1 liter verf nodig per 7 m2. 
	 * De lengte en breedte van het te verven plafond worden ingevoerd, waarna de benodigde hoeveelheid 
	 * verf berekend (via een methode) en afgedrukt wordt. Als de verf verkocht wordt in potten van k liter, 
	 * hoeveel potten verf heeft hij dan nodig (via een methode berekenen). 
	 * k is een geheel getal dat door de gebruiker wordt ingegeven.
	 */
	
	public static float berekenLiter(float oppervlakte) {
		float liter;
		
		liter = oppervlakte / 7;
		
		return liter;
	}
	
	public static byte berekenPotten(float liter, byte potGrootte) {
		byte potten;
		
		potten = (byte)(liter / potGrootte);
		if((liter % potGrootte) > 0 ) {
			potten++;
		}
		
		return potten;
	}
	
	
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		float breedte, lengte, liter, oppervlakte;
		byte potten, potGrootte;
		
		System.out.println("Wat is de lengte van de kamer?");
		lengte = keyboard.nextFloat();
		
		System.out.println("Wat is de breedte van de kamer?");
		breedte = keyboard.nextFloat();
		
		System.out.println("Hoeveel liter kan er in een pot?");
		potGrootte = keyboard.nextByte();
		
		oppervlakte = lengte * breedte;
		
		liter = berekenLiter(oppervlakte);
		
		potten = berekenPotten(liter, potGrootte);
		
		System.out.println(liter + " " + potten);
		
		keyboard.close();
	}

}
