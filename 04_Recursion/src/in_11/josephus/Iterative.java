package in_11.josephus;

import java.io.IOException;

import in.common.Reader;

public class Iterative {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Reader reader = new Reader();

		System.out.print("Enter the number of people: ");
		int peopleCount = reader.readInt();

		System.out.print("Which person should be shot: ");
		int shootCounter = reader.readInt();

		System.out.println(josephus(peopleCount, shootCounter) + " is the only person remains");
	}

	private static int josephus(int peopleCount, int shootCounter) {
		int position = 0;
		int totalPeople = 0, totalPeopleCounter = 0;
		
		/**
		 * Total People variable is a binary representation of
		 * how many people are actually present. If 4 people are there
		 * then 0,1,2,3 index positions are set
		 */
		while (totalPeopleCounter < peopleCount) {
			totalPeople = totalPeople | (1 << totalPeopleCounter);
			totalPeopleCounter = totalPeopleCounter + 1;
		}

		/**
		 * shifter variable holds the round robin counter which will
		 */
		int shifter = 0, counter = 0;
		while ((totalPeople & (totalPeople - 1)) != 0) {
			counter = shootCounter;
			while (counter > 0) {
				if ((totalPeople & (1 << shifter)) != 0) {
					counter = counter - 1;
				}

				if (counter == 0) {
					totalPeople = totalPeople ^ (1 << shifter);
				}

				shifter = (shifter + 1) % peopleCount;
			}
		}

		while (totalPeople != 1) {
			position = position + 1;
			totalPeople = totalPeople >> 1;
		}

		return position;
	}
}
