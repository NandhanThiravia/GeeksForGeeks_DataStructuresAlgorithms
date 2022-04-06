package com.dynamic.programming;

import java.util.ArrayList;
import java.util.List;

public class LCS_Letters {
	public static void main(String[] args) {
		String s1 = "nandhan";
		String s2 = "nh";

		// Dynamic Programming - Tabulation
		long start = 0, end = 0;
		start = System.currentTimeMillis();
		List<Character> lcs_list = new ArrayList<>();
		int lcs_tabulation = lcs_tabulation(s1, s2, s1.length(), s2.length(), lcs_list);
		end = System.currentTimeMillis();
		System.out.println("Took " + (end - start) + " ms to find result as " + lcs_tabulation);
		System.out.println(lcs_list);
	}

	public static int lcs_tabulation(String s1, String s2, int m, int n, List<Character> lcs_list) {
		int counter = 0;
		int db[][] = new int[m + 1][n + 1];
		for (int i = 0; i <= m; ++i) {
			db[i][0] = 0;
		}
		for (int i = 0; i <= n; ++i) {
			db[0][i] = 0;
		}

		for (int i = 1; i <= m; ++i) {
			for (int j = 1; j <= n; ++j) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					if (counter == db[i - 1][j - 1]) {
						++counter;
						lcs_list.add(s1.charAt(i - 1));
					}
					db[i][j] = 1 + db[i - 1][j - 1];
					System.out.println(s1.charAt(i - 1) + " " + db[i][j]);
				} else {
					db[i][j] = Math.max(db[i - 1][j], db[i][j - 1]);
				}
			}
		}
		return db[m][n];
	}
}
