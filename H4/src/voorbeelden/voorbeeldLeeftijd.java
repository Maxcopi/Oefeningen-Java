package voorbeelden;

import java.util.Scanner;

public class voorbeeldLeeftijd {

	/**
	 * CTRL + SHIFT + F om code te formatten
	 */
	public static void main(String[] args) {
		int age;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef de leeftijd in");
		age = keyboard.nextInt();

		if (age >= 18) {
			System.out.println("volwassene");
		} else {
			if (age >= 12) {
				System.out.println("middelbare school");
			} else {
				if (age >= 6) {
					System.out.println("lagere school");
				} else {
					System.out.println("kleuters/peuters/babies");
				}
			}
		}
		keyboard.close();
	}

}
