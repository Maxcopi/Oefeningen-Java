package oefeningenSelecties;

import java.util.Scanner;

public class oefening5 {
	/*
	 * Prijsberekening vakantie
		Invoer: aantal sterren: 1 - 5
			code: 1 (enkel ontbijt), 2 (half-pension), 3 (vol pension), 4 (all-inclusive)
			aantal overnachtingen
			seizoen: 10 (hoogseizoen), 20 (laagseizoen), 30 (tussenseizoen)
		De prijs voor het verblijf wordt als volgt berekend:
			- voor een 1-sterrenhotel betaal je per nacht 30 euro
			- voor een 2-3-sterrenhotel betaal je per nacht 40 euro
			- voor een 4-5-sterrenhotel betaal je per nacht 55 euro
		De prijs voor de maaltijden wordt als volgt berekend:
			- voor enkel ontbijt betaal je 20% van de overnachtingkost
			- voor half-pension betaal je 50% van de overnachtingkost
			- voor vol-pension betaal je 60% van de overnachtingkost
		LET OP: voor All-inclusive betaal je steeds (ongeacht het aantal sterren) een vaste prijs van 80 euro per overnachting (maaltijden uiteraard inbegrepen)
		Er wordt een extra korting van 10% op de totaalprijs toegekend tijdens het laagseizoen voor de codes 1 en 2.
		Geef de nodige gegevens in en druk de prijs van een vakantie voor 1 persoon af.

	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int aantalSterren, aantalOvernachtingen, seizoen, code, prijsVerblijf;
		double prijsMaaltijden, totaalPrijs;
		
		System.out.println("Geef het aantal sterren in");
		aantalSterren = keyboard.nextInt();
		System.out.println("Geef de code in");
		code = keyboard.nextInt();
		System.out.println("Geef het aantal overnachtingen op");
		aantalOvernachtingen = keyboard.nextInt();
		System.out.println("Geef het seizoen in");
		seizoen = keyboard.nextInt();
		prijsMaaltijden = 0;
		
		
		if(aantalSterren > 3) {
			prijsVerblijf = aantalOvernachtingen * 55;
		} else {
			if(aantalSterren > 1) {
				prijsVerblijf = aantalOvernachtingen * 40;
			} else {
				prijsVerblijf = aantalOvernachtingen * 30;
			}
		}
		switch(code) {
        case 1:  prijsMaaltijden = 0.20 * prijsVerblijf;
                 break;
        case 2:  prijsMaaltijden = 0.50 * prijsVerblijf;
                 break;
        case 3:  prijsMaaltijden = 0.60 * prijsVerblijf;
                 break;
        case 4:  prijsMaaltijden = 0;
        		 prijsVerblijf = 80;
        		 break;
		}
		
		if((code == 1 || code == 2) && (seizoen == 20)) {
			totaalPrijs = 0.90 * (prijsVerblijf + prijsMaaltijden);
		} else {
			totaalPrijs = prijsVerblijf + prijsMaaltijden;
		}
		
		System.out.println("De prijs voor 1 persoon bedraagt: €" + totaalPrijs);
		
		keyboard.close();
	}

}
