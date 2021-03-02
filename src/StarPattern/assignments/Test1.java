package StarPattern.assignments;

public class Test1 {

	public static void main(String[] args) {
		
	for (int i = 3; i >0; i--) {
		int n=1;
		for (int j = 0; j<i; j++) {
			
			System.out.print(n);
			if(j<i-1)
			System.out.print("*");
			n++;
		}
		System.out.println();
	}
		

	}

}
