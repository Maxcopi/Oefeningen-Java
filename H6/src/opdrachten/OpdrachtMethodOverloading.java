package opdrachten;

public class OpdrachtMethodOverloading {

	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		int c = 7;
		
		int som = berekenSom(a,b);
		System.out.println("De eerste som is " + som);
		
		int som2= berekenSom(a,b,c);
		System.out.println("De tweede som is " + som2);

	}
	
	public static int berekenSom(int a, int b) {
		int som = a + b;
		return som;
	}
	public static int berekenSom(int a, int b,int c) {
		int som = a + b + c;
		return som;
	}
	

}
