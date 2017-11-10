package oefeningen;

import java.util.Scanner;

public class Oefening25 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		char geslacht;
		float bmi;
		int aantal = 0, aantalVrouwen = 0, aantalTeZwaar = 0;
		float lengteLaagsteM = 10000;
		float gemiddeldeVrouwen, percentageOvergewicht, somLengteVrouwen = 0;
		
		System.out.println("Geef het geslacht in");
		geslacht = keyboard.next().charAt(0);
		
		
		while(geslacht != '2') {
			System.out.println("Geef het gewicht op");
			float gewicht = keyboard.nextFloat();
			System.out.println("Geef de lengte in");
			float lengte = keyboard.nextFloat();
			bmi = berekenBMI(gewicht, lengte);
			
			if(bmi >= 40) {
				System.out.println("Ernstige zwaalijvigheid");
				aantalTeZwaar++;
			} else {
				if(bmi >= 30) {
					System.out.println("Zwaarlijvigheid (obesitas)");
					aantalTeZwaar++;
				} else {
					if(bmi >= 27) {
						System.out.println("Overgewicht");
						aantalTeZwaar++;
					} else {
						if(bmi >= 25) {
							System.out.println("Neiging to overgewicht");
							aantalTeZwaar++;
						} else {
							if(bmi >= 18) {
								System.out.println("Normaal gewicht");
							} else {
								System.out.println("Ondergewicht");
							}
						}
					}
				}
			}
			
			if(geslacht == '1' && lengte < lengteLaagsteM) {
				lengteLaagsteM = lengte;
			}
			if(geslacht == '0') {
				aantalVrouwen++;
				somLengteVrouwen+=lengte;
			}
			aantalTeZwaar++;
			
			System.out.println("Geef het geslacht in");
			geslacht = keyboard.next().charAt(0);
		}
		percentageOvergewicht = ((float)aantal / aantalTeZwaar) * 100;
		gemiddeldeVrouwen = somLengteVrouwen / aantalVrouwen;
		System.out.println("Lengte van de kleinste man: "+lengteLaagsteM);
		System.out.println("Percentage van de mensen met overgewicht: " + percentageOvergewicht);
		System.out.println("De gemiddelde lengte van de vrouwen: " + gemiddeldeVrouwen);
		
		keyboard.close();
	}
	
	public static float berekenBMI(float gewicht,float lengte) {
		float bmi;
		
		bmi = gewicht / (lengte * lengte);
		
		return bmi;
	}

}
