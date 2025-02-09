package in_03.power_of_two;

import java.io.IOException;

import in.common.Reader;

public class Best {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Reader reader = new Reader();
		System.out.print("Enter the number: ");
		int number = reader.readInt();

		System.out.println("isPowerOfTwo: " + isPowerOfTwo(number));
	}

	private static boolean isPowerOfTwo(int number) {
		boolean isPowerOfTwo = false;

		if ((number & (number - 1)) == 0) {
			isPowerOfTwo = true;
		}

		return isPowerOfTwo;
	}

}
