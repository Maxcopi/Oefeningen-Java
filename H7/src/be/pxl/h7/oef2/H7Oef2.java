package be.pxl.h7.oef2;

import java.util.Random;

public class H7Oef2 {
/*
 * Creëer een array van 500 elementen waarbij de elementen willekeurige gehele getallen zijn.
 *  Laat deze getallen genereren in Java. Tel alle elementen van de array die 
 *  groter zijn dan 100 op en druk het resultaat van deze optelling af. 
 *  Het zou kunnen dat je een verkeerd resultaat uitkomt? Hoe komt dit? Hoe kan je dit vermijden?
 *  long gebruiken of grens opleggen
 */
	public static void main(String[] args) {
		Random generator = new Random();
		int getal;
		int[] randomGetallen = new int[500];
		long som=0;
		
		for(int i = 0; i < randomGetallen.length; i++) {
			getal = generator.nextInt();
			randomGetallen[i] = getal;
		}
		
		for(int n : randomGetallen) {
			if(n > 100) {
				som+=n;
			}
		}
		System.out.println(som);
        
	}

}
