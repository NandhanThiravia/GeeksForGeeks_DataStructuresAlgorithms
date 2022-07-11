package com.countdigits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Main obj = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println("Count of Digits: " + obj.countDigits(n));
		System.out.println("Count of Digits: " + obj.countDigitsRecur(n));
	}

	private int countDigits(int n) {
		int countOfDigits = 0;

		while (n > 0) {
			++countOfDigits;
			n = n / 10;
		}
		return countOfDigits;
	}

	private int countDigitsRecur(int n) {
		if (n == 0) {
			return 0;
		}

		return 1 + countDigitsRecur(n / 10);
	}
}
