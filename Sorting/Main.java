import java.util.Arrays;

public class Main {   // Save as "Hello.java" under "d:\myProject"
   	public static void main(String[] args) {
   		// the unsorted array
   		int[] arr = Utils.makeNumbers(0, 20, 10);
   		System.out.println(Arrays.toString(arr));
   		// the sorted array
   		int[] sortedArray;

   		/*** START SORTING ***/

   		/* Basic sortings */
    	BasicSorting bs = new BasicSorting();
    	// INSERTION SORT
      	sortedArray = bs.insertionSort(arr);
      	System.out.println(Arrays.toString(sortedArray));
   }
}