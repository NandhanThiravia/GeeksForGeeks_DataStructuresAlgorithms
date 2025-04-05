package in_04.leader;

import java.util.ArrayList;
import java.util.List;

public class Naive {
	public static void main(String[] args) {
		int[] array = { 7, 10, 4, 10, 6, 5, 2 };

		System.out.println(leader(array));
	}

	private static List<Integer> leader(int[] array) {
		List<Integer> leaderList = new ArrayList<Integer>();
		boolean isLeader = false;
		for (int index = 0; index < array.length; ++index) {
			isLeader = true;
			for (int innerIndex = index + 1; innerIndex < array.length; ++innerIndex) {
				if (array[innerIndex] >= array[index]) {
					isLeader = false;
					break;
				}
			}
			if (isLeader) {
				leaderList.add(array[index]);
			}
		}
		return leaderList;
	}

	private static void print(int[] array) {
		System.out.print("{");
		for (int index = 0; index < array.length; ++index) {
			System.out.print(array[index]);
			if (index != array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
	}
}
