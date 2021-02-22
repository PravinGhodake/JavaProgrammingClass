package StarPattern;

public class NbyNPattern {

	public static void main(String[] args) {
		int num=7;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		noPrinting(num);

	}
	
	
	public static void noPrinting(int num) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print("1 ");
			}
			System.out.println();
		}
	}

}
