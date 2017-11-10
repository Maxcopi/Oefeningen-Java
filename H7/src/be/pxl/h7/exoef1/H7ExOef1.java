package be.pxl.h7.exoef1;

import java.util.Scanner;

public class H7ExOef1 {
/*
 * Geef via het toetsenbord een getal n in. Lees vervolgens n gehele getallen via het 
 * toetsenbord in en plaats deze getallen in een array a. Schrijf een programma 
 * om de elementen van de array a als volgt te verschuiven:
 *  a(0) krijgt de waarde van a(1), a(1) van a(2), …, a(n-1) van a(0) met a(n-1) het laatste element.
 *  Druk de oorspronkelijke array af en de array na verschuiving.
 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef het aantal getallen in.");
		int n = keyboard.nextInt();
		
		int getallen[] = new int[n];
		
		for(int i = 0; i < getallen.length; i++) {
			System.out.println("Geef een getal in: ");
			getallen[i] = keyboard.nextInt();
		}
		
		System.out.println("Array voor verschuiving:");
		for(int i = 0; i < getallen.length; i++) {
			System.out.print(getallen[i] + " ");
		}
		System.out.println();
		
		int eerste = getallen[0];
		
		for(int i = 0; i < getallen.length; i++) {
			if(i == getallen.length-1) {
				getallen[i] = eerste;
			} else {
				getallen[i] = getallen[i+1];
			}
			
		}
		
		System.out.println("Array na verschuiving:");
		for(int i = 0; i < getallen.length; i++) {
			System.out.print(getallen[i] + " ");
		}
		
		
		keyboard.close();
	}

}
