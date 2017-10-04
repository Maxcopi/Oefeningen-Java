package oefeningenSelecties;

import java.util.Scanner;

public class oefening4 {
/*
 * Bereken de aankomsttijd van een vlucht. 
 * De vertrektijd (uren en minuten in 2 verschillende variabelen) 
 * en de duur in minuten worden ingevoerd.
 * Vb. vertrekuur = 22, vertrekminuut = 18, duur = 170, 
 * het aankomstuur wordt 1, de aankomstminuut wordt 8.

 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int vertrekuur, vertrekminuut, duur, aankomstuur, aankomstminuut;
		
		System.out.println("Geef het vertrekuur in");
		vertrekuur = keyboard.nextInt();
		System.out.println("Geef de vertrekminuut in");
		vertrekminuut = keyboard.nextInt();
		System.out.println("Geef de duur in");
		duur = keyboard.nextInt();
		
		aankomstminuut = vertrekminuut + duur;
		aankomstuur = vertrekuur;
		
		for(int i=23; i >= 0; i--) {
			if(aankomstminuut >= (i*60)) {
				aankomstminuut -= (i*60);
				aankomstuur = aankomstuur + i;
			}
		}
		
		/*
		if(aankomstminuut > 180) {
			aankomstminuut -= 180;
			aankomstuur = vertrekuur + 3;
		} else {
			if(aankomstminuut > 120){
				aankomstminuut -= 120;
				aankomstuur = vertrekuur + 2;
			} else {
				if(aankomstminuut > 60){
					aankomstminuut -= 60;
					aankomstuur = vertrekuur + 1;
				}
				else {
					aankomstuur = vertrekuur;
				}
			}
		}
		*/
		
		if(aankomstuur > 23) {
			aankomstuur = aankomstuur - 24;
		}
		System.out.println("Je komt aan om " + aankomstuur + ":" + aankomstminuut);
		keyboard.close();
	}

}
