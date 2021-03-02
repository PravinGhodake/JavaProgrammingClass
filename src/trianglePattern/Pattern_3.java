package trianglePattern;

import java.util.Scanner;

public class Pattern_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter No: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			char ch= 'a';
			for (int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
		sc.close();

	}

}
