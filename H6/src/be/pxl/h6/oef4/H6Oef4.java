package be.pxl.h6.oef4;

import java.util.Scanner;

public class H6Oef4 {
/*
 * Schrijf een programma om van 2 tekstvariabelen één tekstvariabele te maken. De nieuwe
variabele bekom je door de eerste 4 letters van 1ste tekstvariabele te nemen (indien deze
minder dan 4 letters bevat dient dit van achter aangevuld te worden met *) in hoofdletters
gevolgd door de laatste 4 letters van de 2de tekst variabele (indien deze minder dan 4
letters bevat dient dit van voor aangevuld te worden met +) in kleine letters.
 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef tekst 1 in");
		String tekst1 = new String(keyboard.nextLine());
		System.out.println("Geef tekst 2 in");
		String tekst2 = new String(keyboard.nextLine());
		String tekst = new String();
		
		if(tekst1.length()>=4) {
			if(tekst2.length()>=4) {
				tekst = tekst1.substring(0, 4) + tekst2.substring(0, 4);
			} else {
				tekst = tekst2.substring(0, tekst2.length()).toLowerCase() + tekst1.substring(0, 4);
			}
		} else {
			if(tekst2.length()>=4) {
				tekst = tekst2.substring(0, 4) + tekst1.substring(0,tekst2.length()).toUpperCase();
			} else {
				tekst = tekst2.substring(0,tekst2.length()).toLowerCase() +
						tekst1.substring(0,tekst1.length()).toUpperCase();
			}
		}
		System.out.println(tekst);
		
		keyboard.close();
	}

}
