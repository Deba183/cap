package lambda_expression;

import java.util.*;


public class Employee_Driver {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(104, "Debanjana");
		Employee e2 = new Employee(102, "Harry");
		Employee e3 = new Employee(101, "Fang");
		Employee e4 = new Employee(103, "Hedwig");
		Employee e5 = new Employee(105, "Crookshanks");
		
		List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5);
		
		//lambda expression
		Comparator<Employee> c = (o1, o2) -> o1.id-o2.id;
		
		Collections.sort(list, c);
		
		System.out.println(list);
		
		

	}

}
