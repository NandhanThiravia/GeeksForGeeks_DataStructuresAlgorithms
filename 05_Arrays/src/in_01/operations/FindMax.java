package in_01.operations;

public class FindMax {
	public static void main(String[] args) {
		int[] array = { 10, 3, 2, 14, 23, 20 };

		System.out.println("Max element is: " + max(array));
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
