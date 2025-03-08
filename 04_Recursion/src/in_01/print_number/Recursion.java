package in_01.print_number;

import java.io.IOException;

import in.common.Reader;

public class Recursion {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Reader reader = new Reader();
		System.out.print("Enter a number: ");
		int number = reader.readInt();

		System.out.println();
		System.out.println("Printing from 1 to " + number);
		print(number);
		
		System.out.println();
		System.out.println("Printing from " + number + " to 1");
		printReverse(number);
	}

	private static void printReverse(int number) {
		if (number == 0) {
			return;
		}

		System.out.println(number);
		printReverse(number - 1);
	}

	private static void print(int number) {
		if (number == 0) {
			return;
		}

		print(number - 1);
		System.out.println(number);
	}
}
