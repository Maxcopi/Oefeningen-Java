package extra_oefeningen;

import java.util.Scanner;

public class Oefening12 {
	/*
	 * Lees per arbeider de volgende gegevens in: het nummer van de arbeider, 
	 * het uurloon en het aantal gewerkte uren in een week. 
	 * Bereken het weekloon rekening houdend met het feit dat het uurloon voor uren 
	 * boven de 38 uren 50% hoger ligt. Druk af: het nummer van de arbeider en zijn weekloon. 
	 * Indien als nummer 0 wordt ingevoerd, betekent dit het einde van het programma. 
	 * Vervolgens wordt het nummer van de arbeider afgedrukt die het meeste uren gewerkt heeft.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int arbeiderNummer, arbeiderMeesteUren;
		float aantalUren, uurloon, weekloon, overuren, meesteUren;
		meesteUren = 0;
		arbeiderMeesteUren = 0;
		
		System.out.println("Geef het nummer van de arbeider");
		arbeiderNummer = keyboard.nextInt();
		
		while(arbeiderNummer != 0) {
			System.out.println("Geef het aantal uren gewerkt");
			aantalUren = keyboard.nextFloat();
			
			System.out.println("Geef het uurloon van de arbeider");
			uurloon = keyboard.nextFloat();
			
			if(aantalUren > 38) {
				overuren = aantalUren % 38;
				System.out.println(overuren);
				weekloon = uurloon * 38 + 2 * (overuren * uurloon);
			} else {
				weekloon = uurloon * aantalUren;
			}
			if(aantalUren > meesteUren) {
				arbeiderMeesteUren = arbeiderNummer;
				meesteUren = aantalUren;
			}
			
			System.out.println("Het weekloon van arbeider " + arbeiderNummer + " bedraagt: " + weekloon);
			
			System.out.println("Geef het nummer van de arbeider");
			arbeiderNummer = keyboard.nextInt();
		}
		System.out.println("De arbeider met de meeste uren is " + arbeiderMeesteUren + " met " + meesteUren + " uren");
		
		
		keyboard.close();
	}

}
