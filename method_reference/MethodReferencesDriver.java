package method_reference;

public class MethodReferencesDriver {
	public static void main(String[] args) {
		Demo d = System.out::println;
		d.print("Hello world");
		
		MethodReferencesDriver driver = new MethodReferencesDriver();
		Test t = driver::print;
		t.greet(5, "welcome");
		Table table = MethodReferencesDriver::printTable;
		table.printTable(5);
		
	}
	public void print(int number, String message) {
		for(int i = 0;i<number;i++) {
			System.out.println(message);
			
		}
	}
	public static void printTable(int n) {
	    for (int i = 1; i <= 10; i++) {
	        System.out.println(n + " x " + i + " = " + (n * i));
	    }
	}

}
