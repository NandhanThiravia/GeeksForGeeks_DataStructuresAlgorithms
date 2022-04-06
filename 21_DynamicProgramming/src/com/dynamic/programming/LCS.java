package com.dynamic.programming;

public class LCS {
    static int memory[][];

    public static void main(String[] args) {
        String s1 = "ndnffgfgfhfmsdmdfdfdfdd";
        String s2 = "snsbdbfgfgfhfhfdfdfdnm";

        int m = s1.length();
        int n = s2.length();
        long start = 0, end = 0;

        // Normal Recursion
        start = System.currentTimeMillis();
        int lcs = lcs(s1, s2, m, n);
        end = System.currentTimeMillis();
        System.out.println("Took " + (end - start) + " ms to find result as " + lcs);

        // Dynamic Programming - Memorization
        start = System.currentTimeMillis();
        memory = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                memory[i][j] = -1;
            }
        }
        int lcs_memory = lcs_memory(s1, s2, s1.length(), s2.length());
        end = System.currentTimeMillis();
        System.out.println("Took " + (end - start) + " ms to find result as " + lcs_memory);

        // Dynamic Programming - Tabulation
        start = System.currentTimeMillis();
        int lcs_tabulation = lcs_tabulation(s1, s2, s1.length(), s2.length());
        end = System.currentTimeMillis();
        System.out.println("Took " + (end - start) + " ms to find result as " + lcs_tabulation);
    }

    public static int lcs(String s1, String s2, int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }

        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return 1 + lcs(s1, s2, m - 1, n - 1);
        } else {
            return Math.max(lcs(s1, s2, m - 1, n), lcs(s1, s2, m, n - 1));
        }
    }

	public static int lcs_memory(String s1, String s2, int m, int n) {
		if (memory[m][n] != -1) {
			return memory[m][n];
		}

		if (m == 0 || n == 0) {
			memory[m][n] = 0;
		} else {
			if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
				memory[m][n] = 1 + lcs(s1, s2, m - 1, n - 1);
			} else {
				memory[m][n] = Math.max(lcs_memory(s1, s2, m - 1, n), lcs_memory(s1, s2, m, n - 1));
			}
		}
		return memory[m][n];
	}

    public static int lcs_tabulation(String s1, String s2, int m, int n) {
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
                    db[i][j] = 1 + db[i - 1][j - 1];
                } else {
                    db[i][j] = Math.max(db[i - 1][j], db[i][j - 1]);
                }
            }
        }
        return db[m][n];
    }

}
