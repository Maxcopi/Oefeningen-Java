package oefeningenSequenties;

import java.util.Scanner;

public class oefening4 {
	/*
	 * Wim volgt het eerste jaar Toegepaste informatica.  
	 * Hij heeft slechts een zeer beperkt programma, 
	 * nl 2 opleidingsonderdelen: ‘programmeren java’ (7 studiepunten, er is een 
	 * deelexamen dat voor 40% van de punten telt en een eindexamen dat voor 60% telt)
	 *  en netwerkbesturingssystemen (3 studiepunten, een opdracht telt voor 70% van 
	 *  de punten en het examen telt voor de overige 30%).
	 *  Voer via het toetsenbord de 4 resultaten in, telkens op 20 punten.  
	 *  Druk het totaalresultaat per opleidingsonderdeel af (op 20) en het totaal behaald percentage 
	 *  (hierbij dien je rekening te houden met het aantal studiepunten).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		double resultaatJava1, resultaatJava2, resultaatNetwerkOS1, resultaatNetwerkOS2, totaalJava, totaalNetwerkOS;
		
		System.out.println("Geef de punten van het deelexamen van java op 20");
		resultaatJava1 = keyboard.nextDouble();
		System.out.println("Geef de punten van het eindexamen van java op 20");
		resultaatJava2 = keyboard.nextDouble();
		System.out.println("Geef de punten van de opdracht van NetwerkOS op 20");
		resultaatNetwerkOS1 = keyboard.nextDouble();
		System.out.println("Geef de examen van netwerkOS op 20");
		resultaatNetwerkOS2 = keyboard.nextDouble();
		
		totaalJava = (resultaatJava1 * 0.40) + (resultaatJava2 * 0.60);
		totaalNetwerkOS = (resultaatNetwerkOS1 * 0.70) + (resultaatNetwerkOS2 * 0.30);
		
		System.out.println("Wim behaalde " + totaalJava + "/20 of " + ((totaalJava / 20) * 100) + "%");
		System.out.println("Wim behaalde " + totaalNetwerkOS + "/20 of " + ((totaalNetwerkOS / 20) * 100) + "%");
		
		keyboard.close();
	}

}
