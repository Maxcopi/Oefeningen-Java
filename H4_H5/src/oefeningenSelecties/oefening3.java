package oefeningenSelecties;

import java.util.Scanner;

public class oefening3 {
	/*
	 * Schrijf een programma dat het BTWpercentage berekent en afdrukt. 
	 * Via het toetsenbord wordt de prijs inclusiefBTW en de prijs exclusiefBTW ingegeven.
	 * Opmerking: een percentage van 21% moet afgedrukt worden als 0,21.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		double btw, prijsInclBtw, prijsExclBtw;
		
		System.out.println("Geef de prijs exclusief btw in");
		prijsExclBtw = keyboard.nextDouble();
		System.out.println("Geef de prijs inclusief btw in");
		prijsInclBtw = keyboard.nextDouble();
		
		btw = prijsInclBtw/prijsExclBtw - 1;
		
		System.out.println("De btw bedraagt: " + btw);
		
		keyboard.close();
	}

}
