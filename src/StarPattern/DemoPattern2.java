package StarPattern;

public class DemoPattern2 {
	public static void main(String[] args) {
		demo1010(8);
	}



public static void demo1010(int num) {
	for (int i = 0; i < num; i++) {
		for (int j = 0; j <num; j++) {
			if(i%2==0)
				System.out.print(1 +" ");
			else
				System.out.print(0+" " );
		}
		System.out.println();
	}
}
}
