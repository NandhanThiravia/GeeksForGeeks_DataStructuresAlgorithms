package com.dynamic.programming;

public class CoinChange {

	public static void main(String[] args) {
		CoinChange obj = new CoinChange();
		int coins[] = { 2, 5, 3, 6 };
		int sum = 10;
		int count = obj.getCoinCountRecursive(coins, coins.length, sum);
		System.out.println("Coin Combination: " + count);
		
		count = obj.getCoinCountTabulation(coins, coins.length, sum);
		System.out.println("Coin Combination: " + count);
	}

	public int getCoinCountRecursive(int[] coins, int n, int sum) {
		if (sum == 0) {
			// Sum has become zero as a result of finding a successful combination, that's
			// why we are returning 1
			// If there were no right coins present then sum wouldn't have become 0
			return 1;
		}
		if (n == 0) {
			// The n has become zero because there were no right combinations, therefore
			// return 0
			return 0;
		}
		int res = getCoinCountRecursive(coins, n - 1, sum);
		if (coins[n - 1] <= sum) {
			res = res + getCoinCountRecursive(coins, n, sum - coins[n - 1]);
		}
		return res;
	}

	public int getCoinCountTabulation(int[] coins, int n, int sum) {
		int[][] table = new int[sum + 1][n + 1];
		
		// For Sum Index being 0 mark as 1 because it is Success case
		for (int index = 0; index <= n; ++index) {
			table[0][index] = 1;
		}
		
		// For Coin Index being 0 mark 0 because it is failure
		for (int index = 1; index <= sum; ++index) {
			table[index][0] = 0;
		}

		for (int sumIndex = 1; sumIndex <= sum; ++sumIndex) {
			for (int nIndex = 1; nIndex <= n; ++nIndex) {
				table[sumIndex][nIndex] = table[sumIndex][nIndex - 1];
				if (coins[nIndex - 1] <= sumIndex) {
					table[sumIndex][nIndex] += table[sumIndex - coins[nIndex - 1]][nIndex];
				}
			}
		}
		return table[sum][n];
	}
}
