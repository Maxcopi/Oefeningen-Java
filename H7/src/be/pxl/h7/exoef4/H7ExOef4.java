package be.pxl.h7.exoef4;

import java.util.Scanner;

public class H7ExOef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int weerstand;
		
		char a, b, c;
		int waardeA=-1, waardeB=-1, waardeC=-1;
		
		char[] karakters = {'z', 'b', 'r', 'o', 'g', 'G',
				'B', 'V', 'L', 'W'};
		
		while(waardeA == -1) {
			System.out.println("Geef het karakter van de kleur van de eerste band");
			a = keyboard.next().charAt(0);
			waardeA = controleerWaarde(a, karakters);
		}
		while(waardeB == -1) {
			System.out.println("Geef het karakter van de kleur van de tweede band");
			b = keyboard.next().charAt(0);
			waardeB = controleerWaarde(b, karakters);
		}
		while(waardeC == -1) {
			System.out.println("Geef het karakter van de kleur van de derde band");
			c = keyboard.next().charAt(0);
			waardeC = controleerWaarde(c, karakters);
		}
		
		
		weerstand = berekenWeerstand(waardeA, waardeB, waardeC);
		
		System.out.println("De weerstand van het component bedraagt " + weerstand);
		
		keyboard.close();
	}
	
	public static int controleerWaarde(char karakter, char[] karakterTabel) {
		int waarde = -1;
		
		for(int i = 0; i < karakterTabel.length; i++) {
			if(karakterTabel[i]==karakter) {
				return i;
			}
		}
		System.out.println("Het ingegeven karakter is niet geldig");
		return -1;
	}
	
	public static int berekenWeerstand(int band1, int band2, int band3) {
		int weerstand;
		
		weerstand = (10 * band1 + band2) * berekenMacht(band3);
		
		return weerstand;
	}
	
	public static int berekenMacht(int band3) {
		int macht = 1;
		for(int i = 0; i < band3; i++) {
			macht= macht * 10;
		}
		return macht;
	}
}
