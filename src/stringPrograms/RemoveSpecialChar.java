package stringPrograms;

public class RemoveSpecialChar {

	public static void main(String[] args) {
	

	}
	
	public static boolean isSpcial(char ch) {
		if(ch>='A' && ch<='Z') 
			return false;
		else if(ch>='a' && ch<='z')
			return false;
		else if(ch>='0' && ch<='9')
			return false;
		else return true;
			
	}

}
