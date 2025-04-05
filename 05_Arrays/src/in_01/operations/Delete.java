package in_01.operations;

public class Delete {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };

		int length = array.length;
		length = delete(array, length, 2);
		length = delete(array, length, 2);

		System.out.print("{");
		for (int index = 0; index < length; ++index) {
			System.out.print(array[index]);
			if (index < length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
	}

	private static int delete(int[] array, int length, int deletePosition) {
		do {
			if (deletePosition >= length || deletePosition < 0) {
				System.err.println("Invalid delete position");
				break;
			}

			for (int index = deletePosition; index < length - 1; ++index) {
				array[index] = array[index + 1];
			}
			array[length - 1] = 0;

			length = length - 1;
		} while (false);

		return length;
	}
}
