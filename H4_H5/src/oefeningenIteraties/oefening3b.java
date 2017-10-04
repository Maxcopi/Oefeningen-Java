package oefeningenIteraties;

import java.util.Scanner;

public class oefening3b {
	/*
	 * b)Idem als a maar de temperatuur wordt gedurende een bepaalde periode ingegeven. 
	 * De ingave eindigt met -1000.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int dagTemperatuur, somTemperatuur, gemiddeldeTemperatuur, teller;
		somTemperatuur = 0;
		teller = 0;
		
		while(true) {
			System.out.println("Geef de dagtemperatuur in");
			dagTemperatuur = keyboard.nextInt();
			if(dagTemperatuur == -1000) {
				break;
			}
			somTemperatuur += dagTemperatuur;
			teller += 1;
			
		}
		gemiddeldeTemperatuur = somTemperatuur / teller;
		
		System.out.println("De gemiddelde temperatuur bedraagt: " + gemiddeldeTemperatuur);
		
		keyboard.close();
	}

}
