package in_06.sum_of_digits;

import java.io.IOException;

import in.common.Reader;

public class TailRecursion {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Reader reader = new Reader();
		System.out.print("Enter a number: ");
		int number = reader.readInt();

		long start = System.nanoTime();
		int sumOfDigits = sumOfDigits(number, 0);
		long end = System.nanoTime();

		System.out.println("Sum of digits of \"" + number + "\" is " + sumOfDigits);
		System.out.println(TailRecursion.class.getSimpleName() + " took " + (end - start) + " ns");
	}

	private static int sumOfDigits(int number, int sum) {
		if (number <= 0) {
			return sum;
		}
		return sumOfDigits(number / 10, sum + (number % 10));
	}

}
