package be.pxl.h6.oef5;

public class H6Oef5 {

	public static void main(String[] args) {
		
		double vorige = 0;
		double kolomTotaal = 0;
		double kolomTotaalExtra = 0;
		System.out.printf("%20s %-20s %20s %20s", "1. gewoon", "2. links", "3. rechts (met nul)", "4. rechts met 3 dec\n\n");
		for(double kolom = 1; kolom <= 9; kolom++) {
			kolomTotaal = kolom + vorige * 10;
			
			if(kolom >= 5) {
				kolomTotaalExtra = kolomTotaal;
				int vermenigvuldiger = 10;
				for(double i = 6; i <= kolom; i++) {
					kolomTotaalExtra += (i / vermenigvuldiger);
					vermenigvuldiger *= 10;
				}
				
			} else {
				kolomTotaalExtra = kolomTotaal;
			}
			String kolom3 = String.format("%020f", kolomTotaalExtra);
			
			System.out.printf("%20f %-20f %s %20.3f \n", kolomTotaalExtra, kolomTotaalExtra, kolom3, kolomTotaalExtra);
			
			vorige = kolomTotaal;
		}

	}

}
