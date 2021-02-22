package StarPattern.assignments;

import java.util.Scanner;

public class Assignment_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter No: ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (j < num) {
					System.out.print(i+" ");
				} else {
					System.out.print(i+1+" ");
				}
			}
			System.out.println();
		}
		sc.close();

	}

}
