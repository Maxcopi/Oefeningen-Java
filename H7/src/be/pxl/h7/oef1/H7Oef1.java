package be.pxl.h7.oef1;

import java.util.Scanner;

public class H7Oef1 {
/*
 * Geef 15 gehele getallen in via het toetsenbord.
 *  Druk het gemiddelde af weergegeven met 1 cijfer na de komma.
 *  Hoeveel getallen zijn er kleiner dan het gemiddelde van deze 15 getallen?
 *  Hoeveel procent is dit van de ingegeven getallen?
 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int som = 0;
		int aantalKleiner=0;
		int gemiddelde;
		float percentKleiner;
		int[] getallen = new int[15];
		
		for(int i = 0; i < getallen.length; i++) {
			System.out.printf("geef getal %d in%n",i);
			getallen[i]=keyboard.nextInt();
		}
		for(int n : getallen) {
			som += n;
		}
		gemiddelde = som / getallen.length;
		
		for(int n : getallen) {
			if(n < gemiddelde) {
				aantalKleiner++;
			}
		}
		
		percentKleiner = (float)aantalKleiner / getallen.length * 100;
		
		System.out.printf("Het gemiddelde is %d en het percentage kleiner dan het gemiddelde is %.2f", gemiddelde, percentKleiner);
		
		keyboard.close();
	}

}
