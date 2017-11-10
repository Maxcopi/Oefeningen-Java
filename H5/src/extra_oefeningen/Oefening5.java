package extra_oefeningen;

import java.util.Scanner;

public class Oefening5 {
	/*
	 * Geef een geheel getal in (bestaat uit minstens 3 cijfers). 
	 * Druk de laatste 3 cijfers af. Opmerking: Er moeten steeds 3 cijfers afgedrukt worden. 
	 * Als bvb. de laatste 3 cijfers 009 zijn, moet dit zo worden afgedrukt en niet alleen het getal 9.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int getalUser, resultaat;
		
		System.out.println("Geef een getal in");
		getalUser = keyboard.nextInt();
		resultaat = getalUser % 1000;
		
		if(resultaat < 1000) {
			System.out.print("0");
			if(resultaat < 100) {
				System.out.print("0");
				if(resultaat < 10) {
					System.out.print("0");
				}
			}
		}
		System.out.print(resultaat);
		
		keyboard.close();
	}

}
