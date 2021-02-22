package demo;



import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please Enter Binary: ");
		int binary = sc.nextInt();
		int sum = 0;
		int count = 0;
		while (binary > 0) {
			int r = binary % 10;
			sum = sum + r * power(count);
			count++;
			binary /= 10;
		}
		System.out.println("Decimal Value is: " + sum);
		sc.close();
	}

	public static int power(int power) {
		int res = 1;
		while (power > 0) {
			res = res * 2;
			power--;
		}
		return res;
	}

}
