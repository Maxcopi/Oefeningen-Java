package oefeningenIteraties;

import java.util.Scanner;

public class oefening1 {
	/*
	 * 10 getallen dienen ingelezen te worden. Druk het product van deze 10 getallen af.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		int getal, product;
		product = 0;
		
		for(int i=0; i < 10; i++) {
			System.out.println("Geef een getal in");
			getal = keyboard.nextInt();
			if(product > 0) {
				product = product * getal;
			} else {
				product = getal;
			}
		}
		System.out.println("Het product van uw getallen is: " + product);
		keyboard.close();
	}

}
