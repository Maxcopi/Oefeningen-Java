package opdrachten;

import java.util.Scanner;

public class OpdrachtForInMethod {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef het getal in");
		int getal = keyboard.nextInt();
		drukAf(getal);
		
		keyboard.close();
	}
	
	public static void drukAf(int getal) {
		for (int i = 0; i < getal; i++) {
			System.out.print(getal);
		}
		System.out.println();
	}
}
