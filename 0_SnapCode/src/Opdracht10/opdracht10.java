package Opdracht10;

import java.util.Scanner;

public class opdracht10 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hoeveel leerlingen zijn er?");
		int input = keyboard.nextInt();
		
		if (input >= 10 && input <= 30 && input % 5 == 0) {
			System.out.println("Aantal werkjes: " + input/5);
		} else {
			if (input > 30 || input < 10 && input % 2 == 0) {
				System.out.println("Aantal werkjes: " + input/2);
			} else {
					System.out.println("Aantal werkjes: " + input);
			}
		}

		keyboard.close();
	}

}
