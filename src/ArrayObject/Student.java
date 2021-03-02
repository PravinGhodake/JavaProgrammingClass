package ArrayObject;

public class Student {
      String name;
      int id;
      int [] sub =new int[5];
      
      Student(int id, String name){
    	  this.id=id;
    	  this.name=name;
      }
      
     int calSum(int []a){
    	 int sum=0;
    	  for(int i=0; i<a.length; i++) {
    		  sum=sub[i]+a[i];  
    	  }
    	  return 0;
      }
}
