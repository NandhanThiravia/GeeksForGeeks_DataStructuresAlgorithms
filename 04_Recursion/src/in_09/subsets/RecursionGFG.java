package in_09.subsets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RecursionGFG {
	public static void main(String[] args) throws NumberFormatException, IOException {
		String data = "ABCDEF";
		List<String> subsets = new ArrayList<String>();

		subsets(subsets, data, 0, "");
		System.out.println(subsets);

	}

	private static void subsets(List<String> subsets, String data, int index, String current) {
		if (index == data.length()) {
			System.out.println("Added current: " + current);
			subsets.add(current);
			return;
		}

		System.out.println("1: index: " + index + " current: " + current);
		subsets(subsets, data, index + 1, current);
		System.out
				.println("2: index: " + index + " current: " + current + " data.charAt(index): " + data.charAt(index));
		subsets(subsets, data, index + 1, current + data.charAt(index));
		System.out.println("3: index: " + index + " current: " + current);
	}
}
