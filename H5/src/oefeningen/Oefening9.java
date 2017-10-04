package oefeningen;

import java.util.Scanner;

public class Oefening9 {
	/*
	 * Via het toetsenbord worden 2 gehele getallen a en b en een bewerkingscode c ingegeven. 
	 * De bewerkingscode biedt de volgende mogelijkheden: code 1: optelling (a+b) code 2: aftrekking
	 *  (a-b) code 3: vermenigvuldiging (a×b) code 4: kwadraat van a (a×a)
	 *  code 5: kwadraat van b (b×b) Men wenst voor de ingevoerde getallen a en b, 
	 *  de via de code opgegeven bewerking uit te voeren, en het resultaat samen 
	 *  met de ingevoerde getallen af te drukken. Indien een code ingevoerd wordt die 
	 *  niet beantwoordt aan één van bovenvermelde bewerkingscodes, 
	 *  moet volgende boodschap “Foutieve code” afgedrukt worden.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int getalA, getalB, resultaat;
		char CodeC;
		resultaat = 0;
		
		System.out.println("Geef getal a in");
		getalA = keyboard.nextInt();
		System.out.println("Geef getal b in");
		getalB = keyboard.nextInt();
		System.out.println("Geef de code in");
		CodeC = keyboard.next().charAt(0);
		

		if(CodeC == '1') {
			resultaat = getalA + getalB;
		} else {
			if(CodeC == '2') {
				resultaat = getalA - getalB;
			} else {
				if(CodeC == '3') {
					resultaat = getalA * getalB;
				} else {
					if(CodeC == '4') {
						resultaat = getalA * getalA;
					} if(CodeC == '5') {
						resultaat = getalB * getalB;
					} else {
						System.out.println("Foutieve code");
					}
				}
			}
		}
		
		
		System.out.println("Het resultaat van " + getalA + " met " + getalB + " met code " + CodeC + " is " + resultaat);
		
		
		keyboard.close();

	}

}
