package extra_oefeningen;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int getal;
		getal = keyboard.nextInt();
		
		for(int i = 1; i <= getal; i++) {
			System.out.print("@");
		}

		keyboard.close();
	}

}
