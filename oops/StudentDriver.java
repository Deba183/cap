package oops;

public class StudentDriver {
	public static void main(String[] args) {
		Student s1 = new Student();
//		s1.name = "Raj";
//		s1.collegeName = "UEM";
//		s1.id = 1;
//		s1.marks = 89.67;
		
		System.out.println(s1.collegeName+" "+s1.name+" "+s1.id);
		
		Student s2 = new Student(1, "Raj");
		System.out.println(s2.collegeName+" "+s2.name+" "+s2.id);
		//new Student();
//		s1.study();
//		
//		Student s2 = new Student();
//		s2.name = "Abhi";
//		s2.collegeName = "IEM";
//		s2.id = 2;
//		s2.marks = 98.67;
//		System.out.println(s2.collegeName+" "+s2.id+" "+s2.marks+" "+s2.name);
//		s2.study();
		
		//new Employee();
	}

}
