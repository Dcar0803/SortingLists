
public class Main {

	public static void main(String[] args) {
		int[] array = {5, 3, 8, 6, 2, 7, 4, 1};
		
		System.out.println("Original unsorted array: ");
		printArray(array);
		
		 // Test QuickSort
        Sorting.quickSort(array, 0, array.length - 1);
        System.out.println("\nSorted Array with QuickSort:");
        printArray(array);
        
     // Test MergeSort
        int[] arr = {10, 7, 8, 9, 1, 5};
        Sorting.mergeSort(arr, 0, arr.length - 1);
        System.out.println("\nSorted Array with MergeSort:");
        printArray(arr);

        
     // Test BubbleSort
        int[] array2 = {20, 15, 10, 5};
        Sorting.bubbleSort(array2);
        System.out.println("\nSorted Array with BubbleSort:");
        printArray(array2);

	}//end of main method 
	
	public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }//end of printArray method

}//end of Main class file
