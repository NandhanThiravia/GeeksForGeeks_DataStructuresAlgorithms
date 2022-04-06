package com.dynamic.programming;

import java.util.Arrays;

import com.dynamic.programming.Fibonacci.Type;

public class FiboacciTest {
	public static void main(String[] args) {
		Fibonacci obj = new Fibonacci();

		int n = 10;
		long start = 0, end = 0, ans = 0;
		
		long[] output = obj.fibonacciSeries(n);
		System.out.println(Arrays.toString(output));

		start = System.currentTimeMillis();
		ans = obj.fibonacci(n, Type.RECURSIVE);
		end = System.currentTimeMillis();
		System.out.println("RECURSIVE -> Took " + (end - start) + " ms to find result as " + ans);

		start = System.currentTimeMillis();
		ans = obj.fibonacci(n, Type.MEMOIZATION);
		end = System.currentTimeMillis();
		System.out.println("MEMOIZATION -> Took " + (end - start) + " ms to find result as " + ans);
		
		start = System.currentTimeMillis();
		ans = obj.fibonacci(n, Type.TABULATION);
		end = System.currentTimeMillis();
		System.out.println("TABULATION -> Took " + (end - start) + " ms to find result as " + ans);
	}
}
