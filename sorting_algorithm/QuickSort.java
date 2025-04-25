package sorting_algorithm;

public class QuickSort {
	//partition function
	static int partition(int arr[], int low, int high) {
		int pivot = arr[high];//choosing last element as pivot
		int i = low - 1;//pointer for smaller elements
		
		for(int j = low;j<high;j++) {
			if(arr[j] < pivot) {//swap if current element is smaller than pivot
				i++;
				swap(arr, i, j);
			}                                              
		}
		swap(arr, i+1, high);//place pivot in correct position
		return i + 1;//return pivot index
	}
	//quick sort function
	static void quickSort(int arr[], int low, int high) {
		if(low<high) {
			int pivotIndex = partition(arr, low, high);
			quickSort(arr, low, pivotIndex - 1);//sort left part
			quickSort(arr, pivotIndex + 1, high);//sort right part
			
		}
	}
	//swap function
	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	//main function to test quick sort
	public static void main(String[] args) {
		int arr[] = {10, 7, 8, 9, 1, 5};
		int n = arr.length;
		
		quickSort(arr, 0, n-1);
		
		System.out.println("Sorted array");
		for(int num : arr) {
			System.out.println(num + " ");
		}
	}

}
