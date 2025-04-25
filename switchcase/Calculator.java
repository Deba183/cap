package switchcase;
import java.util.Scanner;

public class Calculator {
	public static void addMenu() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("Enter 1 to add 2 numbers. Enter 2 ro add 3 numbers. Enter 3 to add 4 numbers.");
		switch(a) {
		case 1:

			System.out.println("Enter 1st number:");
			double num1 = scan.nextDouble();
			System.out.println("Enter 2nd number:");
			double num2 = scan.nextDouble();
			System.out.println(num1 + num2);
			break;
		case 2:
			System.out.println("Enter 1st number:");
			double num3 = scan.nextDouble();
			System.out.println("Enter 2nd number:");
			double num4 = scan.nextDouble();
			System.out.println("Enter 3rd number:");
			double num5 = scan.nextDouble();
			System.out.println(num3 + num4 + num5);
		case 3:
			System.out.println("Enter 1st number:");
			double num6 = scan.nextDouble();
			System.out.println("Enter 2nd number:");
			double num7 = scan.nextDouble();
			System.out.println("Enter 3rd number:");
			double num8 = scan.nextDouble();
			System.out.println("Enter 4th number:");
			double num9 = scan.nextDouble();
			System.out.println(num6 + num7 + num8 + num9);



		}




	}
	public static void subMenu() {
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();
		System.out.println("Enter 1st number:");
		double num10 = scan.nextDouble();
		System.out.println("Enter 2nd number:");
		double num11 = scan.nextDouble();
		System.out.println(num10 - num11);
	}

}
