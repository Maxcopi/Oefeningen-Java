package extra_oefeningen;

public class Oefening18 {
	/*
	 * Leonardo van Pisa, ook wel Fibonacci genoemd, bestudeerde omstreeks 1200 
	 * de vermenigvuldiging van konijnen. Hij gebruikte daarvoor een getallenrij 
	 * waarin elke term gevormd wordt door de som van zijn twee directe 
	 * voorgangers te nemen. De eerste twee termen zijn 1. De rij ziet 
	 * er dus als volgt uit: 1 1 2 3 5 8 13 … De computer drukt de elementen van de rij af die kleiner zijn dan 1500.
	 */
	public static void main(String[] args) {
		float fibonacciLimiet = 1500;
		
		int fibonacci = 1;
		int last = 0;
		int previous = 0;
		
		while(fibonacci < fibonacciLimiet) {
			System.out.print(fibonacci + " ");
			last = previous;
			previous = fibonacci;
			fibonacci = last + previous;
			
			
		}

	}

}
