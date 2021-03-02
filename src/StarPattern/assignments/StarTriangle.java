package StarPattern.assignments;

import java.util.Scanner;

public class StarTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter No: ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
		sc.close();

	}

}
