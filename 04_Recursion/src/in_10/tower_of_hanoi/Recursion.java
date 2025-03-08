package in_10.tower_of_hanoi;

import java.io.IOException;

public class Recursion {
	public static void main(String[] args) throws NumberFormatException, IOException {
		toh(4, 'A', 'B', 'C');
	}

	private static void toh(int n, char A, char B, char C) {
		if (n == 0)
			return;

		toh(n - 1, A, C, B);
		System.out.println("Move disk " + n + " from " + A + " to " + C);
		toh(n - 1, B, A, C);
	}
}
