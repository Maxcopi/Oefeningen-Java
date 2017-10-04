package voorbeelden;

import java.util.Scanner;

public class Opdracht5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int getal, driedubbel;
		System.out.println("Geef een getal in > 100");
		getal = keyboard.nextInt();
		
		while(getal < 100) {
			driedubbel = getal * 3;
			System.out.println("Het driedubbele van " + getal + " is: " + driedubbel);
			System.out.println("Geef een getal in > 100");
			getal = keyboard.nextInt();
		}
		
		keyboard.close();
	}

}
