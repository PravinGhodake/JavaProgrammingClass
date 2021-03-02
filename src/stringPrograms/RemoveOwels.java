package stringPrograms;

public class RemoveOwels {

	public static void main(String[] args) {
	String S = "I Love Jspiders";
	
	String res="";
	
	for (int i = 0; i < S.length(); i++) {
		char ch =S.charAt(i);
		if(ch=='a' || ch == 'e' || ch== 'i' || ch=='o' || ch=='u'|| ch=='A' || ch == 'E' || ch== 'I' || ch=='O' || ch=='U')
		continue;
		else {
			res=res+ch;
		}
			
	}
	System.out.println(res);

	}

}
