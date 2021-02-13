package demo;

import java.util.Scanner;

public class MarriageValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter 1 for Male \n 2 for Female \n 3 for Others ");
		int gender =sc.nextInt();
		
		System.out.println("Enter Age : ");
		int age=sc.nextInt();
		
		if(gender==1) {
			if(age>21) {
				System.out.println(name+" your are Eligible for Marriage ");
			}else {
				System.out.println(name+" your are not Eligible for Marriage, wait till 21 ");
			}
		}
		if(gender==2) {
			if(age>18) {
				System.out.println(name+" your are Eligible for Marriage ");
			}else {
				System.out.println(name+" your are not Eligible for Marriage, wait till 18 ");
			}
		}
		if(gender==3) {

				System.out.println(name+" Hiiii..... ");
			
		}
		sc.close();
	}

}
