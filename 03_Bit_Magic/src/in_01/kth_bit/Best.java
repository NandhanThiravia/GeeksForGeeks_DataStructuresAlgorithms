package in_01.kth_bit;

import java.io.IOException;

import in.common.Reader;

public class Best {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Reader reader = new Reader();
		System.out.print("Enter the number: ");
		int number = reader.readInt();
		System.out.print("Enter the position: ");
		int position = reader.readInt();
		System.out.println("Is " + position + "th set in " + number + "? " + isKthBitSet(number, position));
	}
	
	public static boolean isKthBitSet(int number, int position) {
		boolean isSet = false;
		
		if ((number & (1 << position)) != 0) {
			isSet = true;
		}
		
		return isSet;
	}
}
