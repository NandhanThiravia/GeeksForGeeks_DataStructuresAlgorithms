package in_08.power;

import java.io.IOException;

import in.common.Reader;

public class Better {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Reader reader = new Reader();
		System.out.print("Enter the number: ");
		long number = reader.getLong();

		System.out.print("Enter the power: ");
		long power = reader.getLong();

		System.out.println("Result: " + power(number, power));
	}

	public static long power(long number, long power) {
		if (power == 0) {
			return 1;
		}

		long result = power(number, power / 2);
		result = result * result;
		if (power % 2 != 0) {
			result = result * number;
		}
		return result;
	}
}
