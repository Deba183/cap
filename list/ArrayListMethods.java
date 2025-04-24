package list;
import java.util.ArrayList;
public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList<>();
		
		//add element
		a1.add(10);
		a1.add(20);
		a1.add(30);
		
		System.out.println(a1);
		
		
		//add all collection
		ArrayList list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(null);
		
		list.addAll(a1);
		list.add("hello");
		System.out.println(list);
		System.out.println(list.size());
		
		//add element at a specific location
		a1.add(0, 75);
		System.out.println(a1);
		
		
		ArrayList al2 = new ArrayList<>();
		al2.add("hello");
		al2.add("world");
		
		//add all of collection at a specific index
		a1.addAll(1, al2);
		System.out.println(a1);
		
		//adding collection into another collection using add(
		al2.add(a1);
		System.out.println(al2);
		System.out.println(al2.size());
		System.out.println(((ArrayList)al2.get(2)).get(1));
		
		//fetch element
		System.out.println(a1.get(2));
		System.out.println(a1.get(1));
		
		//clear all elements
		System.out.println(al2.size());
		al2.clear();
		System.out.println(al2.size());
		
		//remove element using remove(Object) and remove(index)
		ArrayList al3 = new ArrayList<>();
		al3.add(10);
		al3.add("hello");
		al3.add('c');
		al3.add(null);
		System.out.println(al3.remove(null));
		System.out.println(al3.remove("hello"));
		//System.out.println(al3.remove(10));//throws IndexOutOfBoundsException
	Integer x = 10;
	System.out.println(al3.remove(x));
	Character ch = 'a';
	System.out.println(al3.remove(ch));
	System.out.println(al3);
	
	//remove all
	ArrayList<Integer> al4 = new ArrayList<Integer>();
	al4.add(10);
	al4.add(20);
	al4.add(30);
	al4.add(40);
	
	ArrayList<Integer> al5 = new ArrayList<Integer>(al4);
	al5.add(10);
	al5.add(1);
	al5.add(2);
	
	System.out.println(al5);
	
	al5.removeAll(al4);
	System.out.println(al5);
	
	
	al5.add(10);
	al5.addAll(al4);
	System.out.println(al5);
	
	al5.retainAll(al4);
	System.out.println(al5);
	}

}
