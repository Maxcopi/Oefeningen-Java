package be.pxl.h6.exoef4;

public class H6ExOef4 {
/*
 * Maak een leeg StringBuilder-object aan.
Vul dit teken per teken op met de letters van het alfabet (kleine letters).
Druk de inhoud af.
Zorg er vervolgens voor dat telkens de tweede letter in een hoofdletter omgezet wordt,
aBcDeF….yZ.
Druk de inhoud op nieuw af.
Vervang de letter ‘H’ door een ‘X’. Probeer dit in 1 commando te doen.
 */
	public static void main(String[] args) {
		StringBuilder alfabet = new StringBuilder();
		String letterPos;
		for(char letter = 'a'; letter <= 'z'; letter++) {
			alfabet.append(letter);
		}
		System.out.println(alfabet);
		for(int pos = 1; pos <= alfabet.length(); pos+=2) {
			letterPos = alfabet.substring(pos, pos + 1).toUpperCase();
			alfabet.replace(pos, pos+1, letterPos);
		}
		System.out.println(alfabet);
		
	}

}
