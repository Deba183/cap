package StringBuffer;

public class Debanjana {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		sb1.append(false);
		sb1.append("hello");
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer("Hello world");
		System.out.println(sb2);
		
		char[] arr = {'a', 'b', 'c'};
		StringBuffer sb3 = new StringBuffer(150);
		sb3.append(arr);
		System.out.println(sb3);
		System.out.println(sb3.capacity());
		sb3.ensureCapacity(189);
		System.out.println(sb3.capacity());
	}

}
