package be.pxl.h6.exoef3;

import java.util.Random;
import java.util.Scanner;

public class H6ExOef3 {
/*
 * Schrijf een programma om een ingevoerde tekst te encrypteren.
Bij elk teken wordt een getal bijgeteld. Dit getal is een willekeurig 
geheel getal >=2 en <=24 en moet een veelvoud zijn van 2. Maak voor het 
encrypteren gebruik van een methode met de ingevoerde tekst en het gegenereerde 
getal als parameters. Deze methode heeft de geëncrypteerde tekst als uitvoer.
Vb “dit is een belangrijke tekst” wordt dan “hmx$mw$iir$fiperkvmnoi$xiowx” 
als het gegenereerde getal gelijk is aan 4.
 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random generator = new Random();
		
		System.out.println("Geef de tekst voor encryptie in");
		String tekst = keyboard.nextLine();
		String encryptie;
		
		int getal;
		getal = generator.nextInt(23)+2;
		while(getal % 2 != 0) {
			getal = generator.nextInt(23)+2;
		}
		
		encryptie = encrypteerTekst(getal, tekst);
		System.out.println(getal);
		System.out.println(encryptie);

		keyboard.close();
	}
	public static String encrypteerTekst(int getal, String tekst) {
		StringBuilder encryptie = new StringBuilder();
		char huidigKarakter;
		for(int pos = 0; pos <= tekst.length() -1; pos++) {
			huidigKarakter = tekst.charAt(pos);
			huidigKarakter += getal;
			encryptie.append(huidigKarakter);
		}
		
		return encryptie.toString();
	}

}
