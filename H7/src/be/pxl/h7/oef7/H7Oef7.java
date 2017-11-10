package be.pxl.h7.oef7;

public class H7Oef7 {
/*
 * Initialiseer een array met volgende voorraadgegevens van T-shirts:
Een T-shirt moet bijbesteld worden als er aan volgende voorwaarde is voldaan: 
het aantal T-shirts van de betrokken maat en kleur mag niet minder bedragen dan 1/3 v
an het totaal aantal T-shirts van die maat. Maak een lijst van de T-shirts met vermelding 
van kleur en maat, die bijbesteld moeten worden.
 */
	public static void main(String[] args) {
		
		int somSmall = 0, somMedium = 0, somLarge = 0;
		
		int [][] tShirts = new int [][]{
			{45,102,19,55,0},
			{79,47,58,22,46},
			{109,33,112,0,0}
		};
		String tekort = "Te kort: ";
		
		for(int i = 0; i < tShirts.length; i++) {
			for(int j = 0; j < tShirts[i].length; j++) {
				if(i == 0) {
					somSmall += tShirts[i][j];
				} else {
					if(i == 1) {
						somMedium += tShirts[i][j];
					}
					else {
						somLarge += tShirts[i][j];
					}
				}
			}
		}
		for(int i = 0; i < tShirts.length; i++) {
			for(int j = 0; j < tShirts[i].length; j++) {
				if(i == 0) {
					tekort += controleerTeKort(i,j, tShirts[i][j],somSmall);
				} else {
					if(i == 1) {
						tekort += controleerTeKort(i,j, tShirts[i][j],somMedium);
					} else {
						tekort += controleerTeKort(i,j, tShirts[i][j],somLarge);
					}
				}
				
			}
			tekort+="\n";
		}
		System.out.println(tekort);
	}
	public static String controleerTeKort(int grootte, int kleur, int waarde, int som) {
		String tekort = "";
		if(waarde < ((float)1/3)*som) {
			switch(grootte) {
			case 0: tekort="small";
				break;
			case 1: tekort="medium";
				break;
			case 2: tekort="large";
				break;
			}
			switch(kleur) {
				case 0: tekort+=" rood, ";
					break;
				case 1: tekort+=" wit, ";
					break;
				case 2: tekort+=" blauw, ";
					break;
				case 3: tekort+=" oranje, ";
					break;
				case 4: tekort+=" zwart, ";
					break;
			}
		}
		return tekort;
	}

}
