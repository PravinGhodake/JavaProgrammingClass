package ArrayObject;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee E = new Employee(101, "pravin");
		Employee E1 = new Employee(101, "prasad", 12000.35f);
		Employee E2 = new Employee(103, "priya");
		E.display();
		E1.display();
		E2.display();
	}

}
