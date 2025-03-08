package in_12.subset_sum;

public class Recursion {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 122, 5 };
		System.out.println("Sum Subset: " + sumSubset(array, 0, 5));
	}

	private static int sumSubset(int[] array, int index, int sum) {
		if (index == array.length) {
			if (sum == 0)
				return 1;

			if (sum != 0) {
				return 0;
			}
		}

		return sumSubset(array, index + 1, sum) + sumSubset(array, index + 1, sum - array[index]);
	}
}
