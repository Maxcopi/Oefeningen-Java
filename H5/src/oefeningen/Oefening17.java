package oefeningen;

public class Oefening17 {
	/*
	 * Schrijf een programma dat de volgende vermenigvuldigingstabel afdrukt.
		1-20, 40-50
	 */
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = i; j <= i * 10; j += i) {
				System.out.print(j + "\t");
			}
			System.out.print("\n");
		}
		
	}

}
