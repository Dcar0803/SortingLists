
public class Sorting {
	
	/**
     * Sorts an array using QuickSort.
     * @param arr the array to be sorted
     * @param low the starting index
     * @param high the ending index
     */
	
	public static void quickSort(int array[], int low, int high) {
		
		if (low < high){
			
			//find pivot element such that elements smaller than pivot are on the left and elements greater than pivot are on the right
			
			int pi = partition(array,low,high);
			quickSort(array,low, pi - 1); // Recursive call on the left of pivot
			quickSort(array, pi + 1, high); // Recursive call on the right of pivot
			
			
			
		}//end of if statement
		
	}//end of quickSort method 
	
	static int partition(int array[], int low, int high) {
		
		int pivot = array[high]; //Choosing the rightmost element as pivot
		int i = (low-1); // pointer for greater element
		
		for (int j = low; j < high; j++) {
			
			if (array[j] <= pivot) {
				
				i++; //if element smaller than pivot is found, swap it with the greater element pointed by i 
				
				//swapping element at i with element at j
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				
			}//end of if statement
			
		}//end of for loop
		
		int temp = array[i + 1];
		array[i  + 1] = array[high];
		array[high] = temp;
		
		return (i + 1);
	}//end of partition method 
	
	public static void mergeSort(int arr[], int left, int right) {
		
		if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }//end of if statement
		
	}//end of mergeSort method 
	
	private static void merge(int arr[], int left, int mid, int right) {
		// p is left //q is mid r is right
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for (int i = 0; i <n1; i++) {
			L[i] = arr[left + i];
			
		}//end of for loop
		
		for (int i = 0; i <n2; i++){
			R[i] = arr[mid + 1 + i];
			
		}//end of for loop
		
		
		//Maintain current index of sub-arrays and main array
		
		int i = 0;
		int j = 0;
		int k = left;
		
		while (i < n1 && j < n2) {
			if (L[i] <=R[i]) {
				arr[k++] = L[i++];
			}//end of if statement
			
			else {
				arr[k++] = R[j++];
				
				
			}//end of else statement

			
		}//end of while loop
		
		while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
		
	}//end of merge method 

}//end of Sorting class 
