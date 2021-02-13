package demo;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Plese Enter The Number :");
		int num = sc.nextInt();
		if (num >= 0 && num % 2 == 0) {
			System.out.println(num+" is Even");
		}else if(num<0) {
			System.out.println(num+" is Negative");
		}else {
			System.out.println(num+" is Odd");
		}
		sc.close();
	}

}
