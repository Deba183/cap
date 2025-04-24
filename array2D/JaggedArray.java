package array2D;
import java.util.Scanner;
import java.util.Arrays;
public class JaggedArray {
	public static int[][] createJaggedArr() {
		Scanner scanner = new Scanner(System.in);
		
		int[][] arr = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[4];
		return arr;
		

	}


	public static void main(String[] args) {
		createJaggedArr(arr);

	}
}



