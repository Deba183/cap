package fileHandling;

import java.io.Serializable;

public class Employee implements Serializable{
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.name = name;
		
	}
	
	public String toString() {
		return id+" "+name+" "+salary;
	}

}
