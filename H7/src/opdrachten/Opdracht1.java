package opdrachten;

public class Opdracht1 {

	public static void main(String[] args) {
		//veelvouden van 7
		int[] veelvoud = new int[20];
		for(int i = 0; i < veelvoud.length; i++) {
			veelvoud[i] = 7 * i;
		}
		for(int n : veelvoud) {
			System.out.println(n);
		}
		//array van booleans
		boolean[] arrayBoolean = new boolean[6];
		arrayBoolean[2]= true;
		
		for(boolean b : arrayBoolean) {
			System.out.println(b);
		}
		System.out.println(arrayBoolean); // geheugenAdres!!
		
		//1.array eerst apart declareren, aanmaken en vervolgens vullen.
		
		int[] array = new int[10];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = 1 + i * 2;
		}
		for(int n : array) {
			System.out.println(n);
		}
		//2.tabel aanmaken en tegelijk initialiseren
		int[] array2 = {1,3,5,7,9,11,13,15,17,19};
		
		for(int i = array.length - 1; i >= 0; i--) {
			System.out.println(array2[i]);
		}
	}

}
