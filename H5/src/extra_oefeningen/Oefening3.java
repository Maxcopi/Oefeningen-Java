package extra_oefeningen;

import java.util.Scanner;

public class Oefening3 {
	/*
	 * Een handelaar in op maat gemaakte zwembaden wenst snel te kunnen uitrekenen hoeveel 
	 * liter water en ontsmettingsmiddel in een zwembad van een bepaalde grootte kunnen.
	 * 100 liter zwembadwater moet 98 l water bevatten en 2 liter ontsmettingsmiddel.
	 * De lengte, breedte en diepte van het zwembad (uitgedrukt in meter) worden ingevoerd, 
	 * waarna aantal liter water en aantal liter ontsmettingsmiddel afgedrukt worden (zonder cijfers na de komma).
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		float lengte, breedte, diepte, inhoud;
		short literWater, literMiddel;
		
		System.out.println("Geef de lengte van het zwembad");
		lengte = keyboard.nextFloat();
		System.out.println("Geef de breedte van het zwembad");
		breedte = keyboard.nextFloat();
		System.out.println("Geef de diepte van het zwembad");
		diepte = keyboard.nextFloat();
		
		inhoud = lengte * breedte * diepte;
		
		literWater = (short)(inhoud * 0.98f);
		
		literMiddel = (short)(inhoud * 0.02f);
		
		System.out.println("Het aantal liter water voor het zwembad: " + literWater);
		System.out.println("Het aantal liter ontsmettingsmiddel: " + literMiddel);
		
		keyboard.close();
	}

}
