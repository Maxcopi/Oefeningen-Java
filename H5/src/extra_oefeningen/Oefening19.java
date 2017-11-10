package extra_oefeningen;

public class Oefening19 {
	/*
	 * Schrijf een programma om de waarde van de volgende som 13543223...7531+++++ te bepalen.
	 */
	public static void main(String[] args) {
		byte number = 1;
		byte exponent = 2;
		long som = 0;
		long uitkomst;
		
		while(number <= 23) {
			uitkomst = number;
			for(int i = 1; i < exponent; i++) {
				uitkomst *= number;
			}
			som += uitkomst;
			exponent++;
			number+=2;
		}
		System.out.println(som);
	}

}
