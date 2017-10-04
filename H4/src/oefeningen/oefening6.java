package oefeningen;

import java.util.Scanner;

public class oefening6 {
	/*
		Geef een getal in via het toetsenbord vb 7.
		Maak een vermenigvuldigingstabel als volgt:
		1 x 7 = 7
		2 x 7 = 14
		…
		20 x 7 = 140
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int userGetal;
		System.out.println("Geef een getal in");
		userGetal = keyboard.nextInt();
		
		for(int i=0; i<=20; i++) {
			int product = userGetal * i;
			System.out.println(i +" x " + userGetal + " = " + product);
		}
		keyboard.close();
	}

}
