package in_04.lcm;

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

		System.out.println("LCM: " + naive(a, b));
		System.out.println("LCM: " + (a * b) / gcdEuclidean(a, b));

	}

	private static long naive(long a, long b) {
		long lcm = 0;

		lcm = Math.max(a, b);

		while (true) {
			if (((lcm % a) == 0) && ((lcm % b) == 0)) {
				break;
			}
			++lcm;
		}

		return lcm;
	}

	private static long gcdEuclidean(long a, long b) {
		if (b == 0) {
			return a;
		}

		return gcdEuclidean(b, a % b);
	}
}
