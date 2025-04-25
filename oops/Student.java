package oops;

public class Student {
	int id;
	String name;
	String collegeName;
	double marks;
	
	public Student() {
		System.out.println("this is a no arg constructure.");
	}
	public Student(int id) {
		this.id = id;
		System.out.println("one arg constructure.");
	}
	public Student (int id, String name) {
		this(id);
		this.name = name;
		System.out.println("two arg constructure.");
	}
	public Student(int id,String name,String collegeName) {
		this(id, name);
		this.collegeName = collegeName;
		System.out.println("three arg constructure.");
		
	}
//	public Student(int id,String name,String collegeName,double marks) {
//		this.id = id;
//		this.name = name;
//		this.collegeName = collegeName;
//		this.marks = marks;
//	}
	
	public void study() {
		System.out.println(name+" is studying");
	}
	

}
