package oefeningenSelecties;

import java.util.Scanner;

public class oefening2 {
/*
 * Schrijf een programma dat de prijsexclusief BTW berekent en afdrukt.
 * Via het toetsenbord wordt de prijs inclusiefBTW en het BTWpercentage ingegeven.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		double prijsMetBtw, prijsZonderBtw;
		
		System.out.println("Geef de prijs inclusief btw in");
		prijsMetBtw = keyboard.nextDouble();
		
		prijsZonderBtw = prijsMetBtw / 1.21;
		
		System.out.println("De prijs exclusief btw is: " + prijsZonderBtw);
		
		keyboard.close();
	}

}
