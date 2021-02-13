package demo;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter No : ");
		int n = sc.nextInt();
		NumberProg np = new NumberProg();
		int reverse = np.revNo(n);
		if(n==reverse) {
			System.out.println("Number is a Palindome");	
		}else
		System.out.println("Number is Not a Palindome");

		sc.close();

	}

}
