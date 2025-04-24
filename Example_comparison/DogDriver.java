package Example_comparison;

import java.util.Arrays;

public class DogDriver {
	
	public static void main(String[] args) {
		Dog[] dogs = new Dog[3];
		
		dogs[0] = new Dog("Fang", 1, "Siberian Husky");
		dogs[1] = new Dog("Snowy", 2, "Beagle");
		dogs[2] = new Dog("Crookshanks", 3, "German Shepherd");
		
		CompareBreed c = new CompareBreed();
		
		Arrays.sort(dogs, c);
		System.out.println(Arrays.toString(dogs));
		
	}
	
	

}
