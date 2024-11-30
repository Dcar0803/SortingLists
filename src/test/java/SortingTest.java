import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortingTest {

	@Test
	void testQuickSort() {
		int[] array = {4,5,3,1,2};
		int[] expected = {1,2,3,4,5};
		Sorting.quickSort(array,0, array.length-1);
		assertArrayEquals(expected, array);
	}//end of testQuickSort
	
	@Test
	void testMergeSort() {
		int[] array = {4,5,3,1,2};
		int[] expected = {1,2,3,4,5};
		Sorting.mergeSort(array,0, array.length-1);
		assertArrayEquals(expected, array);
	}//end of testQuickSort
	

}//end of SortingTest class 
