package oefeningen;

import java.util.Scanner;

public class oefening5 {
	/*
		Geef het gewicht van een appel (in gram) in via het toetsenbord.
		Maak een tabel om het gewicht van 1 tot 100 appels af te drukken als volgt:
		aantal appels gewicht in gram
		1 165
		2 330
		… …
		100 16500
		Maak deze opgave eerste via een for, vervolgens via een while.
		Welk is de betere oplossing?
	 */
	public static void main(String[] args) {
		int gewicht;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Wat is het gewicht van de appel?");
		gewicht = keyboard.nextInt();
		
		for(int i=1; i <= 100; i++) {
			int totaalGewicht = gewicht * i;
			System.out.println(i + " " + totaalGewicht);
			
		keyboard.close();
			
		}
	}
}
