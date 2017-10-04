package Opdracht04;

import java.util.Scanner;

public class opdracht04 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Wat is je favoriete kleur?");
		String input = keyboard.next();
		
		boolean testBlue = input.equals("Blauw");
		boolean testGreen = input.equals("Groen");
		
		if (testBlue == true || testGreen == true) {
			System.out.println("Dat is ook mijn favoriete kleur!");
		} else {
			System.out.println("Ook een mooie kleur, maar ik vind groen en blauw mooier");
		}
		
		keyboard.close();
	}

}
