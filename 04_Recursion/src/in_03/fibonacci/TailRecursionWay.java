package in_03.fibonacci;

import java.io.IOException;

import in.common.Reader;

public class TailRecursionWay {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Reader reader = new Reader();
		System.out.print("Enter a number: ");
		int number = reader.readInt();

		System.out.println(number + "th fibonacci number is " + fibonacci(0, 1, number));
	}

	// This is Tail Recursion's example
	private static int fibonacci(int a, int b, int number) {
		if (number <= 0) {
			return a;
		} else if (number <= 1) {
			return b;
		}
		return fibonacci(b, a + b, number - 1);
	}
}
