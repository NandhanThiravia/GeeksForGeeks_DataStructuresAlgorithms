package in_01.operations;

public class SearchUnsorted {
	public static void main(String[] args) {
		int[] array = { 2, 4, 3, 8, 6, 4, 9, 12, 78, 54, 34 };

		int searchItem = 54;

		int index = searchUnsorted(searchItem, array, array.length);
		if (index != -1) {
			System.out.println(searchItem + " found at " + index + "th position");
		} else {
			System.err.println(searchItem + " not found");
		}
	}

	// Search an Element in a Unsorted Array
	private static int searchUnsorted(int searchItem, int[] array, int length) {
		int index = -1;

		do {
			for (int i = 0; i < length; ++i) {
				if (searchItem == array[i]) {
					index = i;
					break;
				}
			}

		} while (false);

		return index;
	}

}
