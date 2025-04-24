package arrayList;


public class Employee implements Comparable<Employee>{
	 String name;
	 int id;
	 
	 Employee(String name, int id) {
			this.name = name;
			this.id = id;
		}
	 
	 @Override
	 public String toString() {
			return id+" "+name;
		}

	@Override
	public int compareTo(Employee o) {
		
		
		return id;
	}
		

}
