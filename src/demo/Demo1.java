package demo;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String name = sc.next();
		System.out.println("Enter your Age: ");
		int age = sc.nextInt();
		System.out.println("Enter your City: ");
		String city = sc.next();
		
		System.out.println("Name is: " + name);
		System.out.println(name + " Age is" + age);
		System.out.println("City is " + city);
		sc.close();
	}
}
