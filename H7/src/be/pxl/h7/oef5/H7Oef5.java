package be.pxl.h7.oef5;

import java.awt.Point;
import java.awt.Rectangle;


public class H7Oef5 {
/*
 * Gegeven 5 punten P0 (1,1), P1 (1,0), P2 (2,2), P3 (4,1) en P4 (0,2).
• Maak een array x aan met de x-coördinaten van deze punten en een array y met 
de y coördinaten van deze punten. Maak m.b.v. de array x en y een array punt van objecten uit van de klasse Point.
• Maak m.b.v. de array punt een array rect van objecten uit de klasse Rectangle.
 Zet de breedte van elke rechthoek op 1 en de hoogte op 3.
• Druk van elke rechthoek de kenmerken af.
• Verander de kenmerken van de laatste rechthoek in variabele x=0, variabele y=0, width =3 en height=2.
• Ga voor elke rechthoek na welk punten in de rechthoek liggen en druk dit af.
• Ga voor elke rechthoek na welke rechthoek de laatste rechthoek snijdt en druk deze rechthoeken af.
 */
	public static void main(String[] args) {
		Point p0 = new Point(1,1);
		Point p1 = new Point(1,0);
		Point p2 = new Point(2,2);
		Point p3 = new Point(4,1);
		Point p4 = new Point(0,2);
		Rectangle rect;
		Rectangle[] rectangles = new Rectangle[5];
		int[] xcoords = new int[] {(int)p0.getX(),(int)p1.getX(),(int)p2.getX(),(int)p3.getX(),(int)p4.getX()};
		int[] ycoords = new int[] {(int)p0.getY(),(int)p1.getY(),(int)p2.getY(),(int)p3.getY(),(int)p4.getY()};
		Point[] punten = new Point[xcoords.length];
		
		for(int i = 0; i < punten.length; i++) {
			punten[i] = new Point(xcoords[i], ycoords[i]);
		}
		
		for(int i = 0; i < xcoords.length; i++) {
			rectangles[i] = new Rectangle(xcoords[i],ycoords[i],1,3);
		}
		int teller = 1;
		for(Rectangle rectangle : rectangles) {
			String gegevens = rectangle.toString();
			System.out.println("Gegevens van rechthoek " + teller + ": "+ gegevens.substring(gegevens.indexOf("[")+1, gegevens.indexOf("]")));
			teller++;
		}
		
		rectangles[rectangles.length-1].setBounds(0,0,3,2);
	
		teller = 1;
		
		for(Rectangle rectangle : rectangles) {
			System.out.print("Rechthoek nummer " + teller + " bevat");
			int tellerPunten = 1; 
			for(Point punt : punten) {
				if(rectangle.contains((int)punt.getX(),(int)punt.getY())) {
					System.out.print(" punt " + tellerPunten);
				}
				tellerPunten++;
			}
			System.out.println();
			teller++;
		}
		System.out.print("Rechthoeken die rechthoek nr 5 snijden: ");
		teller = 1;
		for(Rectangle rectangle : rectangles) {
			if(teller != 5) {
				if(!rectangles[4].intersects(rectangle)) {
					System.out.print("rechthoek nr " + teller + " ");
				}
			}
			teller++;
		}
		
	}

}
