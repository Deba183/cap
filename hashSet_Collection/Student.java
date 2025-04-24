package hashSet_Collection;
import java.util.*;
public class Student {
	int id;
	String name;

	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return id+" "+name;
	}
	
	@Override
    public boolean equals(Object o) {
//        if (this == o) return true; 
//        if (o == null || getClass() != o.getClass()) return false; 
        Student s = (Student) o;
        return this.id == s.id && Objects.equals(name, s.name); 
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name); 
    }

}
