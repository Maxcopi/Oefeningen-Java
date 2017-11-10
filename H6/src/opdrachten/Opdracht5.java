package opdrachten;

public class Opdracht5 {

	public static void main(String[] args) {
		System.out.printf("%10s %10s\n", "m", "voet");
	     for(float meter = 1; meter <=20; meter+=0.5) {
	    	 float voet = meter * 3.2808399f;
	    	 System.out.printf("%10.2f %10.2f\n", meter, voet);
	     }

	}

}
