package wrapper_class;

public class WrapperClass {
	public static void main(String[] args) {
		int i = 10;
		Integer x = new Integer(i); //boxing
		System.out.println("x: "+x);
		Integer z = Integer.valueOf(i);
		System.out.println("z: "+z);
		
		
		Integer y = 30;//auto-boxing
		System.out.println("y: "+y);
		
		int a = y.intValue();//unboxing
		Boolean flag = true;
		boolean b = flag.booleanValue();//unboxing
		System.out.println("a: "+a+" "+"b: "+b);
		
		Character ch = 'a';//auto-boxing
		char c = ch;//auto-unboxing
		
	}

}
