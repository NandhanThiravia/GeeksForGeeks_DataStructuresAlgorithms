package in_05.prime.factor;

import java.io.IOException;
import java.util.ArrayList;

import in.common.Reader;

public class Better {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Welcome to finding Prime Factor Program!");

		Reader reader = new Reader();
		System.out.print("Enter a number: ");

		long number = reader.getLong();

		if (number <= 1) {
			System.err.println("Number not eligible");
			return;
		}

		ArrayList<Long> primeFactorsList = new ArrayList<Long>();

		for (long index = 2; index * index <= number; ++index) {
			if (isPrime(index)) {
				while (number % index == 0) {
					// System.out.println("Prime Factor found: " + index);
					primeFactorsList.add(index);
					number = number / index;
					// System.out.println("Number reduced to: " + number);
				}
			}
		}

		// System.out.println("Number at the end: " + number);
		if (number != 1) {
			primeFactorsList.add(number);
		}
		System.out.println(primeFactorsList);

	}

	private static boolean isPrime(Long number) {
		boolean isPrime = true;

		do {
			if (number <= 1) {
				isPrime = false;
				break;
			}

			long sqrt = (long) Math.sqrt(number);

			for (int index = 2; index <= sqrt; ++index) {
				if (number % index == 0) {
					isPrime = false;
					break;
				}
			}

		} while (false);

		return isPrime;
	}
}
