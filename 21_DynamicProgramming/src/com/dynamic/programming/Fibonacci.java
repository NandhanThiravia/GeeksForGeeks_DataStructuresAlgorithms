package com.dynamic.programming;

public class Fibonacci {
	public enum Type {
		RECURSIVE, MEMOIZATION, TABULATION
	}

	public long[] fibonacciSeries(int number) {
		long[] output = new long[number + 1];

		output[0] = 0;
		if (number >= 1) {
			output[1] = 1;
		}

		for (int index = 2; index <= number; ++index) {
			output[index] = output[index - 1] + output[index - 2];
		}
		return output;
	}

	public long fibonacci(int number, Type type) {
		long ans = 0;
		if (type == Type.RECURSIVE) {
			ans = fibonacci_recursive(number);
		} else if (type == Type.MEMOIZATION) {
			long memo[] = new long[number + 1];
			for (int index = 0; index < number + 1; ++index) {
				memo[index] = -1;
			}
			ans = fibonacci_memoization(number, memo);
		} else if (type == Type.TABULATION) {
			ans = fibonacci_tabulation(number);
		}
		return ans;
	}

	private long fibonacci_recursive(int number) {
		if (number == 0 || number == 1) {
			return number;
		} else {
			return fibonacci_recursive(number - 1) + fibonacci_recursive(number - 2);
		}
	}

	private long fibonacci_memoization(int number, long memo[]) {
		if (memo[number] == -1) {
			if (number == 0 || number == 1) {
				memo[number] = number;
			} else {
				memo[number] = fibonacci_memoization(number - 1, memo) + fibonacci_memoization(number - 2, memo);
			}
		}
		return memo[number];
	}

	private long fibonacci_tabulation(int number) {
		if (number == 0 || number == 1) {
			return number;
		}
		long first = 0, second = 1, result = 0;
		for (int rep = 2; rep <= number; ++rep) {
			result = first + second;
			first = second;
			second = result;
		}
		return result;
	}
}
