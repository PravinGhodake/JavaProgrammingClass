package stringPrograms;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class GetConstructor {

	public static void main(String[] args) {
		String S = new String("asd");
		System.out.println(S.getClass());
		Class var= S.getClass();
		System.out.println(var.getSuperclass());
		Constructor[] cons = var.getConstructors();
		for (Constructor constructor : cons) {
			System.out.println(constructor);
		}
		System.out.println("Total No of Constructors in String Class is: "+cons.length);
		System.out.println(var.isInterface());
		System.out.println(var.isArray());
		
		
	}
	

}
