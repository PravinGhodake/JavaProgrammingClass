package StarPattern.assignments;

import java.util.Scanner;

public class Assignment_5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter No: ");
		int num = sc.nextInt();
		char c = 'A';
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print(c++ + (" "));
				if (c == 'Z' + 1) {
					c = 'A';
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
