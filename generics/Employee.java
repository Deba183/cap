package generics;

public class Employee implements Comparable<Employee>{
	 String name;
	 int id;
	
	 Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	

	@Override
	public int compareTo(Employee o) {
		//Employee e = (Employee)o;
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
