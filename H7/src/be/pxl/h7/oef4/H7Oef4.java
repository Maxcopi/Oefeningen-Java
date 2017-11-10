package be.pxl.h7.oef4;

import java.util.Scanner;

public class H7Oef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String[] namen = new String[4];
		int[] stemmen = new int[4];
		String naam = "";
		int code, aantalStemmen = 0;
		
		for(int i = 0; i < namen.length; i++) {
			System.out.println("Geef de naam van student " + (i+1));
			namen[i] = keyboard.nextLine();
		}
		
		System.out.println("Geef de code van de student waarop u stemt");
		code = keyboard.nextInt();
		
		while(code != 0) {
			stemmen[code -1] += 1;
			aantalStemmen++;
			System.out.println("Geef de code van de student waarop u stemt");
			code = keyboard.nextInt();
		}
		
		
		for(int i=0; i < namen.length; i++) {
			System.out.printf("code %d: %s - aantal stemmen: %d - procentueel aandeel: %.1f\n"
					, i+1,namen[i], stemmen[i], stemmen[i]/(float)aantalStemmen * 100);
			
		}
		
		keyboard.close();
	}

}
