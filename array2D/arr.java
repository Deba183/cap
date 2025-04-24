package array2D;
import java.util.Scanner;
import java.util.Arrays;
public class arr {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rows, cols;
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		System.out.println("Enter number of cols: ");
		cols = scanner.nextInt();
		int [][] array = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for(int j = 0 ; j < cols ; j++) {
				System.out.println("Enter the elements of the array: ");
				array[i][j] = scanner.nextInt();


			}
		}

		for (int i = 0; i < rows; i++) {
			for(int j = 0 ; j < cols ; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		scanner.close();




	}

}
