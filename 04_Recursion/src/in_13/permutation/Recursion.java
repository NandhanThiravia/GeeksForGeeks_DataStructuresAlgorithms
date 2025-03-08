package in_13.permutation;

import java.util.ArrayList;
import java.util.List;

public class Recursion {
	public static void main(String[] args) {
		String data = "ABCD";
		List<String> list = new ArrayList<String>();
		permutation(data, 0, list);

		System.out.println(list);
	}

	private static void permutation(String data, int index, List<String> list) {
		if (index == data.length() - 1) {
			list.add(data);
			return;
		}

		for (int innerIndex = index; innerIndex < data.length(); ++innerIndex) {
			data = swap(data, index, innerIndex);
			permutation(data, index + 1, list);
			data = swap(data, index, innerIndex);
		}

	}

	private static String swap(String data, int index1, int index2) {
		char[] dataArray = data.toCharArray();

		char t = dataArray[index1];
		dataArray[index1] = dataArray[index2];
		dataArray[index2] = t;

		return new String(dataArray);
	}
}
