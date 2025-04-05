package in_01.operations;

public class IsSorted {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 4 };

		System.out.println("Is Sorted: " + isSortedIncreasingOrder(array));
	}

	private static boolean isSortedIncreasingOrder(int[] array) {
		boolean isSorted = true;
		int marker = 0;

		do {
			if (array.length <= 0) {
				break;
			}

			marker = array[0];
			for (int index = 1; index < array.length; ++index) {
				if (marker > array[index]) {
					isSorted = false;
					break;
				}
				marker = array[index];
			}

		} while (false);

		return isSorted;
	}
}
