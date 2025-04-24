package map_collection;
import java.util.*;

import hashMap.Entry;
public class TreeMap_Demo {
	public static void main(String[] args) {
//		TreeMap tm = new TreeMap((o1, o2)->(Integer)o2-(Integer)o1);//lambda expression to sort the TreeMap in desc order
//		tm.put(1, "hello");
//		tm.put(9, 89);
//		tm.put(3, 'd');
//		
//		System.out.println(tm);
		
//		System.out.println(tm.containsKey(3));
//		System.out.println(tm.containsKey(10));
//		System.out.println(tm.containsValue(null));
//		System.out.println(tm.containsValue("hello"));
//		
//		System.out.println(tm.replace(2, 90));
//		System.out.println(tm.replace(9, 90, 100));
//		System.out.println(tm);
//		
//		System.out.println(tm.ceilingKey(10));
//		
//		System.out.println("--------------------------------");
//		
//		
//		Set<Integer> set = tm.keySet();
//		Iterator<Integer> itr1 = set.iterator();
//		while(itr1.hasNext()) {
//			System.out.println(itr1.next());
//	}
//		System.out.println("----------------------");
//		
//		Collection<String> c = tm.values();
//		Iterator<String> itr2 = c.iterator();
//		while(itr2.hasNext()) {
//			System.out.println(itr2.next());
//		}
//		
//		System.out.println("----------------------");
//		
//		Set s = tm.entrySet();
//		Iterator itr3 = s.iterator();
//		while(itr3.hasNext()) {
//			System.out.println(itr3.next());
//		}
//		System.out.println();
//		
//		for(Entry e : s) {
//			System.out.println(e.getKey()+"------>"+e.getValue());
//		}
		
//		for(Object o : s) {
//			System.out.println(o);
//		}

		
		TreeMap<String, List<String>> map = new TreeMap();
		
		List<String> l1 = Arrays.asList("Hyd", "Bang", "Kol");
		List<String> l2 = Arrays.asList("J&K", "Assam", "Bhi");
		List<String> l3 = Arrays.asList("Mizo", "Roorkee", "Hubli");
		
		map.put("SBI", l1);
		map.put("ICICI", l2);
		map.put("Federal", l3);
		
		System.out.println(map);
	}

}
