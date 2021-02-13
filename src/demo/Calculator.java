package demo;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter First No");
		int num1 = sc.nextInt();
		System.out.println("Please Enter Second No");
		int num2 = sc.nextInt();

		System.out.println(
				" Enter 1 For Addition\n Enter 2 For Subtraction \n Enter 3 For Multiplication \n Enter 4 For Division ");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			add(num1, num2);
			break;
		case 2:
			sub(num1, num2);
			break;
		case 3:
			mul(num1, num2);
			break;
		case 4:
			div(num1, num2);
			break;
		}
		sc.close();
	}

	public static void add(int i, int j) {
		System.out.println("Addition Of Two No is" + (i + j));
	}

	public static void sub(int i, int j) {
		System.out.println("Substraction Of Two No is" + (i - j));
	}

	public static void mul(int i, int j) {
		System.out.println("Multiplication Of Two No is" + (i * j));
	}

	public static void div(float i, int j) {
		System.out.println("Division Of Two No is" + (i / j));
	}

}
