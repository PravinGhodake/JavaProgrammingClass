package demo;

import java.util.Scanner;

public class StrongNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter No ");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;

		while (n > 0) {
			int r = n % 10;
			sum = sum + fact(r);
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("No is strong Number ");
		} else
			System.out.println("No is not a strong Number ");
		sc.close();
	}

	public static int fact(int n) {
		int fact = 1;
		while (n > 0) {
			fact = fact * n;
			n--;
		}
		return fact;
	}

}
