package arrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
public class EmployeeDriver {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList();
		employees.add(new Employee("rohit", 1));
		employees.add(new Employee("rohan", 3));
		employees.add(new Employee("fang", 2));
		
		//fetching element using for each loop
		for(Employee e : employees) {
			System.out.println(e);
		}
		
		//System.out.println(employees);
		
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(50);
		a1.add(30);
		a1.add(20);
		a1.add(90);
		
//		for(int i : a1) {
//			if(i==30) {
//				Integer x = i;
//				a1.remove(x);
//				break;
//			}
//			
//		}
		
		//Iterator
		Iterator<Integer> itr = a1.iterator();
		while(itr.hasNext()) {
			int x = itr.next();
			if(x==30) {
				itr.remove();
			}
		}
		
//		
//		Iterator<Employee> iterator = employees.iterator();
//		while(iterator.hasNext()) {
//			Employee e = iterator.next();
//			if(e.name=="fang") {
//				iterator.remove();
//			}
//		}
//		System.out.println(employees);
		
		System.out.println("------------");
		
		//ListIterator
		ListIterator list = a1.listIterator();
		//traversing in forward direction
		while(list.hasNext()) {
			System.out.println("Index: "+list.nextIndex()+"   "+"Element: "+list.next());
		}
		
		//resetting the cursor back to the first position
		while(list.hasPrevious()) {
			list.previous();
		}
		
		System.out.println("------------");
		
		while(list.hasNext()) {
			int index = list.nextIndex();
			if(index == 1) {
			
				list.add(60);
			}
			int element = (Integer)list.next();
			
			if(element == 50) {
				list.set(100);
			}
			
		}
		System.out.println(a1);
		
		ArrayList<Integer> a2 = new ArrayList();
		a2.add(15);
		a2.add(2);
		a2.add(78);
		a2.add(18);
		Collections.sort(a2);
		System.out.println(a2);
		System.out.println("--------------------");
		
		Collections.sort(employees);
		System.out.println(employees);
		
		
		CompareByName comparatorObject = new CompareByName();
		Collections.sort(employees, comparatorObject);
		System.out.println(employees);
	}

}
