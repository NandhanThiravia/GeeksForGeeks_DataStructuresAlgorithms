package in_02.count_set_bits;

import java.io.IOException;

import in.common.Reader;

public class Best {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Reader reader = new Reader();
		System.out.print("Enter the number: ");
		int number = reader.readInt();

		System.out.println("Set Bits count: " + countSetBits(number));
	}

	// Brian Kerningham's Algorithm
	private static int countSetBits(int number) {
		int count = 0;

		while (number > 0) {
			count += 1;
			number = number & (number - 1);
		}

		return count;
	}
}
