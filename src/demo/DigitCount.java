package demo;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please Enter Digit: ");
		long digit = sc.nextLong();
		int count=0;
		while (digit > 0) {
			count++;
			digit = digit / 10;
		}
		System.out.println(count);
		sc.close();
	}

}
