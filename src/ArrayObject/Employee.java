package ArrayObject;

public class Employee {
	int id;
	String name;
	float sal = 20000f;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	Employee(int id, String name, float sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	void display() {
		System.out.println("Employee Id = " + id);
		System.out.println("Employee Name = " + name);
		System.out.println("Employee Sal = " + sal);
	}
}
