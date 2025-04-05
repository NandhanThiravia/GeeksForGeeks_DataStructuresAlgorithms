package in_03.left_rotate_by_d;

public class Main {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };

		leftRotate(array);

		System.out.print("{");
		for (int index = 0; index < array.length; ++index) {
			System.out.print(array[index]);
			if (index != array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
	}

	private static void leftRotate(int[] array) {
		int temp = array[0];
		for (int index = 1; index < array.length; ++index) {
			array[index - 1] = array[index];
		}
		array[array.length - 1] = temp;
	}
}
