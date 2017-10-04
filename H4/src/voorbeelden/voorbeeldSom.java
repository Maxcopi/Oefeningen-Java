package voorbeelden;

import java.util.Scanner;

public class voorbeeldSom {

	public static void main(String[] args) {
		int getal1, getal2, som;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een getal in");
		getal1 = keyboard.nextInt();
		
		System.out.println("Geef nog een getal in");
		getal2 = keyboard.nextInt();
		
		som = getal1 + getal2;
		
		System.out.println("De som van uw getallen is " + som);
		
		keyboard.close();
	}

}
