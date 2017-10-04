package oefeningenSequenties;

import java.util.Scanner;

public class oefening1 {
/*
 * De telefoonmaatschappij rekent aan haar klanten tweemaandelijks een vast bedrag van 20 euro 
 * (aansluiting, huur, onderhoud). Een telefoongesprek binnen België kost 12 
 * eurocent (ongeacht de duur van het gesprek), een telefoongesprek naar het 
 * buitenland kost 50 eurocent per begonnen minuut. In deze tarieven is geen BTW inbegrepen.
 * Je geeft via het toetsenbord het aantal Belgische gesprekken op en het aantal minuten dat er naar 
 * het buitenland getelefoneerd werd. Het programma berekent hoeveel je moet betalen. Het BTW-percentage is 21%.

 */
	public static void main(String[] args) {
		int bedrag, aantal, minutenBuitenland;
		double totaal;
		bedrag = 20;
		
		Scanner keyboard = new Scanner(System.in);

		
		System.out.println("Geef het aantal Belgische gesprekken op");
		aantal = keyboard.nextInt();
		System.out.println("Geef het aantal minuten naar het buitenland op");
		minutenBuitenland = keyboard.nextInt();
		
		totaal = bedrag + ((aantal * 0.12 + minutenBuitenland * 0.50) * 1.21);
		
		System.out.println(totaal);
		keyboard.close();
	}

}
