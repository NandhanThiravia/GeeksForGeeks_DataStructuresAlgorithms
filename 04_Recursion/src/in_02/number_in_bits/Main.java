package in_02.number_in_bits;

import java.io.IOException;

import in.common.Reader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Reader reader = new Reader();
		System.out.print("Enter a number: ");
		int number = reader.readInt();

		numberInBits(number);
	}

	private static void numberInBits(int number) {
		if (number == 0) {
			return;
		}

		numberInBits(number / 2);

		System.out.print(number % 2);
	}
}
