package ArrayObject;

public class Product {
	int pid;
	String pname;
	int price;

	Product(int pid, String pname, int price) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	public void display() {
		System.out.print(" Product Id= " + pid);
		System.out.print(" Product Name= " + pname);
		System.out.println(" Product Price= " + price);
	}

}
