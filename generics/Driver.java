package generics;

import java.util.ArrayList;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		Student<Person> student = new Student<Person>(new Person(10, "Rohit"));
		printDetails(student);
		
		List<Boolean> list = new ArrayList<Boolean>();
		list.add(true);
		list.add(false);
		list.add(true);
		list.add(true);
		
	}
	
	public static void printDetails(Student<? extends Person> student) {
		Person p = student.obj;
		//student.obj = new Person(10, "ram");
		System.out.println(p);
	}
	public static void print(List<? extends Number> list) {
		list.add(true);
		System.out.println(list.get(0));
	}

}
