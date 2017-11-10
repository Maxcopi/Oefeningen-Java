package be.pxl.h6.oef1;

import java.util.Random;

public class H6Oef1 {
/*
 * Schrijf een programma om huiswerk te genereren voor kinderen van het eerste leerjaar.
We gaan ervan uit dat ze kunnen tellen tot 20. Het huiswerk gaat over het inoefenen van
de bewerking aftrekking. Om de kinderen niet in de war te brengen zorgen we dat enkel
oefeningen waarvan het resultaat groter of gelijk is aan nul als output worden
gegenereerd.
Er worden verschillende reeksen gemaakt. Reeks A, reeks B tot en met reeks F. Elke reeks
bevat 5 oefeningen.
De output moet als volgt eruit zien:
reeks A
1) 11 – 2 =
2) 20 – 9 =
3) 2 – 0 =
4) 14 – 11 =
5) 5 – 5 =
reeks B
….
 */
	public static void main(String[] args) {
		Random rand = new Random();
		
		int getal1, getal2, resultaat, tellerGoed;
		
		for(char reeks = 'A'; reeks <= 'F'; reeks++) {
			tellerGoed = 0;
			System.out.println("reeks " + reeks);
			while(tellerGoed < 5) {
				getal1 = rand.nextInt(20)+1;
				getal2 = rand.nextInt(20)+1;
				resultaat = getal1 - getal2;
				if(resultaat >= 0) {
					tellerGoed++;
					System.out.printf("%d) %d - %d = \n", tellerGoed, getal1, getal2, resultaat);
				}
			}
		}
			
		
		
	}

}
