package testingUtilspack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import junitpracticefirst.TestUtil;

public class TestClass {
	
	TestUtil utils;
	Scanner scan;
	
	@Before
	public void setup() {
		utils = new TestUtil();
		scan = new Scanner(System.in);
		//System.out.println("hello");
	}
	
	@After
	public void closeResource() {
		//System.out.println("hi");
		this.utils = null;
		
	}
	
	@Test
	
	public void CheckSorted() {
		List<Integer> input = Arrays.asList(5,4,8,6,1);
		List<Integer> expected = Arrays.asList(1,4,5,6,8);
		List<Integer> actual = utils.returnList(input);
		assertEquals(expected, actual);
	}
	
	@Test
	@Ignore
	public void checkSortedList() {
		List<Integer> actual = Arrays.asList(5,4,8,6,1);
		List<Integer> expected = Arrays.asList(5,4,8,6,1);
		assertEquals(expected, actual);
		
	}
	
	
	
	@Test
	@Ignore
	public void assertEqualsAddition() {
		System.out.println("Testing add method");
		System.out.println("Enter First number");
		int x = scan.nextInt();
		System.out.println("Enter second number");
		int y = scan.nextInt();;
		int result = utils.add(x, y);
		assertEquals(x+y,result);
		TestUtil utils = new TestUtil();
		//int result = utils.add(10,5);
		assertEquals(15,result);
		assertNotEquals(15, result);
		
	}
	
	//@Test
	@Ignore
	public void assertCheck() {
		//TestUtil utils = new TestUtil();
		List<Integer> data = Arrays.asList(1, 2, 3, 4);
		List list = utils.returnList(data);
		for(Object o : list) {
			//assertTrue(o instanceof Integer);
			Integer i = (Integer)o;
			assertTrue(i%2==0);
		}
	}
	
	@Test
	public void checkEqualArray() {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		assertEquals(arr1,arr2);
	}
	
	@Test
	public void checkException() {
		assertThrows(ArithmeticException.class,()->{
			utils.div(10,0);
		});
	}
	
	@Test
	public void checkNull() {
		assertNull(utils.returnString("Demo"));
	}
	
	@Test
	public void checkNotNull() {
		assertNotNull(utils.returnString("Hello"));
	}
	
	@Test
	public void checkSame() {
		List<Integer> input = Arrays.asList(5,8,3,4,2,9);
		List<Integer> output = utils.checkSameListAfterModifying(input);
		assertSame(output, input);
	}
	
	@Test
	public void checkNotSame() {
		List<Integer> input = Arrays.asList(5,8,3,4,2,9);
		List<Integer> output = new ArrayList(utils.checkSameListAfterModifying(input));
		assertNotSame(output, input);
	}
	
	@Test
	public void checkMatchersInList() {
		List<String> input = Arrays.asList("tom","jerry","spike");
		List<String> output = utils.checkMatchers(input);
		
		assertThat(output,hasItem("TOM"));
		assertThat(output,hasItems("TOM","JERRY","SPIKE"));
	}

	

}
