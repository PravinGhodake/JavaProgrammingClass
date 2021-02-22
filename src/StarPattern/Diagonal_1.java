package StarPattern;

import java.util.Scanner;

public class Diagonal_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <num; j++) {
				if(i==j)
					System.out.print(1 +" ");
				else
					System.out.print(0+" " );
			}
			System.out.println();
		}
sc.close();
	}

}
