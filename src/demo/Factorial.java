package demo;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a Number To Find factorial: ");
		int n = sc.nextInt();
		long fact;
		for(int a=0; a<=n; a++) {
			fact=1;
		if(a%2==1) {
		for(int i =1; i<=a; i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of Given No is: "+a+" is "+fact);
		}

sc.close();
	}
	}

}

/*fibonacchi series till no
range
till value*/