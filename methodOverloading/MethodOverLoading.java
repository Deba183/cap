package methodOverloading;
import java.util.Scanner;

public class MethodOverLoading {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
			if(num > 0 && num % 2 == 0) {
				System.out.println("pos even");
			}
			else if (num > 0 && num % 2 != 0){
				System.out.println("pos odd");
				
			}
			else if (num < 0 && num % 2 == 0) {
				System.out.println("neg even");
			}
			else {
				System.out.println("pos odd");
			}
		
		
				
	}

}
