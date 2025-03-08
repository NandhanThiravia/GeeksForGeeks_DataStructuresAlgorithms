package in_06.sum_of_digits;

import java.io.IOException;

import in.common.Reader;

public class Recursion {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Reader reader = new Reader();
		System.out.print("Enter a number: ");
		int number = reader.readInt();

		long start = System.nanoTime();
		int sumOfDigits = sumOfDigits(number);
		long end = System.nanoTime();

		System.out.println("Sum of digits of \"" + number + "\" is " + sumOfDigits);
		System.out.println(Recursion.class.getSimpleName() + " took " + (end - start) + " ns");
	}

	private static int sumOfDigits(int number) {
		if (number <= 0) {
			return 0;
		}
		return (number % 10) + sumOfDigits(number / 10);
	}

}
