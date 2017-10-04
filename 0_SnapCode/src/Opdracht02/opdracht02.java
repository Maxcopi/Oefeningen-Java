package Opdracht02;

import java.util.Scanner;

public class opdracht02 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Maak keuze geslacht: ");
		String input = keyboard.next();
		
		boolean test = input.equals("Man");
		
		if (test == true) {
			System.out.println("U bent een man!");
		} else {
			if (test == false) {
				System.out.println("U bent een vrouw!");
			} else {
				System.out.println("Ongeldige input");
			}
		}
		
		keyboard.close();
	}

}
