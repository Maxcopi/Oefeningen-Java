package oefeningenIteraties;

import java.util.Scanner;

public class oefening5 {
	/*
	 * Telkens hij benzine tankte heeft Pieter opgeschreven hoeveel 
	 * liter bijgevuld werd en hoeveel kilometer hij met die brandstof gereden 
	 * heeft. Regelmatig controleert hij zijn gemiddeld verbruik. Maak hiervoor
	 *  een programma. Nadat Pieter een aantal waarden heeft ingegeven voor het 
	 *  aantal kilometer en het aantal liter, geeft hij als eindwaarde de waarde 
	 *  0 in voor het aantal kilometers.  Druk aan het einde het gemiddelde verbruik af per 100 km.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int kilometer, liter, totaalKilometers, totaalLiters, gemiddeldVerbruik;
		
		totaalKilometers = 0;
		totaalLiters = 0;
		
		while(true) {
			System.out.println("Geef het aantal kilometer op");
			kilometer = keyboard.nextInt();
			if(kilometer == 0) {
				break;
			}
			totaalKilometers += kilometer;
			System.out.println("Geef het aantal liter op");
			liter = keyboard.nextInt();
			totaalLiters += liter;
		}
		gemiddeldVerbruik = (totaalLiters / totaalKilometers) * 100;
		
		System.out.println("Het gemiddeld verbruik was: " + gemiddeldVerbruik);
		
		keyboard.close();
	}

}
