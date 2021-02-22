package demo;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println(" Please Enter Decimal: ");
System.out.println("Octal Value is: "+octal(sc.nextInt()));
sc.close();
	}
	public static String octal(int decimal) {
		int rem=0;
		String octal="";
		while(decimal>0) {
			rem=decimal%8;
			octal=rem+octal;
	decimal/=8;
		}
		return octal;
	}

}
