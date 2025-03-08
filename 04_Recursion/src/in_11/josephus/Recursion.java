package in_11.josephus;

import java.io.IOException;

import in.common.Reader;

public class Recursion {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Reader reader = new Reader();

		System.out.print("Enter the number of people: ");
		int peopleCount = reader.readInt();

		System.out.print("Which person should be shot: ");
		int shootCounter = reader.readInt();

		System.out.println(josephus(peopleCount, shootCounter) + " is the only person remains");
	}

	private static int josephus(int peopleCount, int shootCounter) {
		if (peopleCount == 1)
			return 0;

		return (josephus(peopleCount - 1, shootCounter) + shootCounter) % peopleCount;
	}
}
