package hashMap;

public class HashMapImplementation {
	final int size = 16;
	Entry[] buckets = new Entry[size];
	

	private int getBucketIndex(int key) {
		return Math.abs(Integer.hashCode(key))%size;


	}

	public void put(int key, int value) {
		


		Entry node = new Entry(key, value);
		int index = getBucketIndex(key);
		System.out.println("the entry is added at index: "+index);
		
		Entry current = buckets[index];
		while(current!=null) {
			if(current.key == key) {//checking if the new entry key is already present in the linked list
				current.value = value;//updating value
				return;
			}
			current = current.next;
		}
		node.next = buckets[index];//marking the new node as head
		buckets[index] = node;//storing head in the array
		
	}
	
	public int getValue(int key) {
		 int index = getBucketIndex(key);
		    Entry current = buckets[index];
		    
		    while (current != null) {
		        if (current.key == key) {
		            return current.value;
		        }
		        current = current.next;
		    }
		    return -1;
		
		
	}
	
	public void deleteValue(int key) {
		 int index = getBucketIndex(key);
		    Entry current = buckets[index];
		    Entry prev = null;

		    while (current != null) {
		        if (current.key == key) {
		            if (prev == null) {
		                prev = current;
		                buckets[index] = current.next;
		                prev.next = null;
		            } else {
		                
		                prev.next = current.next;
		                current.next = null;
		            }
		        
		            return;
		        }
		        }
	}
	
	public void display() {
	    for (int i = 0; i < size; i++) {
	        Entry current = buckets[i];
	        if (current != null) {
	            System.out.print("Bucket " + i + ": ");
	            while (current != null) {
	                System.out.print("[" + current.key + "=" + current.value + "] ");
	                current = current.next;
	            }
	            System.out.println();
	        }
	    }
	}
		       
	public static void main(String[] args) {
		HashMapImplementation map = new HashMapImplementation();
		map.put(10, 1);
		//map.put(20, 9);
	}
}


