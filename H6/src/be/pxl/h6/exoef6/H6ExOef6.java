package be.pxl.h6.exoef6;

import java.util.Scanner;

public class H6ExOef6 {
/*
 * Schrijf een methode om een productcode te controleren. 1ste positie l, L, r of R (L van
links, R van rechts), gevolgd door 5 tekens, gevolgd door bo of on (bo boven, on onder). De
methode geeft een boolean terug.
Test je methode uit door een productcode via het toetsenbord in te geven. Je programma
moet een productcode blijven vragen totdat er een juiste productcode wordt ingegeven.
Zorg ervoor dat als er een foutieve code wordt ingegeven dat er een gepaste mededeling
wordt afgedrukt. Bvb de productiecode bevat niet het juist aantal tekens, de
productiecode begint niet met l, L, r of R ….
 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		boolean codeGeldig = false;
		String code;
		
		while(!codeGeldig) {
			System.out.println("Geef een code in");
			code = keyboard.nextLine();
			codeGeldig = controleerCode(code);
		}
		System.out.println("De ingevoerde code was juist");
		keyboard.close();
	}
	
	public static boolean controleerCode(String code) {
		if(code.charAt(0)=='l' || code.charAt(0)=='L' || code.charAt(0)=='r' || code.charAt(0)=='R') {
			if(code.length()==8) {
				if(code.substring(6, 8).equals("bo") || code.substring(6, 8).equals("on")) {
					return true;
				} else {
					System.out.println("De code eindigt niet met bo of on");
					return false;
				}
			} else {
				System.out.println("De code bevat niet het juiste aantal tekens");
				return false;
			}
				
		} else {
			System.out.println("De code begint niet met l, L, r of R");
			return false;
		}
		
	}
}
