package demo;

import java.util.Scanner;

public class Fibonacchi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range: ");
		int range = sc.nextInt();
		int a = 0, b = 1, sum = 0;
		for (int i = 0; i < range; i++) {
			if (a <= range) {
				System.out.print(a + ", ");
				sum = a + b;
				a = b;
				b = sum;
			}
		}
		sc.close();
	}

}
