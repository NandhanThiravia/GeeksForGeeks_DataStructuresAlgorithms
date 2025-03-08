package in_05.palindrome_check;

import java.io.IOException;

import in.common.Reader;

public class TailRecursion {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Reader reader = new Reader();
		System.out.print("Enter a string: ");
		String data = reader.readString();

		System.out.println("Is \"" + data + "\" a palindrome? " + palindrome(data, 0, data.length() - 1));
	}

	private static boolean palindrome(String data, int start, int end) {
		if (start >= end) {
			return true;
		}

		if (data.charAt(start) != data.charAt(end)) {
			return false;
		}

		return palindrome(data, ++start, --end);
	}
}
