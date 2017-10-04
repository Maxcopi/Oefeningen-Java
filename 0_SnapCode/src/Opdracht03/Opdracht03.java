package Opdracht03;

import java.util.Scanner;

public class Opdracht03 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een bedrag in: ");
		int input = keyboard.nextInt();
		
		if (input > 5 && input < 10) {
			System.out.println("OK!");
		} else {
			System.out.println("STOP!");
		}

		keyboard.close();
	}

}
