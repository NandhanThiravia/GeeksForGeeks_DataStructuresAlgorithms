package in_03.factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Naive {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number: ");
		
		System.out.println(factorial(Long.parseLong(br.readLine())));
	}

	private static long factorial(long n) {
		long factorial = 0;

		do {
			if (n == 0 || n == 1) {
				factorial = 1;
				break;
			}

			factorial = 1;
			for (int index = 2; index <= n; ++index) {
				factorial = factorial * index;
			}

		} while (false);
		return factorial;
	}
}
