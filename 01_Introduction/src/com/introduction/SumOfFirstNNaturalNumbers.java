package com.introduction;

public class SumOfFirstNNaturalNumbers {

	public static void main(String[] args) {
		SumOfFirstNNaturalNumbers obj = new SumOfFirstNNaturalNumbers();
		int n = 5000;
		System.out.println("1. Sum of first " + n + " natural number is " + obj.sum1(n));
		System.out.println("2. Sum of first " + n + " natural number is " + obj.sum2(n));
		System.out.println("3. Sum of first " + n + " natural number is " + obj.sum3(n));
	}

	/**
	 * Here it is a Formula based.
	 * 
	 * The operations performed here are addition, multiplication and then division.
	 * We can either consider all 3 operations individually or can be considered all
	 * together, in either of the cases the time taken to perform these operations
	 * is considered to be a constant.
	 * 
	 * Time taken for this operation is a constant Time = c1
	 * 
	 * The Order of growth is Constant.
	 * 
	 * @param n
	 * @return
	 */
	private int sum1(int n) {
		return (n * (n + 1)) / 2;
	}

	/**
	 * Here it is a For Loop.
	 * 
	 * The operation "sum += i" in the "for" loop is happening n times, if the time taken is c2, then
	 * the total operation cost is c2n and the other initialization variables are happening in a constant time c3
	 * 
	 * Time = c2n + c3
	 * 
	 * The Order of growth is Linear.
	 * 
	 * @param n
	 * @return
	 */
	private int sum2(int n) {
		int sum = 0;
		if (n == 0 || n == 1) {
			return n;
		}

		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	/**
	 * Here it is a Nested For Loop.
	 * 
	 * The operation "++sum" is happening n^2 times, hence the total operation cost is c4n^2, few operations
	 * such as "j = 1" in the inner for loop is happening n times, so the total cost of that is c5n, and few
	 * initialization variables are running constant time c6.
	 * 
	 * Time = c4n^2 + c5n + c6
	 * 
	 * The Order of growth is Quadratic.
	 * 
	 * @param n
	 * @return
	 */
	private int sum3(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				++sum;
			}
		}
		return sum;
	}

}
