package com.palindrome;

public class Main {
	public static void main(String[] args) {
		
	}

	private long reverse(long n) {
		long reversedNumber = 0;
		short remainder = 0;
		while (n > 0) {
			remainder = (short) (n % 10);
			reversedNumber = (reversedNumber * 10) + remainder;
			n = n / 10;
		}
		return reversedNumber;
	}
}
