package be.pxl.h7.oef3;

import java.util.Scanner;

public class H7Oef3 {
/*
 * Er worden via het toetsenbord 10 getallen ingelezen. Schrijf een programma dat de 
 * positieve getallen plaatst in een array “pos” en de strikt negatieve getallen 
 * plaatst in een array “neg”. Deze getallen worden op aaneensluitende plaatsen 
 * in de array “pos” en “neg” gezet. Bv. als je eerst 3 positieve getallen 
 * ingeeft en dan een negatief getal, dan moet dat negatief getal op 
 * positie 0 komen in array neg. Druk de twee arrays af en bepaal het 
 * kleinste getal van array neg. Hou er rekening mee dat de arrays pos en neg leeg kunnen zijn.
 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int userGetal;
		int[] pos = new int[10];
		int[] neg = new int[10];
		byte tellerNeg = 0;
		byte tellerPos = 0;
		int kleinsteNeg = 0;
		for(int i = 1; i < 11; i++) {
			System.out.println("Geef getal " + i +" in");
			userGetal = keyboard.nextInt();
			if(userGetal > 0) {
				pos[tellerPos]=userGetal;
				tellerPos++;
			} else {
				neg[tellerNeg]=userGetal;
				tellerNeg++;
			}
		}
		System.out.println("Getallen in positieve array:");
		for(int n : pos) {
			if(n != 0) {
				System.out.println(n);
			}
		}
		System.out.println("Getallen in negatieve array:");
		for(int n : neg) {
			if(n != 0) {
				System.out.println(n);
				if(n < kleinsteNeg) {
					kleinsteNeg = n;
				}
			}
		}
		System.out.println("Het kleinste negatieve getal is: " + kleinsteNeg);
		keyboard.close();
	}

}
