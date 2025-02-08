package in_06.all.prime;

import java.io.IOException;
import java.util.ArrayList;

import in.common.Reader;

public class Better_SieveOfEratosthenes2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Welcome to finding all Prime Numbers less than or equal to the given number!");

		Reader reader = new Reader();

		long number = reader.getLong();
		System.out.println(allPrime(number));
	}

	private static ArrayList<Long> allPrime(long number) {
		boolean isPrime[] = new boolean[(int) (number + 1)];

		long index = 0, innerIndex = 0;
		for (index = 2; index <= number; ++index) {
			isPrime[(int) index] = true;
		}

		for (index = 2; index * index <= number; ++index) {
			if (isPrime[(int) index]) {
				for (innerIndex = index * 2; innerIndex <= number; innerIndex += index) {
					isPrime[(int) innerIndex] = false;
				}
			}
		}

		ArrayList<Long> primeNumberList = new ArrayList<Long>();
		for (index = 2; index <= number; ++index) {
			if (isPrime[(int) index]) {
				primeNumberList.addLast(index);
			}
		}

		return primeNumberList;
	}
}
