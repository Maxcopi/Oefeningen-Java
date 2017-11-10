package extra_oefeningen;

import java.util.Scanner;

public class Oefening15 {
	/*
	 * Schrijf een programma voor het berekenen en het afdrukken van willekeurige tafels van vermenigvuldiging.
	 * Ingave: geef de vermenigvuldiger en max. waarde vermenigvuldigtal in. 
	 * Bijvoorbeeld: vermenigvuldiger = 4, max. waarde vermenigvuldigtal = 2 => af te drukken 
	 * de tekst: Oefening 1 0×4 = 1×4 = 2×4 = Zo moeten er 5 oefeningen afgedrukt worden. 
	 * Hiervoor dient telkens de vermenigvuldiger en de max. waarde 
	 * vermenigvuldigtal ingegeven te worden. Bij de 2de oefening dient uiteraard de tekst “Oefening 2” afgedrukt te worden.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int vermenigvuldiger, vermenigvuldigtal;
		
		for(byte oefening = 1; oefening <= 5; oefening++) {
			System.out.println("Oefening " + oefening);
			
			System.out.println("Geef de vermenigvuldiger in");
			vermenigvuldiger = keyboard.nextInt();
			System.out.println("Geef het maximum vermenigvuldigtal in");
			vermenigvuldigtal = keyboard.nextInt();
			
			for(int i = 0; i <= vermenigvuldigtal; i++) {
				System.out.println(""+i+"x"+vermenigvuldiger+"="+(i*vermenigvuldiger));
			}
				
			
		}
		
		
		
		
		keyboard.close();
	}

}
