package demo;

public class NumberProg {
	 
	public boolean evenOdd(int n) {
		if(n%2==0)
			return true;
		else
			return false;
	}
	public int revNo(int num){
		/* assume input no is 423 
		first will take reminder of given no 
		 */
		
		int rev=0;
		while(num>0) {
			int rem=num%10; //it will give us reminder i.e. 3
			rev=rev*10+rem;
			num=num/10;
			
		}
		return rev;
	}
	public boolean perfectNo(int num){
		int sum=0;
		for(int i=1;i<num ; i++) {
			
			if(num % i==0) {
				sum+=i;
			}
		}
			if(num==sum)
				return true;
			
			else 
				return false;
		
	}
	public void perfectNoRange(int range){
		int sum;
		for(int i=1;i<=range ; i++) {
			sum=0;
			for(int j=1; j<i; j++) {
			
			if(i % j ==0) {
				sum+=j;
			}
			
		}if(i==sum)
			System.out.println(i+" is perfect no");
//		else 
//			System.out.println(i+"is not perfect no");
//			
		
	}
	}

}
