package be.pxl.h6.oef7;

import java.awt.Point;

public class H6Oef7 {

	public static void main(String[] args) {
		Point p1;
		Point p2;
		p1 = new Point(5,8);
		p2 = new Point((int)p1.getX(), (int)p1.getY());
		
		System.out.println("P2 nog niet bewogen:");
		controleerObjecten(p1,p2);
		
		p2.move(7,11);
		
		System.out.println("P2 bewogen:");
		controleerObjecten(p1,p2);
		
		if(p1.getLocation().equals(p2.getLocation())) {
			System.out.println("De punten liggen gelijk");
		}
		
		System.out.printf("De x en y voor p1 zijn: %.0f-%.0f\n", p1.getX(),p1.getY());
		System.out.printf("De x en y voor p1 zijn: %.0f-%.0f\n", p2.getX(),p2.getY());
		
		
	}
	public static void controleerObjecten(Point p1, Point p2) {
		if(p1==p2) {
			System.out.println("De objecten hebben dezelfde referentie");
		} else {
			System.out.println("De referentie is verschillend");
		}
		if(p1.equals(p2)) {
			System.out.println("De punten liggen gelijk");
		} else {
			System.out.println("De punten liggen niet gelijk");
		}
	}

}
