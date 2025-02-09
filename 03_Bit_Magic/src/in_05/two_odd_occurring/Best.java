package in_05.two_odd_occurring;

import java.io.IOException;

public class Best {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] array = { 3, 4, 3, 4, 5, 6, 6, 9 };

		System.out.println("findTwoOddOccurringNumber: " + findTwoOddOccurringNumber(array));
	}

	private static String findTwoOddOccurringNumber(int[] array) {
		int number = 0;

		for (int item : array) {
			number = number ^ item;
		}

		int number1 = 0, number2 = 0;
		int key = number & ~(number - 1);
		for (int item : array) {
			if ((item & key) != 0) {
				number1 = number1 ^ item;
			} else {
				number2 = number2 ^ item;
			}
		}

		return "" + number1 + ", " + number2;
	}
}
