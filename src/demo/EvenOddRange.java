package demo;

public class EvenOddRange {
	
	 void evenOrOdd(int n) {
		int even=0;
		int odd=0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " = Even");
				even+=i;
			} else {
				System.out.println(i + " = Odd");
				odd+=i;
			}
		}System.out.println("Sum of Even No = "+even+" Sum of Odd No = "+odd);
	}
}
