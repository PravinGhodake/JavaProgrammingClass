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

}
