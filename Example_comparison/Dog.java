package Example_comparison;

import java.util.Arrays;


public class Dog implements Comparable{
	String name;
	int age;
	String breed;
	

	public Dog(String name, int age, String breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	}
	
	public String toString() {
		return name+" "+age;
	}
	
	public static void main(String[] args) {
	
	}

	@Override
	public int compareTo(Object o) {
		Dog d = (Dog)o;
		
		return this.age-d.age;
	}

}
