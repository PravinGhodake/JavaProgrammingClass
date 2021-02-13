package demo;

import java.util.Scanner;

public class DinkingAgeValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name = sc.next();
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		if (age >= 25) {
			System.out.println(name + " you can Drink!!");
		} else {
			System.out.println("Sorry, "+name + " you are not Eligible for Dinking Alcohol ");
		}
		sc.close();

	}

}
