package extraOefeningen;

import java.util.Scanner;

public class oefening2 {
/*
		Er worden 3 getallen ingelezen a, b en c. Als a+b kleiner is dan 20, moet c bij deze som
		geteld worden en moet dit resultaat afgedrukt worden. Als a en b samen groter dan of
		gelijk aan 20 zijn, dan moet de tekst “te groot” afgedrukt worden.
 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int a, b, c, resultaat;
		
		System.out.println("Geef getal a in");
		a = keyboard.nextInt();
		System.out.println("Geef getal b in");
		b = keyboard.nextInt();
		System.out.println("Geef getal c in");
		c = keyboard.nextInt();
		
		if ((a+b) < 20) {
			resultaat = a + b + c;
			System.out.println(resultaat);
		} else {
			System.out.println("te groot");
		}
		keyboard.close();
	}

}
