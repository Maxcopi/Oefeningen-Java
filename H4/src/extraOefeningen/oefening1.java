package extraOefeningen;

import java.util.Scanner;

public class oefening1 {
	
	/*
		Geef 2 getallen in via het toetsenbord. Maak een afdruk als volgt:
		Het kleinste getal is ..
		Het kwadraat van het kleinste getal is..
		Vermijd 2 keer dezelfde code!
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		int getal1, getal2, kwadraat, kleinste;
		
		System.out.println("Geef een getal");
		getal1 = keyboard.nextInt();
		
		System.out.println("Geef nog een getal");
		getal2 = keyboard.nextInt();
		
		
		if(getal1 < getal2) {
			kleinste = getal1;
		} else {
			kleinste = getal2;
		}
		kwadraat = kleinste * kleinste;
		
		System.out.println("Het kwadraat van het kleinste getal is " + kleinste + " en het kwadraat hiervan " + kwadraat);
		keyboard.close();
	}

}
