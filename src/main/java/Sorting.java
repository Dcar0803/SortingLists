
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

}//end of Sorting class 
