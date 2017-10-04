package oefeningen;

import java.util.Scanner;

public class oefening2 {
	
	/*
		Geef 2 getallen a en b in, trek het kleinste van het grootste af en vermenigvuldig het
		resultaat met 5. Druk het resultaat af zoals in volgend voorbeeld:
		Vb de waarde voor a is 5 en de waarde voor b is 8
		Afdruk 8 – 5 = 3
		3 x 5 = 15
		Vermijd 2 keer dezelfde code!
	 */
	public static void main(String[] args) {
		int a, b, result;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een getal in");
		a = keyboard.nextInt();
		System.out.println("Geef nog een getal in");
		b = keyboard.nextInt();
		
		if(a > b){
			result = (a - b) * 5;
		} else {
			result = (b - a) * 5;
		}
		System.out.println("Het resultaat is " + result);
		keyboard.close();
	}

}
