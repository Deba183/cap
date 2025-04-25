package oops;

public class Employee {
	int id;
	String name;
	double salary;
	String companyName;
	
	public Employee(int id) {
		this.id = id;
	}
	public Employee(int id, String name) {
		this(id);
		this.name = name;
	}
	

}
