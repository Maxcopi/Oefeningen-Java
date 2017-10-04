package Opdracht09;

import java.util.Scanner;

public class opdracht09 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hoeveel leerlingen zijn er?");
		int input = keyboard.nextInt();
		
		if (input % 10 == 0) {
			System.out.println("Aantal werkjes: " + input/10);			
		} else {
			if (input % 2 == 0 && input > 30 || input > 10) {
				System.out.println("Aantal werkjes: " + input/2);
			} else {
				System.out.println("Aantal werkjes: " + input);
			}		
		}
		
		
		keyboard.close();
	}

}
