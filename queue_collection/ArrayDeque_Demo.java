package queue_collection;
import java.util.*;
public class ArrayDeque_Demo {
	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add('b');
		ad.add(10.98);
		ad.add("hi");
		//ad.add(null);
		System.out.println(ad);
	}
	

}
