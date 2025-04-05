package in_06.frequency;

public class Direct {
	public static void main(String[] args) {
		int[] array = { 120, 10, 10, 25, 30, 40 };
		frequency(array);
	}

	// Print frequencies of elements in a sorted array
	private static void frequency(int[] array) {
		int number = array[0];
		int counter = 1;
		for (int index = 1; index < array.length; ++index) {
			if (number == array[index]) {
				counter += 1;
				if (index == array.length - 1) {
					System.out.println("Number: " + number + " Frequency: " + counter);
				}
			} else {
				System.out.println("Number: " + number + " Frequency: " + counter);
				number = array[index];
				counter = 1;
				if (index == array.length - 1) {
					System.out.println("Number: " + number + " Frequency: " + counter);
				}
			}
		}
	}
}
