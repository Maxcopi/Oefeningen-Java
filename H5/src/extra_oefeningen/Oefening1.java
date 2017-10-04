package extra_oefeningen;

import java.util.Scanner;

public class Oefening1 {
	/*
	 * U geeft via het toetsenbord het aantal graden Celsius in. 
	 * De computer berekent het aantal graden Fahrenheit. 
	 * Dit aantal wordt op het scherm afgedrukt. De formule hiertoe luidt: F = (9 / 5) C + 32.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		float tempCelsius, tempFahrenheit;
		
		System.out.println("Geef de temperatuur in Celsius");
		tempCelsius = keyboard.nextFloat();
		
		tempFahrenheit =  (9 / 5f) * tempCelsius + 32;
		
		System.out.println(tempFahrenheit);
		
		keyboard.close();
	}

}
