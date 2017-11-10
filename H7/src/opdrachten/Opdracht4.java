package opdrachten;

import java.util.Scanner;

public class Opdracht4 {

	public static void main(String[] args) {
		
		int [] aantalDagen = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] maanden = {"januari", "februari", "maart", "april",
				"mei","juni","juli","augustus","september","oktober",
				"november", "december"};
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een maandnr in");
		int maandnr = keyboard.nextInt();
		
		System.out.println("de maand " + maanden[maandnr - 1] + " heeft " + aantalDagen[maandnr - 1] + " dagen");
		
		keyboard.close();
		
	}

}
