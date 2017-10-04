package opdrachten;

public class Opdracht4 {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		short res;
		
		res = (short)(a * b);
		
		System.out.println("product " + res);
		
		res = (short)(a / b);
		
		System.out.println("quotient " + res);
		
		res = (short)(a % b);
		
		System.out.println("mod " + res);
		
		float kommaResultaat;
		kommaResultaat = (float)a / b;
		
		System.out.println(kommaResultaat);
		
		char teken = 'a';
		teken = (char)(teken + 1); // a -> b
		
		
		System.out.println(teken);
	}

}
