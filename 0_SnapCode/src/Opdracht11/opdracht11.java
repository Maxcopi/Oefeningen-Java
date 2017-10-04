package Opdracht11;

import java.util.Scanner;

public class opdracht11 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hoeveel leerlingen zijn er?");
		int input = keyboard.nextInt();
		
		if (input % 2 == 0) {
			System.out.println("Aantal werkjes: " + input/2);
		} else {
			if (input > 10 && input % 5 == 0) {
				System.out.println("Aantal werkjes: " + input/5);
			} else {
				System.out.println("Aantal werkjes: " + input);
		}

		keyboard.close();
		}
	}
}
