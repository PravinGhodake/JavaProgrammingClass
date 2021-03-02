package stringPrograms;

import java.lang.reflect.Method;

public class GetClass {

	public static void main(String[] args) {
	  String str = new String("ABC");
	  System.out.println(str.getClass());
	  Class val= str.getClass();
	 Method []  methods= val.getMethods();
for(Method names: methods) {
	System.out.println(names);
	System.out.println(names.getName());
}

RemoveSpecialChar R = new RemoveSpecialChar();
Class var1=R.getClass();
Method[] methods1 = var1.getMethods();
for (Method method : methods1) {
	System.out.println(method.getName()); 

	}


}
}
