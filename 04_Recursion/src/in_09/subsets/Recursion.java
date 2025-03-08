package in_09.subsets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Recursion {
	public static void main(String[] args) throws NumberFormatException, IOException {
		String data = "ABC";
		List<String> subsets = new ArrayList<String>();
		subsets.add("");

		subsets(data, 0, subsets);
		System.out.println(subsets);

	}

	private static void subsets(String data, int index, List<String> subsets) {
		if (index >= data.length()) {
			return;
		}

		List<String> newSubsets = new ArrayList<String>();
		for (String subset : subsets) {
			newSubsets.add(subset + data.charAt(index));
		}

		subsets.addAll(newSubsets);

		subsets(data, index + 1, subsets);
	}

}
