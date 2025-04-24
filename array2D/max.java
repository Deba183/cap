package array2D;
import java.util.Scanner;
import java.util.Arrays;

public class max {
	public static int[][] createArr() {
		Scanner scanner = new Scanner(System.in);
		int rows, cols;
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		System.out.println("Enter number of cols: ");
		cols = scanner.nextInt();
		int [][] arr = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for(int j = 0 ; j < cols ; j++) {
				System.out.println("Enter the elements of the array: ");
				arr[i][j] = scanner.nextInt();
			}
		}
		return arr;



	}
	public static void max_ele(int[][]arr) {
		int max = arr[0][0];
		for(int i = 0; i<arr.length;i++) {
			for(int j = 0; j< arr[i].length;j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
			System.out.print(max);

		}



	}

	public static void sym(int[][]arr) {
		for(int i = 0; i<arr.length;i++) {
			for(int j = 0; j< arr[i].length;j++) {
				if (arr[i][j] == arr[j][i]) {
					System.out.println("sym");
				}
				else {
					System.out.println("asy");
				}

			}
		}
		

	}
	public static void transpose(int[][]arr) {
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		int [][] arr = createArr();

		//max_ele(arr);
		sym(arr);
		transpose(arr);


	}

}
