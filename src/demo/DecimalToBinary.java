package demo;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please Enter Decimal: ");
		int decimal = sc.nextInt();
		String binary = "";
		while (decimal > 0) {
			int rem = decimal % 2;
			binary = rem + binary;
			decimal /= 2;
		}
		System.out.println("Binary value is: " + binary);
		sc.close();
	}

}
