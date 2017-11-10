package extra_oefeningen;

import java.util.Scanner;

public class Oefening16 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		byte lengte, breedte;
		
		System.out.println("Geef de lengte van de vierhoek");
		lengte = keyboard.nextByte();
		System.out.println("Geef de breedte van de vierhoek");
		breedte = keyboard.nextByte();
		
		
		
		for(int i = 0; i < breedte; i++) {
			for(int j = 0; j < lengte; j++){;
				if((i == 0)||(i == breedte -1)) {
				System.out.print("*");
				} else {
					if((j==0)||(j == lengte -1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			
			System.out.print("\n");
		}
		
		keyboard.close();
	}

}
