package Opdracht01;

import java.util.Scanner;

public class opdracht01 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Breedte: ");
		int breedte = keyboard.nextInt();
		System.out.println("Lengte: ");
		int lengte = keyboard.nextInt();
		
		int result = (breedte * lengte) * 8;
		
		System.out.println("Prijs bedraagt €" + result);
		
		keyboard.close();
	}

}
