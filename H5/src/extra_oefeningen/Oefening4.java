package extra_oefeningen;

import java.util.Scanner;

public class Oefening4 {
	/*
	 * Schrijf een programma dat 3 getallen a, b en c inleest.
	 * Verplaats de waarde van a naar b, van b naar c en van c naar a.
	 * Druk daarna de waarden a, b en c af.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int getalA = 5, getalB = 6, getalC = 7;
		
		getalB = getalA;
		getalC = getalB;
		getalA = getalC;
		
		System.out.println(getalA + " " + getalB + " " + getalC);
		
		keyboard.close();
	}

}
