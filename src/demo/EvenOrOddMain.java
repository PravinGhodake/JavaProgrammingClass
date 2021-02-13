package demo;

import java.util.Scanner;

public class EvenOrOddMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		NumberProg np = new NumberProg();
		System.out.println(" Please Enter Range : ");
		int n= sc.nextInt();
		int even=0;
		int odd=0;
		for (int i = 1; i <= n; i++) {
			
			boolean res = np.evenOdd(i);
			if (res) {
				System.out.println(i + " = Even");
				even+=i;
			} else {
				System.out.println(i + " = Odd");
				odd+=i;
			}
		}
		System.out.println("Sum of Even No = "+even+" Sum of Odd No = "+odd);
		sc.close();
		}
		


}
