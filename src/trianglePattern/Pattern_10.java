package trianglePattern;

import java.util.Scanner;

public class Pattern_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter No: ");
		int n = sc.nextInt();
		int p = 1;
		for (int i = n; i >0; i--) {
			for (int j = 0; j < n- i; j++) {
				System.out.print("  ");
			}
			for(int k=1; k<2*i; k++){
				System.out.print(p+" ");
				p++;
			}
			System.out.println();
			p=1;
		}
		sc.close();

	}

}
