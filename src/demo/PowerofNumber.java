package demo;

import java.util.Scanner;

public class PowerofNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter No: ");
		int num = sc.nextInt();
		System.out.println("Please Enter Power: ");
		int power = sc.nextInt();
		int res=1;
		while(power>0) {
			 res=res*num;
			power--;
		}
		System.out.println(res);
sc.close();
	}

}
