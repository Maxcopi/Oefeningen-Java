package extra_oefeningen;

import java.util.Scanner;

public class Oefening7 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		float btwBedrag, prijsIncBtw, prijsExBtw;
		int artikelNummer;
		int btwcode = 0;
		
		System.out.println("Wat is het artikelnummer?");
		artikelNummer = keyboard.nextInt();
		
		System.out.println("Geef de prijs exclusief btw");
		prijsExBtw = keyboard.nextFloat();
		
		btwcode = artikelNummer % 1000;
		
		
		switch (btwcode) {
		case 1: 
			
			btwBedrag = 0.06f * prijsExBtw;
			prijsIncBtw = prijsExBtw + btwBedrag;
			break;
		case 2:
			btwBedrag = 0.17f * prijsExBtw;
			prijsIncBtw = prijsExBtw + btwBedrag;
			break;
		case 3:
			btwBedrag = 0.19f * prijsExBtw;
			prijsIncBtw = prijsExBtw + btwBedrag;
			break;
		case 4:
			btwBedrag = 0.25f * prijsExBtw;
			prijsIncBtw = prijsExBtw + btwBedrag;
			break;
		case 5:
			btwBedrag = 0.33f * prijsExBtw;
			prijsIncBtw = prijsExBtw + btwBedrag;
			break;
		default:
			btwBedrag = 0.21f * prijsExBtw;
			prijsIncBtw = prijsExBtw + btwBedrag;
		}
		
		System.out.println("De prijs inclusief btw bedraagt: " + prijsIncBtw);
		
		keyboard.close();
	}

}
