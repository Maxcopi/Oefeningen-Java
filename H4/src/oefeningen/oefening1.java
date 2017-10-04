package oefeningen;

import java.util.Scanner;

public class oefening1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int totaal, prijsVolwassenen, prijsKinderen, 
		aantalKinderen, aantalVolwassenen;
		
		prijsVolwassenen = 28;
		prijsKinderen = 15;
		
		System.out.println("Hoeveel volwassenen?");
		aantalVolwassenen = keyboard.nextInt();
		
		System.out.println("Hoeveel kinderen?");
		aantalKinderen = keyboard.nextInt();
		
		totaal = (aantalKinderen * prijsKinderen)
				+ (aantalVolwassenen * prijsVolwassenen);
		
		System.out.println("De totaalprijs bedraagt " + totaal);
		keyboard.close();
	}

}
