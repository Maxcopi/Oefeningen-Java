package Opdracht05;

import java.util.Scanner;

public class opdracht05 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een bedrag in: ");
		int input = keyboard.nextInt();
		
		if (input <= 5) {
			System.out.println("GROTER!");
		} else {
			if (input >= 10) {
				System.out.println("KLEINER!");
			} else {
				System.out.println("STOP!");
			}
		}
		
		
		keyboard.close();
	}

}
