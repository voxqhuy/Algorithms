import java.util.Arrays;
import java.text.DecimalFormat;
import java.lang.*;

public class Main {   // Save as "Hello.java" under "d:\myProject"
   	public static void main(String[] args) {

 		Utils utils = new Utils();
 		// For rounding purpose
 		DecimalFormat df = new DecimalFormat("#.######");
 		// df.setRoundingMode(RoundingMode.CEILING);
 		// the length of the sequence
 		int arrayLength = 100000;

   		// the unsorted array
   		int[] arr = Utils.makeNumbers(0, 20, arrayLength);
   		
   		// System.out.println("The original array:");
   		// System.out.println(Arrays.toString(arr));
   		// the array after being sorted
   		int[] sortedArray;
   		// System.out.println("The sorted array:");
   		// System.out.println(Arrays.toString(BasicSorting.insertionSort(arr.clone())));
   		System.out.println("Testing sorting algorithms with "
   							+ arrayLength + " random numbers");
   		System.out.println("The length of time each algorithm takes:");
   		

   		/*** START SORTING ***/

   		/* Basic sortings */
    	BasicSorting bs = new BasicSorting();

    	// INSERTION SORT
      	long startTime = System.nanoTime();
      	sortedArray = bs.insertionSort(arr.clone());
      	long endTime = System.nanoTime();
      	long length = endTime - startTime;
      	// The result
      	utils.printTiming("Insertion Sort", length);

      	// BUBLE SORT
      	startTime = System.nanoTime();
      	sortedArray = bs.bubleSort(arr.clone());
      	endTime = System.nanoTime();
      	length = endTime - startTime;
      	// The result
      	utils.printTiming("Buble Sort", length);
   }
}