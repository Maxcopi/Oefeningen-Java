package oefeningen;

import java.util.Scanner;

public class Oefening5 {
/*
 * Geef een geldbedrag in euro’s in (geen eurocenten). 
 * Hoeveel briefjes van 20 euro kan je hiermee maken? Wat is het restbedrag?
 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int bedrag;
		short briefjes;
		byte rest;
		
		System.out.println("Geef het bedrag in euros in, geen kommagetallen");
		bedrag = keyboard.nextInt();
		
		briefjes = (short)(bedrag / 20);
		
		rest = (byte)(bedrag % 20);
		
		System.out.println("Het aantal briefjes: " + briefjes);
		System.out.println("De rest is " + rest);
		
		keyboard.close();
	}

}
