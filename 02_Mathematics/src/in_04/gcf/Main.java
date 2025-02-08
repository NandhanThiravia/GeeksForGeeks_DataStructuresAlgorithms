package in_04.gcf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the 2 numbers:");
		System.out.print("a: ");
		long a = Long.parseLong(br.readLine());
		System.out.print("b: ");
		long b = Long.parseLong(br.readLine());

		System.out.println("GCF: " + gcdEuclidean(a, b));
		System.out.println("GCF: " + gcdEuclideanAdvanced(a, b));

	}

	private static long gcdEuclidean(long a, long b) {
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}

	private static long gcdEuclideanAdvanced(long a, long b) {
		if (b == 0) {
			return a;
		} else {
			return gcdEuclideanAdvanced(b, a % b);
		}
	}
}
