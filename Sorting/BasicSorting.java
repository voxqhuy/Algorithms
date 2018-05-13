public class BasicSorting extends Sorting{

	/* INSERTION SORT */
	public int[] insertionSort(int[] arr) {
		// the array's length
		int len = arr.length;
		// start at the second element
		for (int rt = 1; rt < len; rt++) {
			// make a copy of the current element
			int current = arr[rt];
			// the poision, at which, the current element should be in
			int position = 0;
			// loop through everything on the left, start from right to left
			for (int lf = rt - 1; lf >= 0; lf--) {
			// compare each element on the left to the current element
				if (arr[lf] > current) {
					// the element on the left is greater
					// shift it to the right by one element
					arr[lf + 1] = arr[lf];
				} else {
					// meet an element that is not greater, update the position
					position = lf + 1;
					break;
				}
			}
			// move the current element to the proper position
			arr[position] = current;
		}
		return arr;
	}

	// the second solution (from GeeksforGeeks)
	public static int[] insertionSort2(int[] arr) {
		// the array's length
		int len = arr.length;
		// start at the second element
		for (int rt = 1; rt < len; rt++) {
			// make a copy of the current element
			int current = arr[rt];
			int lf = rt - 1;
			// Move elements of arr[0..rt-1], that are greater than current,
			// to one position ahead of their current position
			while(lf >= 0 && arr[lf] > current) {
				arr[lf + 1] = arr[lf];
				lf--;
			}
			// move the current element to the proper position
			arr[lf + 1] = current;
		}
		return arr;
	}


	/* BUBBLE SORT */
	public static int[] bubleSort(int[] arr) {
		// Keep track of the array's order status
		bool isUnsorted = true;
		while (isUnsorted) {
			// set it to false initially
			isUnsorted = false;
			// go through each pair of elements
			for (int i = 0; i < arr.len - 1; i++) {
				// If the element on the left is greater, swap them
				if (arr[i] > arr[i + 1]) {
					// Make a copy of one element
					int copy = arr[i];
					// swapping
					arr[i] = arr[i + 1];
					arr[i + 1] = copy;
					// sorry it is not sorted yet
					isUnsorted = true;
				}
			}
		}
	}
}