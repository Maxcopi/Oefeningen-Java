package extra_oefeningen;

import java.util.Scanner;

public class Oefening11 {
	/*
	 * We wensen een tabel af te drukken voor de omzetting van Celsiusgraden in Fahrenheitgraden.
	 *  Van -40 tot 100 graden Celsius wordt per 10 graden 
	 *  het overeenkomstig aantal Fahrenheitgraden berekend. 
	 *  Formule: F = (9/5) C+32 De omzettingstabel ziet er als volgt uit:
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		short fahrenheit;
		
		System.out.println("Graden Celsius\tGraden Fahrenheit");
		for(int celsius = -40; celsius <= 140; celsius += 10) {
			fahrenheit = (short)((9/5f) * celsius + 32);
			System.out.println("\t" + celsius + "\t\t" + fahrenheit);
		}
		
		keyboard.close();
	}

}
