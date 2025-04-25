package treeSet_characteristics;

import java.util.*;

public class EmployeeDriver {
	public static void main(String[] args) {
		TreeSet <Employee> set = new TreeSet();
		set.add(new Employee("Debanjana", 50000));
		set.add(new Employee("tom", 450000));
		set.add(new Employee("pika", 500));
		 for (Employee emp : set) {
	            System.out.println(emp);
	        }
	}

}
