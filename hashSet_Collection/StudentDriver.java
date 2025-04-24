package hashSet_Collection;

import java.util.*;

public class StudentDriver {
	public static void main(String[] args) {
		HashSet <Student> hss = new HashSet<Student>();
		hss.add(new Student(1, "Harry"));
		hss.add(new Student(5, "Debanjana"));
		hss.add(new Student(5, "Debanjana"));
		hss.add(new Student(2, "Hedwig"));
		hss.add(new Student(3, "Fang"));
		System.out.println(hss);
	}

}
