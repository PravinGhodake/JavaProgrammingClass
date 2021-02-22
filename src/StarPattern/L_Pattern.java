package StarPattern;

import java.util.Scanner;

public class L_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter No: ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (j==0 || i==num-1 || j==num-1)
					System.out.print("1");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
