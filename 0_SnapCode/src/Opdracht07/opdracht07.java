package Opdracht07;

import java.util.Scanner;

public class opdracht07 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hoeveel leerlingen zijn er? ");
		int students = keyboard.nextInt();
		
		if (students <= 10) {
			System.out.println("Lokaal LinksOnder");
		} else {
			if (students <= 20) {
				System.out.println("Lokaal LinksBoven");
			} else {
				if (students <= 30) {
					System.out.println("Lokaal RechtsBoven");
				} else {
					if (students <= 40) {
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
