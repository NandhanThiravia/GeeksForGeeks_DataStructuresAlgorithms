package in_05.maximum_difference;

public class Efficient {
	public static void main(String[] args) {
		int[] array = { 2, 3, 10, 6, 4, 8, 1 };

		System.out.println("Maximum Difference: " + maximumDifference(array));
	}

	// Find the maximum difference in the array array[right] - array[left]
	// such that right > left
	private static int maximumDifference(int[] array) {
		int min = array[0], maxDifference = array[1] - array[0];
		for (int index = 1; index < array.length; ++index) {
			if (maxDifference < array[index] - min) {
				maxDifference = array[index] - min;
			}
			if (min > array[index]) {
				min = array[index];
			}
		}

		return maxDifference;
	}
}
