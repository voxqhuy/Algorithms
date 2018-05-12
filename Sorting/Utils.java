import java.util.Random;

public class Utils {
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
}