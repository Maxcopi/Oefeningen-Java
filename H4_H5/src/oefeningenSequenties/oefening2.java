package oefeningenSequenties;

import java.util.Scanner;

public class oefening2 {
	/*
	 * Schrijf een programma dat de prijsexclusief 
	 * BTW berekent en afdrukt. Via het toetsenbord wordt 
	 * de prijs inclusiefBTW en het BTWpercentage ingegeven.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double inclusiefBtw, prijs, exclusiefBtw;
		int aantal;
		
		System.out.println("Geef een aantal op");
		aantal = keyboard.nextInt();
		System.out.println("Geef een prijs op");
		prijs = Double.valueOf(keyboard.next());
		
		inclusiefBtw = (aantal * prijs) * 1.21;
		exclusiefBtw = aantal * prijs;
		
		System.out.println(inclusiefBtw);
		
		System.out.println(exclusiefBtw);
		
		keyboard.close();
	}

}
