package in_01.operations;

public class Reverse {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4 };

		reverse(array);

		System.out.print("{");
		for (int element : array) {
			System.out.print(element + ",");
		}
		System.out.print("}");
	}

	private static void reverse(int[] array) {
		int temp = 0;
		for (int index = 0; index < (array.length / 2); ++index) {
			temp = array[index];
			array[index] = array[array.length - index - 1];
			array[array.length - index - 1] = temp;
		}
	}
}
