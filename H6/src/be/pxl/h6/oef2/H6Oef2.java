package be.pxl.h6.oef2;

import java.util.Scanner;

public class H6Oef2 {
/*
 * Bepaal in een tekst de positie van de eerste t of T. Vervang van dan af alle letters door
hoofdletters als de tekst bestaat uit een oneven aantal tekens, door kleine letters als de
tekst bestaat uit een even aantal tekens.
Geef een gepaste melding als er in de tekst geen t of T voorkomt.
 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String tekst = new String();
		System.out.println("Geef een tekst in");
		tekst = keyboard.nextLine();
		int tpos = -1;
		
		tpos = tekst.indexOf("t");
		if(tpos == -1) {
			tpos = tekst.indexOf("T");
		}
		if(tpos != -1) {
			if(tekst.length()%2 ==0) {
				tekst = tekst.substring(0, tpos) + tekst.substring(tpos, tekst.length()).toUpperCase();
			} else {
				tekst = tekst.substring(0, tpos) + tekst.substring(tpos, tekst.length()).toLowerCase();
			}
		
			System.out.println(tekst);
		} else {
			System.out.println("De tekst bevat geen letter \"t\"");
		}
		
		keyboard.close();
	}

}
