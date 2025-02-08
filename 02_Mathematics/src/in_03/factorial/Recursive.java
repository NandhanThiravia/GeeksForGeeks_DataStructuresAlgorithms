package in_03.factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursive {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number: ");

		System.out.println(factorial(Long.parseLong(br.readLine())));
	}

	private static long factorial(long n) {
		if (n <= 1) {
			return 1;
		}

		return n * factorial(n - 1);
	}
}
