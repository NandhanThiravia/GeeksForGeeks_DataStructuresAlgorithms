package in_08.rope_cutting;

import java.io.IOException;

public class RecursionGFG {
	public static void main(String[] args) throws NumberFormatException, IOException {

		int maxLength = maxRopeLength(5, 2, 1, 5);

		System.out.println("Max length: " + maxLength);

	}

	private static int maxRopeLength(int n, int a, int b, int c) {
		if (n < 0) {
			return -1;
		} else if (n == 0) {
			return 0;
		}

//		System.out.println("Trying with a(" + a + ") n(" + n + ") length(" + length + ")");
		int length1 = maxRopeLength(n - a, a, b, c);

//		System.out.println("Trying with b(" + b + ") n(" + n + ") length(" + length + ")");
		int length2 = maxRopeLength(n - b, a, b, c);

//		System.out.println("Trying with c(" + c + ") n(" + n + ") length(" + length + ")");
		int length3 = maxRopeLength(n - c, a, b, c);

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

		if (maxLength == -1) {
			// If there is no sequence then return -1, do not add 1 to it
			return maxLength;
		} else {
			return maxLength + 1;
		}
	}
}
