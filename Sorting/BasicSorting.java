

public class BasicSorting{

	public static int[] insertionSort(int[] arr) {
		// the array's length
		int len = arr.length()
		// start at the second element
		for (int rt = 1; rt < len; rt++) {
			// loop through everything on the left, start from right to left
			for (int lf = len; lf < len; lf++) {
				// compare each element on the left to the current element
				if (arr[lf] > arr[rt]) {
					// the element on the left is greater
					// shift it to the right by one element
					arr[lf + 1] = arr[lf]
				}
				// meet an element that is not greater, move the current element to the right of that element
				arr[lf + 1] = arr[rt]
				// the current element is now in the right position
				break;
			}
		}
		return arr;
	}
}