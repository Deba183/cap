package Bub_Ins;
import java.util.Arrays;
public class BubbleSort {//worst case O(n^2)
	public static void main(String[] args) {
		int[] arr = {23, 2, 56, 4, 32, 7};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
