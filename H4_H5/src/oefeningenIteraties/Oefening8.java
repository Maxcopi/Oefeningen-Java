package oefeningenIteraties;

import java.util.Scanner;

public class Oefening8 {
	/*
	 * Een trainingscentrum voor managers heeft het volgende criterium tot slagen.
	 *  Indien het gemiddelde (genomen zonder cijfers na de komma) op de drie examens 
	 *  beneden de 70% is, dan faalt de manager. In alle andere gevallen slaagt de manager.
	 *  Inschrijvingsnummer van de manager en de 
	 *  resultaten van de 3 examens (op 100) worden ingevoerd.  De invoer eindigt als voor 
	 *  het inschrijvingsnummer een getal wordt ingegeven dat eindigt op 2016.
	 *  Schrijf een programma om het volgende rapport af te drukken. Het gemiddelde (zonder cijfers na de komma).

	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		byte gemiddelde, resultaat1, resultaat2, resultaat3;
		int inschrijvingsnummer;
		
		String verslag = new String();
		verslag = ("Nr\tTEST1\tTEST2\tTEST3\tGEMIDDELDE\tSLAAGT/FAALT");
		System.out.println("Geef het inschrijvingsnummer van de manager");
		inschrijvingsnummer = keyboard.nextInt();
		
		
		while(inschrijvingsnummer % 10000 != 2016) {
			verslag+= "\n";
			System.out.println("Geef resultaat 1");
			resultaat1 = keyboard.nextByte();
			System.out.println("Geef resultaat 2");
			resultaat2 = keyboard.nextByte();
			System.out.println("Geef resultaat 3");
			resultaat3 = keyboard.nextByte();
			
			gemiddelde = (byte)((resultaat1 + resultaat2 + resultaat3) / 3);
			
			if(gemiddelde < 70) {
			verslag += "" + inschrijvingsnummer + "\t" + resultaat1 + "\t" + resultaat2 + "\t"
					+ resultaat3 + "\t" + gemiddelde + "\t\tslaagt";
			} else {
				verslag += "" + inschrijvingsnummer + "\t" + resultaat1 + "\t" + resultaat2 + "\t"
				+ resultaat3 + "\t" + gemiddelde + "\t\tfaalt";
			}
			System.out.println("Geef het inschrijvingsnummer van de manager");
			inschrijvingsnummer = keyboard.nextInt();
		}
		System.out.println(verslag);
		
		keyboard.close();
	}

}
