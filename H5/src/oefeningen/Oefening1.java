package oefeningen;

import java.util.Scanner;

public class Oefening1 {
	//Zet een via het toetsenbord ingegeven bedrag in BEF om in euro (1 euro = 40.3399 bef).
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int BEF;
		float euro;
		
		System.out.println("Geef het aantal BEFs in");
		BEF = keyboard.nextInt();
		
		euro = BEF * 40.3399f;
		
		System.out.println(BEF + " BEF = €" + euro);
		
		keyboard.close();
	}

}
