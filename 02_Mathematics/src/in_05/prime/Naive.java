package in_05.prime;

import java.io.IOException;

import in.common.Reader;

public class Naive {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Reader reader = new Reader();
		System.out.print("Enter a number: ");

		if (isPrime(reader.getLong())) {
			System.out.println("It is Prime");
		} else {
			System.err.println("Not Prime");
		}
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
