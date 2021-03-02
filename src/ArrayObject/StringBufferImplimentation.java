package ArrayObject;

public class StringBufferImplimentation {
	private char []ch =new char[16];
	StringBufferImplimentation(char [] ch){
		this.ch=ch;
	}
	public int length() {
		return ch.length;
	}
	

	public static void main(String[] args) {
		
		StringBufferImplimentation s= new StringBufferImplimentation(new char[]{'a','b','c','d'});
             System.out.println(s.length());
	}

}
