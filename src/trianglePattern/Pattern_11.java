package trianglePattern;

import java.util.Scanner;

public class Pattern_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter No: ");
		int n = sc.nextInt();
		
		for (int i = n; i >0; i--) {
			for (int j = 0; j < n- i; j++) {
				System.out.print("  ");
			}
			for(int k=1; k<2*i; k++){
				System.out.print("* ");
				
			}
			System.out.println();
			
		}
		sc.close();

	}

}
