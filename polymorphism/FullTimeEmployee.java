package polymorphism;

public class FullTimeEmployee extends Employee{
	private int bonus;
	public FullTimeEmployee(String name, double salary, int bonus) {
		super(name, salary);
		this.bonus = bonus;
	}
	public void employeeInfo() {
		super.employeeInfo();
		System.out.println("Bonus: "+bonus);
		
	}
	public void jobRole() {
		super.jobRole();
		System.out.println("JobRole is"+jobRole);
		
	}

}
