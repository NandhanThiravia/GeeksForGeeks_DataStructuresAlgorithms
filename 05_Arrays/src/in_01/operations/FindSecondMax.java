package in_01.operations;

public class FindSecondMax {
	public static void main(String[] args) {
//		int[] array = { 14, 3, 2, 10, 23, 20 };
//		int[] array = { 10, 11, 12, 13 };
//		int[] array = { 5, 4, 3, 2, 1 };
//		int[] array = { 2, 2, 2, 2 };
		int[] array = { 2, 2, 2, 2, 1 };

		System.out.println("Max element is: " + max(array));
		System.out.println("Second Max element is: " + secondMax(array));
	}

	private static int secondMax(int[] array) {
		int max = -1;
		int secondMax = -1;

		do {
			if (array.length <= 0) {
				break;
			}

			max = array[0];
			for (int index = 1; index < array.length; ++index) {
				if (max < array[index]) {
					if (secondMax < max) {
						secondMax = max;
					}
					max = array[index];
				} else if (max > array[index] && secondMax < array[index]) {
					secondMax = array[index];
				}
			}

		} while (false);

		return secondMax;
	}

	private static int max(int[] array) {
		int max = -1;

		do {
			if (array.length <= 0) {
				break;
			}

			max = array[0];
			for (int index = 1; index < array.length; ++index) {
				if (max < array[index]) {
					max = array[index];
				}
			}

		} while (false);

		return max;
	}
}
