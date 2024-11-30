
public class Main {

	public static void main(String[] args) {
		int[] array = {5, 3, 8, 6, 2, 7, 4, 1};
		
		System.out.println("Original unsorted array: ");
		printArray(array);

	}//end of main method 
	
	public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }//end of printArray method

}//end of Main class file
