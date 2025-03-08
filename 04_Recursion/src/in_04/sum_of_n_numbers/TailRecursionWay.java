package in_04.sum_of_n_numbers;

import java.io.IOException;

import in.common.Reader;

public class TailRecursionWay {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Reader reader = new Reader();
		System.out.print("Enter a number: ");
		int number = reader.readInt();

		System.out.println("Sum of first " + number + " natural number is " + sumOfNNumbers(0, number));
	}

	private static int sumOfNNumbers(int sum, int number) {
		if (number <= 0)
			return sum;
		return sumOfNNumbers(sum + number, number - 1);
	}
}
