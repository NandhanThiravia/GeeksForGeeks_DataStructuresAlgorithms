package in_06.power_set;

import java.util.ArrayList;
import java.util.List;

public class Best {
	public static void main(String[] args) {
		String inputString = "abcdef";

		System.out.println("Power Sets for \"" + inputString + "\":\n" + powerSets(inputString));
	}

	private static List<String> powerSets(String inputString) {
		List<String> powerSets = new ArrayList<String>();
		powerSets.add("");

		int total = (int) Math.pow(2, inputString.length());
		for (int counter = 1; counter < total; ++counter) {
			powerSets.add(getCombination(counter, inputString));
		}

		return powerSets;
	}

	private static String getCombination(int number, String inputString) {
		StringBuffer combinationBuilder = new StringBuffer();
		for (int bitPosition = 0; bitPosition < inputString.length(); ++bitPosition) {
			if ((number & (1 << bitPosition)) != 0) {
				combinationBuilder.append(inputString.charAt(bitPosition));
			}
		}
		return combinationBuilder.toString();
	}
}
