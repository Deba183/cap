package polymorphism;

public class PartTimeEmployee extends Employee{
	private int workingHours;
	piblic PartTimeEmployee(String name, double salary, int workingHours) {
		super(name, salary);
		this.workingHours = workingHours;
	}
	public void employeeInfo() {
		super(name, salary);
		System.out.println("Jobrole of PartTimeEmployee is cloud Engineer");
	}
	public void jobRole() {
		System.out.println("Jobrole of PartTimeEmployee is cloud Engineer");
	}
	public void designation() {
		System.out.println("Designation of PartTimeEmployee is Assistant");
	}


}
