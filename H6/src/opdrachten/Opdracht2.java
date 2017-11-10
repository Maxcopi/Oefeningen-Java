package opdrachten;

import java.util.Random;

public class Opdracht2 {

	public static void main(String[] args) {
		Random rand = new Random();
		/*
		System.out.println("20 random getallen van 0 tem. 10");
		for(int i = 0; i < 20; i++) {
			int getal = rand.nextInt(11); // 11 is er niet bij DUS 0-10
			System.out.println(getal);
		}
		*/
		
		System.out.println("10 getallen van 20 tot 30");
		for(int i = 0; i < 10; i++) {
			int getal = rand.nextInt(30-20+1)+20; //rand.nextInt(bovengrens - ondergrens (+1 als inclusief)) + ondergrens 
			System.out.println(getal);
		}
	}

}
