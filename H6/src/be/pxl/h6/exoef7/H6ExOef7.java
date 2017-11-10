package be.pxl.h6.exoef7;

import java.util.Formatter;
import java.util.Scanner;

public class H6ExOef7 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String code, nm, nv;
		float im, iv;
		byte ak, teller = 1;
		StringBuilder tabel = new StringBuilder();
		Formatter fmt = new Formatter(tabel);
		fmt.format("%-15s%-40s%-15s%-10s\n", "aanvraagnr", "familie naam", "prioriteit", "bouwlening stad");
		String familienaam, prioriteit, goedkopereLening;
		System.out.println("Geef de code van de koper");
		code = keyboard.next();

		while(!(code.equals("STOP") || code.equals("stop"))) {
			
			System.out.println("Geef de naam van de man");
			nm = keyboard.next();
			System.out.println("Geef de naam van de vrouw");
			nv = keyboard.next();
			System.out.println("Geef het inkomen van de man");
			im = keyboard.nextFloat();
			System.out.println("Geef het inkomen van de vrouw");
			iv = keyboard.nextFloat();
			System.out.println("Geef het aantal kinderen");
			ak = keyboard.nextByte();
			
			familienaam = genereerAfdrukNamen(nv, nm);
			
			prioriteit = berekenPrioriteit(iv, im, ak, code);
			
			goedkopereLening = controleerGoedkopereLening(iv, im, ak, code);
			
			fmt.format("%-15s%-40s%-15s%-10s\n", teller + ".", familienaam, prioriteit, goedkopereLening);
			
			System.out.println("Geef de code van de koper");
			code = keyboard.next();
			teller++;
		}
		System.out.println(tabel);
		
		keyboard.close();
	}
	public static String genereerAfdrukNamen(String naamVrouw, String naamMan) {
		StringBuilder afdruk = new StringBuilder();
		if(!(naamVrouw.equals("xx") && naamMan.equals("xx"))) {
			afdruk.append("De Heer en Mevrouw ");
			afdruk.append(naamMan.charAt(naamMan.indexOf("_")+1) + ". ");
			afdruk.append(naamMan.substring(0, naamMan.indexOf("_"))+ "-");
			afdruk.append(naamVrouw.substring(0, naamVrouw.indexOf("_")));
		} else {
			if(naamVrouw.equals("xx")) {
				afdruk.append("Mevrouw ");
				afdruk.append(naamVrouw.charAt(naamVrouw.indexOf("_")+1));
				afdruk.append(naamVrouw.substring(0, naamVrouw.indexOf("_")));
			} else {
				afdruk.append("Meneer ");
				afdruk.append(naamMan.charAt(naamMan.indexOf("_")+1));
				afdruk.append(naamMan.substring(0, naamMan.indexOf("_")));
			}
		}
		
		
		return afdruk.toString();
	}
	public static String berekenPrioriteit(float inkomenVrouw, float inkomenMan, byte aantalKinderen, String code) {
		float gezinsinkomen = inkomenMan + inkomenVrouw;
		if(!code.equals("N")) {
			if((Integer.valueOf(code.substring(1,5)) > (2017 - 5))){
				return "*****";
			}
		}
		if(gezinsinkomen < 2000) {
			if(aantalKinderen >= 3) {
				return "*";
			} else {
				return "**";
			}
		} else {
			if(gezinsinkomen < 2500) {
				return "***";
			} else {
				return "****";
			}
		}
		
	}
	public static String controleerGoedkopereLening(float inkomenMan, float inkomenVrouw, byte aantalKinderen, String code) {
		float inkomen = inkomenMan + inkomenVrouw;
		String goedkoper = "";
		if(code == "N") {
			if(inkomenMan == 0 || inkomenVrouw == 0) {
				if(aantalKinderen >= 1) {
					goedkoper = "J";
				} else {
					if(inkomen < 1500) {
						goedkoper = "J";
					}
				}
			}
		}
		
		return goedkoper;
	}
}
