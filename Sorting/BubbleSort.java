public class BubbleSort extends Sort{
	
	/* BUBBLE SORT */
	public static int[] bubleSort(int[] arr) {
		// Keep track of the array's order status
		boolean isUnsorted = true;
		while (isUnsorted) {
			// set it to false initially
			isUnsorted = false;
			// go through each pair of elements
			for (int i = 0; i < arr.length - 1; i++) {
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
		return arr;
	}

	/* SHELL SORT */

	/*** NON POPULAR ***/

	/* COMB SORT */

	/* COCKTAIL SORT */

	/* GNOME SORT */

	/* ODD-EVEN SORT */
}