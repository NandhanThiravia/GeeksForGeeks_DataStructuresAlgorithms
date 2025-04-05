package in_01.operations;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] array = { 2, 2, 2, 4, 6, 6, 6, 8, 10, 10 };

		// int length = naiveRemoveDuplicates(array, array.length);
		int length = efficientRemoveDuplicates(array, array.length);

		System.out.print("{");
		for (int index = 0; index < length; ++index) {
			System.out.print(array[index]);
			if (index < length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
	}

	// Efficient
	private static int efficientRemoveDuplicates(int[] array, int length) {
		int marker = 0;

		for (int index = 1; index < length; ++index) {
			if (array[marker] != array[index]) {
				marker = marker + 1;
				array[marker] = array[index];
			}
		}

		return marker + 1;
	}

	// Naive
	private static int naiveRemoveDuplicates(int[] array, int length) {
		int startMarker = 0, endMarker = 0;

		for (int index = 1; index < length; ++index) {
			if (array[startMarker] == array[index]) {
				++endMarker;
			} else {
				if (endMarker != startMarker) {
					print(array, length);
					System.out.println("Duplicates found between " + startMarker + " and " + endMarker);
					for (int innerIndex = endMarker; innerIndex > startMarker; --innerIndex) {
						System.out.println("Deleting " + innerIndex);
						length = delete(array, length, innerIndex);
						print(array, length);
					}
					startMarker = startMarker + 1;
					endMarker = startMarker;
					index = startMarker;
				} else {
					startMarker = endMarker = index;
				}
			}
		}
		if (endMarker != startMarker) {
			print(array, length);
			System.out.println("Duplicates found between " + startMarker + " and " + endMarker);
			for (int innerIndex = startMarker + 1; innerIndex <= endMarker; ++innerIndex) {
				System.out.println("Deleting " + innerIndex);
				length = delete(array, length, innerIndex);
			}
		}

		return length;
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

	private static void print(int[] array, int length) {
		System.out.print("{");
		for (int index = 0; index < length; ++index) {
			System.out.print(array[index]);
			if (index < length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
	}
}
