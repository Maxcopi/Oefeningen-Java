package be.pxl.h6.exoef5;

import java.util.Scanner;

public class H6ExOef5 {
/*
 * Schrijf een methode om in een zin elke klinker te 
 * vervangen door een teken. Test je methode uit door een zin 
 * en een teken in te geven via het toetsenbord.
 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		StringBuilder aangepast = new StringBuilder();
		
		System.out.println("Geef een zin in");
		String zin = keyboard.nextLine();
		
		for(int pos = 0; pos <= zin.length()-1;pos++) {
			if(zin.charAt(pos)== 'a' || zin.charAt(pos)== 'e' || zin.charAt(pos)== 'u' || zin.charAt(pos)== 'o') {
				aangepast.append('$');
			} else {
				aangepast.append(zin.charAt(pos));
			}
		}
		
		System.out.println(aangepast);
		
		keyboard.close();
	}

}
