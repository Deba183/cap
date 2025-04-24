package ExceptionHandling;

public class ExceptionPropagation {
	public static void main(String[] args) {
		alpha();

	}
	public static void alpha() {
		System.out.println("alpha");
		beta();

	}
	public static void beta() {
		System.out.println("beta");
		gamma();
	}
	public static void gamma() {
		System.out.println("gamma");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception handled");

		}
		System.out.println("end of gamma");

	}

}
