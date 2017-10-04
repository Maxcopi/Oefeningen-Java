package opdrachten;

import java.util.Scanner;

public class Opdracht11d {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		float lengte;
		int gewicht;
		float bmi;
		
		System.out.println("Geef je lengte");
		lengte = keyboard.nextFloat();
		
		System.out.println("Geef je gewicht");
		gewicht = keyboard.nextInt();
		
		bmi = gewicht / (lengte * lengte);
		
		System.out.println("De bmi is " + bmi);
		
		if(bmi >= 40) {
			System.out.println("ziekelijk overgewicht");
		} else {
			if(bmi >= 30) {
				System.out.println("obesitas");
			} else {
				if(bmi >= 25) {
					System.out.println("overgewicht");
				} else {
					System.out.println("Goed bezig");
					if(bmi >= 18) {
						System.out.println("ok");
					} else {
						System.out.println("ondergewicht");
					}
				}
			}
		}
		keyboard.close();
	}
	
}
