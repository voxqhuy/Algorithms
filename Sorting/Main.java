import java.util.Arrays;
import java.util.function.UnaryOperator;

public class Main {   // Save as "Hello.java" under "d:\myProject"
   	public static void main(String[] args) {

 		Utils utils = new Utils();
   		// the unsorted array
   		int[] arr = Utils.makeNumbers(0, 20, 10);
   		System.out.println(Arrays.toString(arr));
   		// the sorted array
   		int[] sortedArray;

   		/*** START SORTING ***/

   		/* Basic sortings */
    	BasicSorting bs = new BasicSorting();
    	// INSERTION SORT
    	long startTime = System.nanoTime();
      	// sortedArray = bs.insertionSort(arr.clone());
      	System.out.println(Arrays.toString(bs.insertionSort(arr.clone())));
      	long endTime = System.nanoTime();
      	System.out.println(endTime - startTime);

      	long startTime1 = System.nanoTime();
      	sortedArray = bs.insertionSort(arr.clone());
      	// System.out.println(Arrays.toString(sortedArray));
      	long endTime1 = System.nanoTime();
      	System.out.println(endTime1 - startTime1);

      	System.out.println(Arrays.toString(bs.insertionSort2(arr.clone())));
   }
}