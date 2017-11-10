package extra_oefeningen;

import java.util.Scanner;

public class Oefening22 {
	/*
	 * Maak een programma om een raster te tekenen.
	 * Het tekenen van het raster gebeurt in een methode met als invoerparameters:
	 * het hoeksymbool (in dit voorbeeld + )
	 * het symbool voor de horizontale lijnen (in dit voorbeeld - )
	 * het symbool voor de verticale lijnen (in dit voorbeeld | )
	 * opmerking: Elke horizontale lijn bevat 51 karakters.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int xRasters;
		int yRasters;
		
		System.out.println("Geef het aantal kolommen");
		xRasters = keyboard.nextInt();
		System.out.println("Geef het aantal rijen");
		yRasters = keyboard.nextInt();
		
		for(int y = 0; y < yRasters; y++) {
			tekenHorizontaleStrepen(xRasters);
			tekenVerticaleStrepen(xRasters);
			System.out.println();
		}
		tekenHorizontaleStrepen(xRasters);
		
		keyboard.close();
	}
	
	public static void tekenHorizontaleStrepen(int xRasters){
		for(int i = 1; i <= xRasters; i++) {
			System.out.print("+");
			for(int strepen=0; strepen < 9; strepen++) {
				System.out.print("-");
			}
			if(i==xRasters) {
				System.out.print("+");
			}
		}
	}
	public static void tekenVerticaleStrepen(int xRasters) {
		for(int i = 0; i<4; i++) {
			System.out.println();
			for(int vertStreep = 0; vertStreep <= xRasters; vertStreep++) {
				System.out.print("|");
				for(int spaties = 0; spaties < 9; spaties++) {
					System.out.print(" ");
				}
			}
		}
	}
}
