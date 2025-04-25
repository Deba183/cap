package vector_methods;
import java.util.*;
public class Vector_AllInOne {
	public static void main(String[] args) {
		// Creating a Vector of Strings
		Vector<String> vector = new Vector<>();

		// 1. Adding elements
		vector.add("Red");
		vector.add("Green");
		vector.add("Blue");
		vector.add("Yellow");

		// 2. Add element at a specific index
		vector.add(2, "Purple");

		// 3. Add all elements from another collection
		List<String> moreColors = Arrays.asList("Black", "White");
		vector.addAll(moreColors);

		System.out.println("Initial Vector: " + vector);

		// 4. Accessing elements
		System.out.println("Element at index 3: " + vector.get(3));

		// 5. Updating (set) an element
		vector.set(1, "Lime");
		System.out.println("After set(1, 'Lime'): " + vector);

		// 6. Removing elements
		vector.remove("Black");
		vector.remove(2); // remove by index
		System.out.println("After removals: " + vector);

		// 7. Check if element exists
		System.out.println("Contains 'Blue'? " + vector.contains("Blue"));
		System.out.println("Index of 'White': " + vector.indexOf("White"));

		// 8. Size of the vector
		System.out.println("Size of Vector: " + vector.size());

		// 9. Iterating using Iterator
		System.out.println("\nIterating using Iterator:");
		Iterator<String> it = vector.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// 10. Iterating using ListIterator (bidirectional)
		System.out.println("\nIterating using ListIterator (back and forth):");
		ListIterator<String> listIt = vector.listIterator();
		while (listIt.hasNext()) {
			System.out.println("Forward: " + listIt.next());
		}
		while (listIt.hasPrevious()) {
			System.out.println("Backward: " + listIt.previous());
		}

		// 11. Iterating using for-each loop
		System.out.println("\nUsing for-each loop:");
		for (String color : vector) {
			System.out.println(color);
		}

		// 12. Cloning the vector
		Vector<String> clonedVector = (Vector<String>) vector.clone();
		System.out.println("\nCloned Vector: " + clonedVector);

		// 13. Clearing the vector
		vector.clear();
		System.out.println("\nVector after clear(): " + vector);
		System.out.println("Is vector empty? " + vector.isEmpty());
	}
}
