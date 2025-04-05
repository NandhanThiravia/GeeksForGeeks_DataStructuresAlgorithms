package in_01.operations;

public class MoveZeroesToEnd {
	public static void main(String[] args) {
		int[] array = { 2, 5, 0, 4, 6, 0, 7, 9, 0 };

		moveZeroesToEnd(array);

		System.out.print("{");
		for (int index = 0; index < array.length; ++index) {
			System.out.print(array[index]);
			if (index != array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
	}

	private static void moveZeroesToEnd(int[] array) {
		int zero_marker = 0;
		for (int index = 0; index < array.length; ++index) {
			if (array[index] != 0) {
				swap(index, zero_marker, array);
				zero_marker++;
			}
		}
	}

	private static void swap(int index, int zero_marker, int[] array) {
		int temp = array[index];
		array[index] = array[zero_marker];
		array[zero_marker] = temp;
	}
}
