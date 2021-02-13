package demo;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter No : ");
		int n = sc.nextInt();
		NumberProg np = new NumberProg();
		int reverse = np.revNo(n);
		System.out.println(reverse);

		sc.close();
	}

}
