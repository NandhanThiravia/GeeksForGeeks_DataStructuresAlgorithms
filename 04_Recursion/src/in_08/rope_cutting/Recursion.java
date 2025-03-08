package in_08.rope_cutting;

import java.io.IOException;

public class Recursion {
	public static void main(String[] args) throws NumberFormatException, IOException {

		int maxLength = maxRopeLength(5, 4, 2, 6, 0);

		System.out.println("Max length: " + maxLength);

	}

	private static int maxRopeLength(int n, int a, int b, int c, int length) {
		if (n < 0) {
			return -1;
		} else if (n == 0) {
			return length;
		}

//		System.out.println("Trying with a(" + a + ") n(" + n + ") length(" + length + ")");
		int length1 = maxRopeLength(n - a, a, b, c, length + 1);

//		System.out.println("Trying with b(" + b + ") n(" + n + ") length(" + length + ")");
		int length2 = maxRopeLength(n - b, a, b, c, length + 1);

//		System.out.println("Trying with c(" + c + ") n(" + n + ") length(" + length + ")");
		int length3 = maxRopeLength(n - c, a, b, c, length + 1);

		int maxLength = -1;
		if (length1 > length2) {
			if (length1 > length3) {
				maxLength = length1;
			} else {
				maxLength = length3;
			}
		} else {
			if (length2 > length3) {
				maxLength = length2;
			} else {
				maxLength = length3;
			}
		}

		return maxLength;
	}
}
