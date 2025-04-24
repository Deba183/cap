package lambda_expression;

public class Demo12Driver {
	public static void main(String[] args) {
		Demo1 d1 = () -> System.out.println("hello");
		Demo2 d2 = () -> System.out.println("Hello");
		d1.print();
		d2.greet();
	}

}
