package treeSet_characteristics;

public class Employee implements Comparable<Employee>{
	String name;
	double salary;

	Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return salary+" "+name;
	}
//	@Override
//	public int compareTo(Employee o) {
//		//asc of salary
//		return Double.compare(this.salary, o.salary);
//		// For descending order, use:
//		// return Double.compare(other.salary, this.salary);
//	}
	
	//des order of name when salaries differ
	@Override
    public int compareTo(Employee other) {
        if (this.salary != other.salary) {
            // Salaries are different: compare names in descending order
            return other.name.compareTo(this.name);
        } else {
            // Salaries are equal: break tie using salary descending (optional)
            return Double.compare(other.salary, this.salary);
        }
	}



}
