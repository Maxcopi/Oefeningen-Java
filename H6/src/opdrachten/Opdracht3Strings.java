package opdrachten;

import java.util.Scanner;

public class Opdracht3Strings {

	public static void main(String[] args) {
		/*
		String text = "Hello world";
		text = text.toUpperCase();
		
		System.out.println(text);
		*/
		
//		Scanner keyboard = new Scanner(System.in);
//		
//		System.out.println("Geef je naam");
//		String naam = keyboard.nextLine();
//		
//		System.out.println("Geef je voornaam");
//		String voornaam = keyboard.nextLine(); // nextLine print de hele lijn af, next print alles af tot een spatie
//		
//		System.out.println("de naam is " + naam);
//		System.out.println("de voornaam is " + voornaam);
//		
//		keyboard.close();
		
		String tekst = "dit is een inhaalles op vrijdag";
		
		
		System.out.println("De lengte van de tekst is: " + tekst.length());
		
		System.out.println(tekst.toUpperCase());
		
		System.out.println(tekst.toLowerCase());
		
		System.out.println(tekst.replace('a', 'o'));
		System.out.println(tekst.indexOf("d"));
		
		int teller = 0;
		for(int i = 0; i < tekst.length(); i++) {
			if(tekst.charAt(i) == 'e') {
				teller++;
			}
		}
		System.out.println(teller);
		
		String tekst2 = "ik vind het fijn als jullie stil zijn";
		if(tekst.equals(tekst2)) {
			System.out.println("De stringen zijn gelijk");
		} else {
			System.out.println("Ze zijn ongelijk");
		}
		
		tekst = "zoe";
		tekst2 = "annemarie";
		
		if(tekst.compareTo(tekst2) < 0) {
			System.out.println("tekst 1 is de kleinste");
		} else {
			System.out.println("tekst 2 is de kleinste");
		}
		
		tekst = "      extra spaties    ";
		
		System.out.println(tekst.trim());
		
		String naam = new String();
		tekst = "mAxIm";
		tekst2 = "copPieTeRs";
		naam = tekst.substring(0, 1).toUpperCase() + ". ";
		naam += tekst2.substring(0,1).toUpperCase();
		naam += tekst2.substring(1).toLowerCase();
		
		System.out.println(naam);
		
		tekst = "Hadlo";
		if(tekst.length() % 2 == 0) { //even tekens
			int pos = tekst.length() / 2 - 1;
			System.out.println(tekst.substring(pos, pos+2));
		} else { //oneven
			int pos = tekst.length() / 2;
			System.out.println(tekst.substring(pos, pos + 1));
		}
	}

}
