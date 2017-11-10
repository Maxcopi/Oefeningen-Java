package be.pxl.h7.exoef5;

public class H7ExOef5 {

	public static void main(String[] args) {
		
		float[] gewogenGemiddeldes = new float[4];
		int gewogenTotaal;
		int vraagHoogstGemiddelde = -1;
		int vragenAntwoorden[][] = {
				{25,36,55,46,38},
				{35,45,54,65,1},
				{75,66,44,10,5},
				{23,33,45,50,49}
		};
		
		for(int rij = 0; rij < vragenAntwoorden.length; rij++) {
			gewogenTotaal = 0;
			for(int kolom = 0; kolom < vragenAntwoorden[rij].length; kolom++) {
				gewogenTotaal += vragenAntwoorden[rij][kolom] * (kolom + 1);
			}
			gewogenGemiddeldes[rij] = gewogenTotaal / (float)200;
		}
		
		
		for(int i = 0; i < gewogenGemiddeldes.length; i++) {
			System.out.printf("Het gewogen gemiddelde van vraag %d is %.2f\n",i+1,gewogenGemiddeldes[i]);
		}
		for(int i = 0; i < gewogenGemiddeldes.length; i++) {
			if(vraagHoogstGemiddelde == -1 || gewogenGemiddeldes[vraagHoogstGemiddelde] < gewogenGemiddeldes[i]) {
				vraagHoogstGemiddelde = i;
			}
		}
		System.out.printf("De vraag met het hoogst gewogen gemiddelde is vraag %d met %.2f",
				vraagHoogstGemiddelde + 1, gewogenGemiddeldes[vraagHoogstGemiddelde]);
		
	}

}
