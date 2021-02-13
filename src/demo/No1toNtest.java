package demo;

import java.util.Scanner;

public class No1toNtest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		No1toN A=new No1toN();
		System.out.println("Please Enter No :- ");
		A.wprintNumber( sc.nextInt());
		sc.close();
	}

}
