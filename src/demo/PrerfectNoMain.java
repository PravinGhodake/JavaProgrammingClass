package demo;

import java.util.Scanner;

public class PrerfectNoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumberProg N = new NumberProg();
		System.out.println("Enter the No :- ");
		boolean res = N.perfectNo(sc.nextInt());
		if (res) 
			System.err.println(" Number is Prefect");
		 else
			System.err.println(" Number is not Prefect");
		sc.close();
	}

}
