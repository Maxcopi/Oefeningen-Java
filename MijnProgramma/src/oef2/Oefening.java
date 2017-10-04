package oef2;

import java.util.Scanner;


public class Oefening {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner toetsenbord = new Scanner(System.in);			//CTRL+space op onbekende klasse voegt import toe!!!
																//Object toetsenbord creëren uit klasse Scanner
		int aantalKinderen;										//Instantievariabelen declareren
		int aantalVolwassenen;
		int prijsKinderen = 15;
		int prijsVolwassenen = 15;
		int totaalPrijs;
		
		System.out.println("Goedendag, voor hoeveel kinderen wilt u tickets kopen?");
		aantalKinderen = toetsenbord.nextInt();
		System.out.println(aantalKinderen + " kinderen");		//Inlezen variabelen via input toetsenbord
		System.out.println("En voor hoeveel volwassenen?");
		aantalVolwassenen = toetsenbord.nextInt();
		System.out.println(aantalVolwassenen + " volwassenen");
		
		totaalPrijs = (aantalKinderen * prijsKinderen) + (aantalVolwassenen * prijsVolwassenen);
		System.out.println("Dat is dan €" + totaalPrijs + ", alstublieft.");
		
		toetsenbord.close();
	}

}
