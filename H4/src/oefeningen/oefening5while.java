package oefeningen;

import java.util.Scanner;

public class oefening5while {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int aantal, gewicht, totaalGewicht;
		aantal = 1;
		System.out.println("Wat is het gewicht van een appel in gram?");
		gewicht = keyboard.nextInt();
		while (aantal <= 100) {
			totaalGewicht = gewicht * aantal;
			System.out.println(aantal + " " + totaalGewicht);
			aantal++;
		}
		keyboard.close();

	}

}
