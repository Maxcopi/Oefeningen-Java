package be.pxl.h7.exoef6;

public class H7ExOef6 {

	public static void main(String[] args) {
		String[][] titelAuteur = {
				{"De Chninkel", "Vanhamme"},
				{"Kuifje in Tibet", "Herge"},
				{"Maus", "Spiegelmann"},
				{"Kuifje en de blauwe lotus", "Herge"},
				{"Largo Winch: de erfgenamen", "Vanhamme"}
		};
		
		int[][] stemmenKlas = {
				{105,35,5},
				{66,21,12},
				{44,36,56},
				{56,12,12},
				{29,10,9}
		};
		
		int totaalStemmen, hoogst = 0, hoogstPos = 0;
		
		for(int i = 0; i < stemmenKlas.length; i++) {
			totaalStemmen = 0;
			for(int j = 0; j < stemmenKlas[i].length; j++) {
				totaalStemmen += stemmenKlas[i][j];
				if(hoogst < totaalStemmen) {
					hoogstPos = i;
					hoogst = totaalStemmen;
				}
			}
			System.out.printf("Titel: %-30s\tAuteur: %-10s\tTotaal behaalde stemmen: %10d\n", 
					titelAuteur[i][0], titelAuteur[i][1], totaalStemmen);
		}
		
		
		String hoogsteStemmen = "de strip met het hoogst aantal stemmen is " + titelAuteur[hoogstPos][0].toUpperCase() 
				+ " van auteur " + titelAuteur[hoogstPos][1].toUpperCase();
		
		System.out.println(hoogsteStemmen);
	}

}
