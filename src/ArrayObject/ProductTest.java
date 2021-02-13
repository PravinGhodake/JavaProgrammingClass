package ArrayObject;


public class ProductTest {
	public static void main(String[] args) {
		

		Product[] Prd = new Product[10];
		Prd[0] = new Product(101, "Laptop", 50000);
		Prd[1] = new Product(102, "Mobile", 100000);
		Prd[2] = new Product(103, "Earphone", 500);
		Prd[3] = new Product(104, "Watch", 3000);
		Prd[4] = new Product(105, "Shoes", 1200);
		Prd[5] = new Product(106, "Sandle", 800);
		Prd[6] = new Product(107, "Flip Flops", 500);
		Prd[7] = new Product(108, "Wallet", 400);
		Prd[8] = new Product(109, "Bike", 100000);
		Prd[9] = new Product(110, "car", 500000);
		Prd[0].display();
		Prd[1].display();
		Prd[2].display();
		Prd[3].display();
		Prd[4].display();
		Prd[5].display();
		Prd[6].display();
		Prd[7].display();
		Prd[8].display();
		Prd[9].display();
	}

}
