package StarPattern;

import java.util.Scanner;

public class Diagonal_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter No: ");
		int num=sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <num; j++) {
				if(j+i==num-1 || i==j)
					System.out.print(1 +" ");
				else
					System.out.print(0+" " );
			}
			System.out.println();
		}
sc.close();

	}

}
