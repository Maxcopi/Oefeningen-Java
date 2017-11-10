package opdrachten;

public class Opdracht3 {

	public static void main(String[] args) {
		
		int [][] tabel = new int[4][6];
		
		for(int rij=0; rij < tabel.length; rij++) {
			for(int kolom=0; kolom < tabel[rij].length; kolom++) {
				tabel[rij][kolom] = rij * kolom;
			}
		}
		
		for(int rij[] : tabel) {
			for(int element : rij) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}
	}

}
