package StarPattern.assignments;

import java.util.Scanner;

public class NoTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter No: ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			int count = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
		sc.close();

	}

}
