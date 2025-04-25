package junitpracticefirst;

import java.util.Collections;
import java.util.List;

public class TestUtil {
	
	
	public int add(int x, int y) {
		return x+y;
	}
	public List<Integer> sortList(List<Integer> list) {
		return list.stream().sorted().toList();
		//return list;
	}
	
	public List returnList(List list) {
		return list;
	}
	
	public int div(int x, int y) {
		if(y!=0) {
			return x/y;
		}
		throw new ArithmeticException("The denominator is zero");
	}
	
	public String returnString(String s) {
		if(s.startsWith("H"))
			return s;
		else
			return null;
	}
	
	public List<Integer> checkSameListAfterModifying(List<Integer> list){
		Collections.sort(list);
		return list;
	}
	
	public List<String> checkMatchers(List<String> list){
		return list.stream().map(String::toUpperCase).toList();
	}

}
