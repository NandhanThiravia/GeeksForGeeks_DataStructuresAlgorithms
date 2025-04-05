package in_01.operations;

import java.io.IOException;

import in.common.Reader;

public class Insert {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] array = new int[5];

		Reader reader = new Reader();
		while (true) {

			System.out.println("Choices:");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Exit");
			System.out.println();

			System.out.print("Enter your choice: ");
			int choice = reader.readInt();
			if (choice == 1) {
				print(array, array.length);

				System.out.println("Let's Insert");
				System.out.print("Element: ");
				int element = reader.readInt();
				System.out.print("Position: ");
				int position = reader.readInt();

				insert(array, array.length, element, position);
				print(array, array.length);
			} else if (choice == 2) {
				print(array, array.length);

				System.out.println("Let's Delete");
				System.out.print("Position: ");
				int position = reader.readInt();

				delete(array, array.length, position);
				print(array, array.length);
			} else {
				break;
			}
		}
	}

	// Insert an Element at a Position in an Array
	private static boolean insert(int[] array, int length, int element, int position) {
		boolean isOK = false;

		do {
			if (position >= length) {
				System.err.println("position(" + position + ") is greater than the array length(" + length + ")");
				break;
			}

			for (int index = length - 1; index > position; --index) {
				array[index] = array[index - 1];
			}
			array[position] = element;

			isOK = true;
		} while (false);

		return isOK;

	}

	private static boolean delete(int[] array, int length, int position) {
		boolean isOK = false;

		do {
			if (position >= length) {
				System.err.println("position(" + position + ") is greater than the array length(" + length + ")");
				break;
			}

			if (position + 1 == length) {
				array[position] = 0;
				isOK = true;
				break;
			}

			for (int index = position + 1; index < length; ++index) {
				array[index - 1] = array[index];
			}
			array[length - 1] = 0;

			isOK = true;
		} while (false);

		return isOK;
	}

	private static void print(int[] array, int length) {
		System.out.println("Array:");
		for (int index = 0; index < length; ++index) {
			System.out.print(array[index]);
			if (index < length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		System.out.println();
	}
}
