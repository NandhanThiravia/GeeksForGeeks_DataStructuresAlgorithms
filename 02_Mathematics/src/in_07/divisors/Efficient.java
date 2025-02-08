package in_07.divisors;

import java.io.IOException;
import java.util.ArrayList;

import in.common.Reader;

public class Efficient {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Reader reader = new Reader();
		Long number = reader.getLong();

		System.out.println(allDivisors(number));
	}

	public static ArrayList<Long> allDivisors(Long number) {
		ArrayList<Long> divisors = new ArrayList<Long>();

		for (Long index = 1L; index * index <= number; ++index) {
			if (number % index == 0) {
				divisors.add(index);
				if (index != number / index) {
					divisors.add(number / index);
				}
			}
		}

		return divisors;
	}
}
