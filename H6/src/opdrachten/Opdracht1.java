package opdrachten;

import java.util.Scanner;

public class Opdracht1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een getal in");
		int getal = keyboard.nextInt();
		
		toonTafel(getal);
		
		keyboard.close();
	}
	
	public static void toonTafel(int getal) {
		for(int i=1; i<=10;i++) {
			System.out.println(i + " * " + getal + " = " + (i*getal));
		}
	}
}
