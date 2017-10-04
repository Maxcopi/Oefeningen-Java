package extra_oefeningen;

public class Oefening8 {

	public static void main(String[] args) {
		int getalA, getalB, getalC;
		
		getalA = 50;
		getalB = 74;
		getalC = 90;
		
		
		if(getalA > getalB) {
			if(getalA > getalC) {
				System.out.print(getalA + " ");
				if(getalB > getalC) {
					System.out.print(getalB + " " + getalC);
				} else {
					System.out.print(getalC + " " + getalB);
				}
			} else {
				System.out.print(getalC + " " + getalA + " " + getalB);
			}
		} else {
			if(getalB > getalC) {
				System.out.print(getalB + " ");
				if(getalA > getalC) {
					System.out.print(getalA + " " + getalC);
				} else {
					System.out.print(getalC + " " + getalA);
				}
			} else {
				System.out.print(getalC + " ");
				if(getalA > getalB) {
					System.out.print(getalA + " " + getalB);
				} else {
					System.out.print(getalB + " " + getalA);
				}
			}
		}

	}

}
