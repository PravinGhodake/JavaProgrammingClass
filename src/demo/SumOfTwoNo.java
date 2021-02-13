package demo;

import java.util.Scanner;

public class SumOfTwoNo {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please Enter First No");
	int num1=sc.nextInt();
	System.out.println("Please Enter Second No");
	int num2=sc.nextInt();
	
	System.out.println("Addition Of Two No is"+(num1+num2));
	sc.close();
	}

}
