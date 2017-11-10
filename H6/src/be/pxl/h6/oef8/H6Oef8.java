package be.pxl.h6.oef8;

import java.awt.Point;

import com.sun.javafx.geom.Rectangle;

public class H6Oef8 {
/*
 * Maak gebruik van de voorgedefinieerde classes Point en Rectangle.
Maak een Rectangle-object rect aan met als linkerbovenhoek de xy-coördinaten (1, 2), als breedte 20 en hoogte 30.
Maak een Point-object punt aan met als xy-coördinaten (5, 5).
Ga na of het Point punt zich bevindt in Rectangle rect en druk een gepaste melding af.
Verplaats het Point punt met afstand +40 op de x-as en afstand +50 op de y-as.
Maak een tweede Rectangle rect 2, die direct bij creatie gepositioneerd wordt op Point punt.
Stel de breedte van rect 2 in op 100 en 110 voor de hoogte.
Druk de xy-coördinaten van rect2 af (zonder decimalen).
Ga na of de Rectangle rect zich volledig bevindt binnen Rectangle rect 2. Druk een melding af.
Maak rect 40 eenheden breder, en 80 eenheden hoger. Lees aandachtig de javadoc!
Ga na of de hoogten van rect en rect 2 gelijk zijn (dit zou zo moeten zijn!) en druk een melding af.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rect = new Rectangle(1,2,20,30);
		Point punt = new Point(5,5);
		
		if(rect.contains((int)punt.getX(), (int)punt.getY()));{
			System.out.printf("Het punt met coordinaten: %d-%d zit in de rechthoek\n", (int)punt.getX(), (int)punt.getY());
		}
		
		punt.move(40, 50);
		Rectangle rect2 = new Rectangle((int)punt.getX(),(int)punt.getY(),100,110);
		System.out.printf("De coordinaten van rect2 is x:%d y:%d\n", (int)rect2.x, (int)rect2.y);
		
		if(rect.contains((int)punt.getX(), (int)punt.getY()));{
			System.out.printf("Het punt zit in de rechthoek met coordinaten %d-%d\n", (int)punt.getX(), (int)punt.getY());
		}
		if(rect2.contains(rect)) {
			System.out.println("rect2 bevindt zich volledig binnen rect1");
		} else {
			System.out.println("rect2 bevindt zich NIET volledig binnen rect1");
		}
		rect.grow(40/2,80/2);
		if(rect2.height == rect.height) {
			System.out.println("De hoogte van de twee rechthoeken is gelijk");
		}
	}

}
