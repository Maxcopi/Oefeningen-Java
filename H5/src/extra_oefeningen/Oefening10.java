package extra_oefeningen;

import java.util.Scanner;

public class Oefening10 {
	/*
	 * Ga na of een ingevoerd jaar een schrikkeljaar is of niet. 
	 * Een jaar is een schrikkeljaar als het deelbaar is door 4; 
	 * maar als het jaartal deelbaar is door 100 is het geen schrikkeljaar, 
	 * tenzij het deelbaar is door 400 
	 * (Bv.: het jaar 2000 is een schrikkeljaar, want deelbaar door 400; 
	 * het jaar 1900 is geen schrikkeljaar, want deelbaar door 100 en niet door 400).
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int jaar;
		
		System.out.println("Geef het jaar in");
		jaar = keyboard.nextInt();
		
		if((jaar % 4 == 0) && !(jaar % 100 == 0) || (jaar % 400 == 0)) {
			System.out.println("Het ingegeven jaar is een schrikkeljaar");
		} else {
			System.out.println("Het ingegeven jaar is GEEN schrikkeljaar");
		}
		
		keyboard.close();
	}

}
