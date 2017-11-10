package opdrachten;

import java.util.Scanner;

public class Opdracht4 {

	public static void main(String[] args) {
		StringBuilder tekst = new StringBuilder("Het is weer maandag\nHoera!");
		System.out.println(tekst);
		
		System.out.println("**********************");
		tekst.append("maar volgende week is het vakantie :-D");
		System.out.println(tekst);
		System.out.println("**********************");
		tekst.reverse();
		System.out.println(tekst);
		System.out.println("**********************");
		tekst.reverse();
		System.out.println(tekst);
		
		
		tekst = new StringBuilder(tekst.toString().replaceAll(" ", ""));
		
		System.out.println(tekst);
		
		System.out.println("**********************");
		
		tekst = new StringBuilder(tekst.toString().replaceAll("t", "tt"));
		
		System.out.println(tekst);
	}

}
