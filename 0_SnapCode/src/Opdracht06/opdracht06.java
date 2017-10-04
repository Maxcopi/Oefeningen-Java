package Opdracht06;

import java.util.Scanner;

public class opdracht06 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geslacht?");
		String inputGender = keyboard.next();
		System.out.println("Leeftijd?");
		int inputAge = keyboard.nextInt();
		
		boolean testGender = inputGender.equals("Man");
		
		if (testGender == true && inputAge > 18) {
			System.out.println("GROEN!");
		} else {
			if (testGender == true && inputAge <= 18) {
				System.out.println("GEEL!");
			} else {
				if (testGender == false && inputAge > 18) {
					System.out.println("ROOD!");
				} else {
					if (testGender == false && inputAge <= 18) {
						System.out.println("BLAUW!");
					}
				}
			}
		}
		
		keyboard.close();
	}

}
