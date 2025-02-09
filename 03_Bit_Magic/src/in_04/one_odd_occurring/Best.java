package in_04.one_odd_occurring;

import java.io.IOException;

public class Best {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] array = { 8, 8, 4, 4, 100, 5, 5, 6, 6 };

		System.out.println("findOneOddOccurringNumber: " + findOneOddOccurringNumber(array));
	}

	private static int findOneOddOccurringNumber(int[] array) {
		int number = 0;

		for (int item : array) {
			number = number ^ item;
		}

		return number;
	}
}
