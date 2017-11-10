package be.pxl.h6.oef9;

import java.util.Random;

import com.sun.javafx.geom.Rectangle;

public class H6Oef9 {
/*
 * Maak gebruik van de voorgedefinieerde class Rectangle.
Opm: er wordt overal met integers gewerkt, geen doubles!
Maak een programma om 20 rechthoeken te creëren. De nodige waarden
 worden willekeurig gegenereerd: x en y liggen tussen 0 en 100 
 (exclusief de bovengrens en inclusief de ondergrens), 
 de hoogte en breedte liggen tussen 1 en 70 (grenzen inclusief).
Ga vervolgens na of ze (elk afzonderlijk) in een rechthoek van 100 op 100 en coördinaten (0, 0) passen.
Van alle rechthoeken worden de gegevens afgedrukt (zie hieronder).
Als ze in de rechthoek passen, wordt extra gedrukt “geplaatst”.
Onderaan worden de volgnummers van de geplaatste rechthoeken nog eens afgedrukt. 
Maak hiervoor gebruik van een StringBuilder-object dat je telkens aanvult met een extra regel voor elke volgende rechthoek.
Helemaal onderaan worden de gegevens van de grootst gegenereerde 
rechthoek (= de rechthoek met de grootste oppervlakte) die geplaatst kon worden afgedrukt.
 */
	public static void main(String[] args) {
		Random getal = new Random();
		Rectangle rect = new Rectangle();
		Rectangle rectCompare = new Rectangle(0,0,100,100);
		Rectangle biggestRect = new Rectangle();
		StringBuilder tabel = new StringBuilder();
		StringBuilder toegevoegd = new StringBuilder();
		String greatest;
		int x,y,b,h;
		double oppCurrent;
		double oppGreatest=0;
		
		tabel.append("\tx\ty\tbreedte\thoogte\n");
		for(int i=0; i < 20; i++) {
			x = getal.nextInt(100);
			y = getal.nextInt(100);
			b = getal.nextInt(70)+1;
			h= getal.nextInt(70)+1;
			
			rect = new Rectangle(x,y,b,h);
			
			tabel.append("\t" + rect.x + "\t" + rect.y + "\t" + rect.width + "\t" + rect.height);
			if(rectCompare.contains(rect)) {
				tabel.append("\tgeplaatsd");
				toegevoegd.append("Rechthoek " + i + " is toegevoegd\n");
				oppCurrent=rect.x*rect.y;
				if(oppCurrent>oppGreatest) {
					biggestRect = new Rectangle(rect.x, rect.y,rect.width,rect.height);
				}
			}
			tabel.append("\n");
		}
		System.out.print(tabel);
		System.out.print(toegevoegd);
		greatest = biggestRect.toString();
		System.out.println(biggestRect.toString());
		System.out.println("De grootste geplaatste vierhoek: " + 
		greatest.substring(greatest.indexOf("[")+1, greatest.indexOf("]")));
	}

}
