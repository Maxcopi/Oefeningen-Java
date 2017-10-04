package Opdracht08;

import java.util.Scanner;

public class opdracht08 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hoeveel leerlingen zijn er? ");
		int inputStudents = keyboard.nextInt();
		System.out.println("Is er een rolstoel gebruiker?");
		String inputRolstoel = keyboard.next();
		
		boolean testRolstoel = inputRolstoel.equals("Ja");
		
		
		if (inputStudents <= 10) {
			System.out.println("Lokaal LinksOnder");
		} else {
			if (inputStudents <= 20 && testRolstoel == false) {
				System.out.println("Lokaal LinksBoven");
			} else {
				if (inputStudents <= 30 && testRolstoel == false) {
					System.out.println("Lokaal RechtsBoven");
				} else {
					if (inputStudents <= 40) {
					System.out.println("Lokaal RechtsOnder");
					} else {
						System.out.println("Te veel leerlingen");
					}
				}
			}
		}
		
		
		keyboard.close();

	}

}
