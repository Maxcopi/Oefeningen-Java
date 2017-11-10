package opdrachten;

import java.util.Scanner;

public class Opdracht1b {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef het inkomen");
		double bruto = keyboard.nextDouble();
		
		double belastingen = berekenBelastingen(bruto);
		
		System.out.println("Te betalen belastingen: " + belastingen);
		keyboard.close();
	}
	
	public static double berekenBelastingen(double brutoLoon) {
		double belastingen;
		
		if(brutoLoon <= 25000) {
			belastingen = brutoLoon / 100 * 38.4;
		} else {
			if(brutoLoon <= 55000) {
				belastingen = 25000 / 100 * 38.4;
				belastingen+=(belastingen - 25000) * 50 / 100;
			} else {
				belastingen=25000 / 100 * 38.4;
				belastingen+=30000 * 50.0 / 100;
				belastingen+=(belastingen-55000) * 60 / 100;
			}
		}
		return belastingen;
	}
}
