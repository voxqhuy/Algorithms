import java.util.Random;
import java.util.Arrays;
import java.text.NumberFormat;
import java.util.Locale;

public class Utils {
	
	// The first type parameter of MonoFunction is the object type that contains the method to execute.
	// The second type parameter of MonoFunction is the type of the only parameter.
	// The third type parameter of TriFunction is the return type of the method.
	// interface MonoFunction<U, R> {
	//   R apply(U u);
	// }

	public static int[] makeNumbers(int min, int range, int length) {
		// Generating random numbers
		Random ran = new Random();
		// Creating an array to store random numbers
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			// Make a number in range
			int n = ran.nextInt(range) + min;
			// Put the number into the array
			arr[i] = n;
		}
		return arr;
	}

	// format number
	// TODO: improve for decimal numbers
	public static String formatNumber(long num) {
		NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
      	String numStr = nf.format(num);
      	return numStr;
	}

	// print timing result
	public static void printTiming(String sortingName, long time) {
		String formattedTime = formatNumber(time / 1000000);
		System.out.println(sortingName + ": " + formattedTime + "ms");
	}

	// public void timing(int[] arr, UnaryOperator<int[]> func) {
	// 	long startTime = System.nanoTime();
 //      	// sortedArray = bs.insertionSort(arr.clone());
 //      	System.out.println(Arrays.toString(func.apply(arr)));
 //      	long endTime = System.nanoTime();
 //      	System.out.println(endTime - startTime);
	// }
}