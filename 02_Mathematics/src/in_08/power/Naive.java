package in_08.power;

import java.io.IOException;

import in.common.Reader;

public class Naive {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Reader reader = new Reader();
		System.out.print("Enter the number: ");
		long number = reader.getLong();

		System.out.print("Enter the power: ");
		long power = reader.getLong();

		System.out.println("Result: " + power(number, power));
	}

	private static long power(long number, long power) {
		long result = 1;
		for (int counter = 0; counter < power; ++counter) {
			result = result * number;
		}
		return result;
	}
}
