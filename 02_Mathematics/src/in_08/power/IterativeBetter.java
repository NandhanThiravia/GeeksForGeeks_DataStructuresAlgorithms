package in_08.power;

import java.io.IOException;

import in.common.Reader;

public class IterativeBetter {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Reader reader = new Reader();
		System.out.print("Enter the number: ");
		long number = reader.getLong();

		System.out.print("Enter the power: ");
		long power = reader.getLong();

		System.out.println("Result: " + power(number, power));
	}

	// O(log n)
	private static long power(long number, long power) {
		long result = 1;

		while (power > 0) {
			if ((power & 1) == 1) {
				result = result * number;
			}

			power = power >> 1;
			number = number * number;

			System.out.println("power: " + power);
			System.out.println("number: " + number);
			System.out.println("result: " + result);
		}

		return result;
	}
}
