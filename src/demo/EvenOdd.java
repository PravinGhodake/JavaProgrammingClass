package demo;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter No : ");
		int n = sc.nextInt();

		NumberProg np = new NumberProg();
		boolean res = np.evenOdd(n);

		if (res == true)
			System.out.println(n + " is even no");
		else
			System.out.println(n + " is odd no");
		sc.close();
	}

}
