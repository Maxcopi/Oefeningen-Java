package be.pxl.h6.exoef1;

import java.util.Random;
import java.util.Scanner;

public class H6ExOef1 {
	/*
	 * Schrijf een programma voor een hoger-lager spel. Er wordt een willekeurig
	 * geheel getal gegenereerd tussen 1 en 10 (grenzen inclusief) waarna de
	 * gebruiker dit mag trachten te raden. De computer geeft feedback: “hoger”,
	 * “lager” of “proficiat, getal geraden”. De speler mag slechts 4 keer raden!
	 * Het spel stopt als het getal geraden is, of als de 4 beurten om zijn.
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner keyboard = new Scanner(System.in);

		int getalGuess;
		int getalUser;
		boolean geraden = false;
		byte beurt = 0;

		getalGuess = rand.nextInt(11) + 1;

		System.out.println("We spelen raad het getal, de computer genereert een getal.\n"
				+ "Jij probeert het te raden met feedback");
		while (!geraden && beurt < 4) {
			System.out.println("Geef een getal in");
			getalUser = keyboard.nextInt();

			if (getalUser > getalGuess) {
				System.out.println("Lager");
			} else {
				if (getalUser < getalGuess) {
					System.out.println("Hoger");
				} else {
					geraden = true;
				}
			}
			beurt++;
		}
		if (geraden) {
			System.out.printf("Je hebt gewonnen met %d beurten!\n", beurt);
			System.out.printf("Het getal was %d", getalGuess);
		} else {
			System.out.printf("Helaas, je hebt het getal niet kunnen raden in %d beurten\n", beurt);
			System.out.printf("Het getal was %d", getalGuess);
		}
		keyboard.close();
	}

}
