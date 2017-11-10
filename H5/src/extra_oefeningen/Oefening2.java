package extra_oefeningen;

import java.util.Scanner;

public class Oefening2 {
	/*
	 * U geeft via het toetsenbord het aantal graden Fahrenheit in en de computer 
	 * berekent het aantal graden Celsius. Dit aantal wordt ook afgedrukt.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		float tempCelsius, tempFahrenheit;
		
		System.out.println("Geef de temperatuur in Celsius");
		tempFahrenheit = keyboard.nextFloat();
		
		tempCelsius =  (tempFahrenheit - 32) * 5/9;
		
		System.out.println(tempCelsius);
		
		keyboard.close();
	}

}
