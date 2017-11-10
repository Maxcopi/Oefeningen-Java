package extra_oefeningen;

import java.util.Scanner;

public class Oefening21 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double totaalKosten;
		byte vasteSom;
		int aantalKm, rijksregisternummer;
		int aantalSlachtoffers = 0, aantalLeden = 0;
		char typeWagen;
		float prijsVanaf11, prijsVanaf21;
		byte lid;
		totaalKosten = 0;
		
		System.out.println("Geef het rijksregisternummer in");
		rijksregisternummer = keyboard.nextInt();
		
		
		
		while(rijksregisternummer != 9999) {
			aantalSlachtoffers++;
			System.out.println("Geef het type wagen in");
			typeWagen = keyboard.next().charAt(0);
			
			System.out.println("Geef het aantal km die de wagen heeft gereden");
			aantalKm = keyboard.nextInt();
			
			System.out.println("Bent u lid van de mutualiteit (antwoord met 1 of 0)");
			lid=keyboard.nextByte();
			
			if(lid==1) {
				aantalLeden++;
				if(typeWagen == '1') {
					vasteSom = 15;
					prijsVanaf11 = 1.5f;
					totaalKosten = berekenKosten(aantalKm, vasteSom, prijsVanaf11);
				} else {
					vasteSom = 10;
					prijsVanaf11 = 1.0f;
					totaalKosten = berekenKosten(aantalKm, vasteSom, prijsVanaf11);
				}
			} else {
				if(typeWagen == '1') {
					vasteSom = 25;
					prijsVanaf21 = 2.25f;
					prijsVanaf11 = 1.75f;
					totaalKosten = berekenKosten(aantalKm, vasteSom, prijsVanaf11, prijsVanaf21);
				} else {
					vasteSom = 20;
					prijsVanaf21 = 1.75f;
					prijsVanaf11 = 1.15f;
					totaalKosten = berekenKosten(aantalKm, vasteSom, prijsVanaf11, prijsVanaf21);
				}
			}
			
			
			System.out.println("Het rijksregisternummer van het slachtoffer: " + rijksregisternummer);
			System.out.println("Totaal te betalen voor het slachtoffer: " + totaalKosten);
			
			System.out.println("Geef het rijksregisternummer in");
			rijksregisternummer = keyboard.nextInt();
		}
		System.out.println("Het totaal aantal slachtoffers: " + aantalSlachtoffers);
		System.out.println("Het percentage van leden is: " + ((float)aantalLeden / aantalSlachtoffers) * 100);
		keyboard.close();
	}
	
	public static double berekenKosten(int aantalKm, float vasteSom, float prijsVanaf11){
		double teBetalen;
		
		if(aantalKm > 10) {
			teBetalen = vasteSom; 
			teBetalen += (aantalKm - 10) * prijsVanaf11;
		} else {
			teBetalen = vasteSom;
		}
		return teBetalen;
	}
	public static double berekenKosten(int aantalKm, float vasteSom, float prijsVanaf11, float prijsVanaf21){
		double teBetalen;
		if(aantalKm > 20) {
			teBetalen = vasteSom;
			teBetalen += 10 * prijsVanaf11;
			teBetalen += (aantalKm - 20) * prijsVanaf21;
		} else {
			if(aantalKm > 10) {
				teBetalen = vasteSom;
				teBetalen += (aantalKm - 10) * prijsVanaf11;
			} else {
				teBetalen = vasteSom;
			}
		}
		return teBetalen;
	}

}
