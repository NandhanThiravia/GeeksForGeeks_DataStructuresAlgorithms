package in_02.palindrome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number: ");
		long number = Long.parseLong(br.readLine());

		long start = System.nanoTime();
		isPalindromeBest(number);
		long end = System.nanoTime();
		System.out.println("isPalindromeBest: Took " + (end - start) + " ns");
		
		System.out.println();
		start = System.nanoTime();
		isPalindromeByReverse(number);
		end = System.nanoTime();
		System.out.println("isPalindromeByReverse: Took " + (end - start) + " ns");
	}

	/**
	 * 1. Take start and end flag
	 * 2. Check if they are equal, if they are then start
	 * moves ahead and end moves back
	 * 3. Stop at the middle
	 * 
	 * @param number
	 */
	public static void isPalindromeBest(long number) {
		long startNumber = number;
		long endNumber = number;
		
		int length = countDigits(number);
		int rounds = length / 2;

		long start = 0, end = 0;
		boolean isPalindrome = true;
		while (rounds > 0) {
			//System.out.println("startNumber: " + startNumber + "; endNumber: " + endNumber);
			start = startNumber / ((long) Math.pow(10, (length - 1)));
			end = endNumber % 10;
			//System.out.println("start: " + start + "; end: " + end);

			if (start != end) {
				isPalindrome = false;
				break;
			}

			startNumber = startNumber - (start * ((long) Math.pow(10, (length - 1))));
			endNumber = endNumber / 10;
			--rounds;
			--length;
		}

		if (isPalindrome) {
			System.out.println("Number is a palindrome");
		} else {
			System.err.println("Number is Not a palindrome");
		}

	}

	/**
	 * Steps: 1. Reverse the input number 2. Check if the reverse and input numbers
	 * are same for Palindrome
	 * 
	 * @param number
	 */
	public static void isPalindromeByReverse(long number) {
		if (number == reverse(number)) {
			System.out.println("Number is a palindrome");
		} else {
			System.err.println("Number is Not a palindrome");
		}
	}

	private static long reverse(long n) {
		long reversedNumber = 0;
		short remainder = 0;
		while (n > 0) {
			remainder = (short) (n % 10);
			reversedNumber = (reversedNumber * 10) + remainder;
			n = n / 10;
		}
		return reversedNumber;
	}

	private static int countDigits(long n) {
		int countOfDigits = 0;

		while (n > 0) {
			++countOfDigits;
			n = n / 10;
		}
		return countOfDigits;
	}
}
