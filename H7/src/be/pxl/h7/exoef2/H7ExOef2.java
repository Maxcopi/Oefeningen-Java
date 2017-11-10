package be.pxl.h7.exoef2;

import java.util.Scanner;

public class H7ExOef2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		
		String klascode;
		int aantalStudenten, controle;
		float voorschot;
		
		System.out.println("Geef het aantal studenten in");
		aantalStudenten = keyboard.nextInt();
		
		int[] studentenNummers = new int[aantalStudenten];
		
		System.out.println("Geef het studentennummer in");
		controle = keyboard.nextInt();
		while(controle != 0) {
			while(controle > studentenNummers.length || controle < 1) {
				System.out.println("Geef een correct studentennummer in");
				controle = keyboard.nextInt();
			}
			studentenNummers[controle-1] = controle;
		}
		
		keyboard.close();
	}

}
