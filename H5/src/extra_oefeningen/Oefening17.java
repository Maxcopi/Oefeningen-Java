package extra_oefeningen;

import java.util.Scanner;

public class Oefening17 {
	/*
	 * U geeft via het toetsenbord een rentepercentage in. Bereken het aantal 
	 * jaren dat nodig is opdat het beginkapitaal zou verdubbeld 
	 * zijn als het wordt uitgezet met samengestelde intrest aan het opgegeven rentepercentage.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		float rentepercentage, kapitaal, beginkapitaal;
		short aantalJaren;
		
		beginkapitaal = 100;
		kapitaal = beginkapitaal;
		aantalJaren = 0;
		
		System.out.println("Geef het rentepercentage op");
		rentepercentage = keyboard.nextFloat();
		
		while(kapitaal < (beginkapitaal * 2)) {
			kapitaal = kapitaal * ((rentepercentage/100) + 1);
			aantalJaren++;
		}
		System.out.println("Het beginkapitaal met rente " + rentepercentage + " wordt verdubbeld na " + aantalJaren + " jaar");
		
		keyboard.close();
	}

}
