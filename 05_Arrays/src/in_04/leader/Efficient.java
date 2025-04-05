package in_04.leader;

import java.util.ArrayList;
import java.util.List;

public class Efficient {
	public static void main(String[] args) {
		int[] array = { 7, 10, 4, 10, 6, 5, 2 };

		System.out.println(leader(array));
	}

	private static List<Integer> leader(int[] array) {
		List<Integer> leaderList = new ArrayList<Integer>();

		int max = array[array.length - 1];
		leaderList.addFirst(max);
		for (int index = array.length - 2; index >= 0; --index) {
			if (array[index] > max) {
				max = array[index];
				leaderList.addFirst(max);
			}
		}
		return leaderList;
	}
}
