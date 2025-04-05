package in_03.left_rotate_by_d;

public class Efficient {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };

		leftRotate(array, 2);

		print(array);
	}

	private static void leftRotate(int[] array, int times) {
		reverse(array, 0, times - 1);
		reverse(array, times, array.length - 1);
		reverse(array, 0, array.length - 1);
	}

	private static void reverse(int[] array, int start, int end) {
		while (start < end) {
			swap(start, end, array);
			++start;
			--end;
		}
	}

	private static void swap(int index, int zero_marker, int[] array) {
		int temp = array[index];
		array[index] = array[zero_marker];
		array[zero_marker] = temp;
	}

	private static void print(int[] array) {
		System.out.print("{");
		for (int index = 0; index < array.length; ++index) {
			System.out.print(array[index]);
			if (index != array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
	}
}