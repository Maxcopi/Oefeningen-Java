package be.pxl.h6.oef6;

import java.util.Scanner;

public class H6Oef6 {
		
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String naam;
		String motor;
		float hoogte, breedte, oppervlakte, gewicht;
		float gewichtMetaal = 11;
		double prijsMotor, totaalprijs;
		boolean kleur;
		
		System.out.println("Geef de naam van de verkoper");
		naam = keyboard.nextLine();
		
		System.out.println("Geef de hoogte van de poort");
		hoogte = keyboard.nextFloat();
		hoogte = controleerHoogte(hoogte);
		
		System.out.println("Geef de breedte van de poort");
		breedte = keyboard.nextFloat();
		breedte = controleerBreedte(breedte);
		
		System.out.println("Wilt u een speciale poort?");
		keyboard.nextLine();
		if(keyboard.nextLine().equals("Ja")) {
			kleur = true;
		} else {
			kleur = false;
		}
		
		oppervlakte = berekenOppervlakte(hoogte, breedte);
		gewicht = berekenGewicht(oppervlakte, gewichtMetaal);
		motor = bepaalMotor(gewicht);
		prijsMotor = bepaalPrijsMotor(motor);
		totaalprijs = berekenTotaalPrijs(oppervlakte, prijsMotor, kleur);
		genereerOfferteNummer(totaalprijs, naam);
		
		keyboard.close();
	}
	public static void genereerOfferteNummer(double totaalprijs, String naam) {
		StringBuilder totaal = new StringBuilder();
		
		totaal.append(totaalprijs);
		System.out.printf("2017_<<" + naam.toUpperCase() + ">>_<<"
				+ totaal.reverse() + ">>");
		
	}
	
	public static double bepaalPrijsMotor(String motor) {
		double prijsMotor;
		
		if(motor.equals("A101")) {
			prijsMotor = 120;
		} else {
			if(motor.equals("A105")) {
				prijsMotor = 220.5;
			} else {
				prijsMotor = 250.5;
			}
		}
		
		return prijsMotor;
	}
	
	public static double berekenTotaalPrijs(float opp, double prijsMotor, boolean specKleur) {
		double totaalPrijs;
		
		if(specKleur) {
			totaalPrijs = 1.10 * (opp * 113.5) + prijsMotor;
		} else {
			totaalPrijs = opp * 113.5 + prijsMotor;
		}
		
		return totaalPrijs;
	}
	
	public static float controleerHoogte(float h) {
		Scanner keyboard = new Scanner(System.in);
		while(h < 2 || h > 6.5f) {
			System.out.println("Geef een geldige hoogte in");
			h = keyboard.nextFloat();
		}
		return h;
	}

	public static float controleerBreedte(float b) {
		Scanner keyboard = new Scanner(System.in);
		while(b < 2 || b > 8) {
			System.out.println("Geef een geldige breedte in");
			b = keyboard.nextFloat();
		}
		return b;
		
	}
	
	public static float berekenOppervlakte(float h, float b) {
		float oppervlakte;
		
		oppervlakte = h * b;
		
		return oppervlakte;
	}
	
	public static float berekenGewicht(float opp, float gewMetaal) {
		float gewicht;
		
		gewicht = gewMetaal * opp;
		
		return gewicht;
	}
	
	public static String bepaalMotor(float gewicht) {
		String motor;
		
		if(gewicht > 300) {
			motor="X300";
		} else {
			if(gewicht >= 150) {
				motor="A105";
			} else {
				motor="A101";
			}
		}
		
		return motor;
	}
	
}
