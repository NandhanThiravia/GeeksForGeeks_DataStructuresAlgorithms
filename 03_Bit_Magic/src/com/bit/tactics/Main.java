package com.bit.tactics;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Main obj = new Main();
//		int number = 8;
//		int position = 3;

//		obj.printBinaryForm(number);
//		number = obj.findMSB(number);
//		System.out.println(number);

//		System.out.println(obj.countSetBits(number));
//		System.out.println(obj.countSetBitsEnhanced(number));
//		System.out.println(obj.isPowerOf2(number));

//		int array[] = { 1, 1, 2, 2, 3, 3, 7 };
//		System.out.println(obj.findOneOddOccurring(array));

//		int array[] = { 1, 3, 4 };
//		System.out.println(obj.findMissingNumber(array));

//		int array[] = { 3, 4, 3, 4, 5, 4, 4, 6, 7, 7, 5, 11 };
//		ArrayList<Integer> list = obj.findTwoOddOccurring(array);
//		System.out.println(list);

		String word = "abc";
		System.out.println(obj.combinations(word));

//		int number = 6636;
//		obj.printBinaryForm(number);
//		System.out.println(obj.findRightMostSetBit(number));

//		int m = 8, n = 4;
//		System.out.println(obj.findRightMostDifferentBit(m, n));

//		int n = 17;
//		System.out.println(obj.countSetBitsSeries(n));
//		System.out.println(obj.countSetBitsSeriesEnhanced(n));

//		int m = 11, n = 12;
//		obj.printBinaryForm(m);
//		obj.printBinaryForm(n);
//		System.out.println(obj.findBitDifference(m, n));

//		int number = 6567378;
//		obj.printBinaryForm(number);
//		System.out.println(obj.isSparse(number));

//		int number = 21;
//		obj.printBinaryForm(number);
//		System.out.println(obj.findLongestConsecutiveOnes(number));

//		int number = 7;
//		obj.printBinaryForm(number);
//		System.out.println(obj.convertToGrayCode(number));

//		int[] array = { 4, 8, 12, 16 };
//		System.out.println(obj.maxAND(array));

//		int[] arr = { 9, 12, 2, 11, 2, 2, 10, 9, 12, 10, 9, 11, 2 };
//		System.out.println(obj.fun(arr, arr.length));
	}

	private int maxAND(int[] array) {
		int result = 0;

		for (int bitIndex = 31; bitIndex >= 0; --bitIndex) {
			if (isPairAvailable(result | (1 << bitIndex), array)) {
				result = result | (1 << bitIndex);
			}
		}

		return result;
	}

	private boolean isPairAvailable(int result, int[] array) {
		boolean isAvailable = false;
		int count = 0;
		for (int index = 0; index < array.length; ++index) {
			if ((result & array[index]) == result) {
				++count;
			}
		}

		if (count >= 2) {
			isAvailable = true;
		}
		return isAvailable;
	}

	private int swapOddEvenBits(int n) {
		// Get all even bits of x
		int even_bits = n & 0xAAAAAAAA;

		// Get all odd bits of x
		int odd_bits = n & 0x55555555;

		// Right shift even bits
		even_bits >>= 1;

		// Left shift even bits
		odd_bits <<= 1;

		// Combine even and odd bits
		return (even_bits | odd_bits);
	}

	private int binaryToGrayCode(int n) {
		return (n ^ (n >> 1));
	}

	private int grayToBinary(int n) {
		int res = n;

		while (n > 0) {
			n >>= 1;
			res ^= n;
		}

		return res;
	}

	// Find the length of the longest consecutive 1s in its binary representation.
	private int findLongestConsecutiveOnes(int number) {
		int count = 0;

		while (number != 0) {
			// This operation reduces length of every sequence of 1s by one.
			number = (number & (number << 1));
			count++;
		}

		return count;
	}

	// The task is to check whether it is sparse or not. A number
	// is said to be a sparse number if no two or more consecutive bits are set in
	// the binary representation.
	private boolean isSparse(int number) {
		return ((number & (number >> 1)) == 0);
	}

	// Find the number of bits that are required to be flipped in order to make it
	// look like the other.
	private int findBitDifference(int m, int n) {
		int count = 0;

		int number = m ^ n;
		while (number != 0) {
			++count;

			// Unset the right most significant bit instantly
			number = number & (number - 1);
		}
		return count;
	}

	// Find the number of bits set in all the number from 1 to n (Faster)
	public int countSetBitsSeriesEnhanced(int n) {
		int count = 0;
		int powerOf2 = 2;
		int pairs = 0;

		n += 1;
		count = n / 2;
		while (powerOf2 <= n) {
			pairs = n / powerOf2;
			count += (pairs / 2) * powerOf2;
			count += (pairs % 2 == 1) ? (n % powerOf2) : 0;

			powerOf2 = powerOf2 << 1;
		}

		return count;
	}

	// Find the number of bits set in all the number from 1 to n
	public int countSetBitsSeries(int n) {
		int count = 0;
		int number = 0;
		for (int index = 1; index <= n; ++index) {
			number = index;
			while (number != 0) {
				if ((number & 1) != 0) {
					++count;
				}
				number = number >> 1;
			}
		}
		return count;
	}

	public int findRightMostDifferentBit(int m, int n) {
		int number = m ^ n;
		if (number == 0) {
			return -1;
		}

		int position = 1;
		while (number != 0) {
			if ((number & 1) != 0) {
				break;
			}
			number >>= 1;
			++position;
		}
		return position;
	}

	// Find the position of the rightmost set bit
	public int findRightMostSetBit(int number) {
		if (number == 0) {
			return 0;
		}

		number = number & ~(number - 1);
		int position = 1;
		while ((number = number >> 1) != 0)
			++position;
		return position;
	}

	public ArrayList<String> combinations(String data) {
		long start = System.currentTimeMillis();
		ArrayList<String> combinations = new ArrayList<>();
		char[] dataArray = data.toCharArray();
		int length = dataArray.length;
		int max = (int) (Math.pow(2, length) - 1);

		StringBuilder sb = new StringBuilder();
		for (int number = 0; number <= max; ++number) {
			for (int position = 0; position < length; ++position) {
				if ((number & (1 << position)) != 0) {
					sb.append(dataArray[position]);
				}
			}
			combinations.add(sb.toString());
			sb.setLength(0);
		}

		return combinations;
	}

	public ArrayList<Integer> findTwoOddOccurring(int[] array) {
		if (array.length <= 0) {
			return null;
		}
		int number = 0;
		for (int index = 0; index < array.length; ++index) {
			number = number ^ array[index];
		}

		// Find Right most bit
		int interim = number & ~(number - 1);

		ArrayList<Integer> result = new ArrayList<>();
		int number1 = 0, number2 = 0;
		for (int index = 0; index < array.length; ++index) {
			if ((array[index] & interim) != 0) {
				number1 = number1 ^ array[index];
			} else {
				number2 = number2 ^ array[index];
			}
		}

		result.add(number1);
		result.add(number2);

		return result;
	}

	public int findMissingNumber(int[] array) {
		int number = 0;
		for (int index = 0; index < array.length; ++index) {
			number = number ^ array[index];
		}

		for (int index = 1; index <= array.length + 1; ++index) {
			number = number ^ index;
		}
		return number;
	}

	public int findOneOddOccurring(int[] array) {
		if (array.length <= 0) {
			return -1;
		}
		int number = 0;
		for (int index = 0; index < array.length; ++index) {
			number = number ^ array[index];
		}
		return number;
	}

	public boolean isPowerOf2(int number) {
		return ((number != 0) && ((number & (number - 1)) == 0));
	}

	public int countSetBitsEnhanced(int number) {
		int countSetBits = 0;
		while (number != 0) {
			number = number & (number - 1);
			++countSetBits;
		}
		return countSetBits;
	}

	public int countSetBits(int number) {
		int countSetBits = 0;
		while (number != 0) {
			countSetBits = ((number & 1) != 0) ? (countSetBits + 1) : countSetBits;
			number = number >>> 1;
		}
		return countSetBits;
	}

	// Find the most significant set bit in the given number
	public int findMSB(int number) {
		int index = -1;
		while (number != 0) {
			number >>= 1;
			++index;
		}
		return index;
	}

	// Flip Bits of the number
	public int flipBits(int number) {
		int temp = number;
		int length = 0;
		while (temp > 0) {
			++length;
			temp = temp >> 1;
		}
		if (length <= 0) {
			return -1;
		}

		temp = 0;
		while (length > 0) {
			temp = temp << 1;
			temp = temp | 1;
			length -= 1;
		}
		return (number ^ temp);
	}

	// Find log base 2 of a 32 bit integer
	public int logBase2(int number) {
		int res = 0;
		while ((number = number >> 1) != 0)
			++res;
		return res;
	}

	// Multiply by 2
	public int multiplyBy2(int number) {
		return (number << 1);
	}

	// Divide by 2
	public int divideBy2(int number) {
		return (number >> 1);
	}

	// Checking if bit at nth position is set or unset
	public boolean isBitSet(int position, int number) {
		return (((1 << position) & number) != 0) ? true : false;
	}

	// Toggling a bit at nth position
	public int toggleBit(int position, int number) {
		return ((1 << position) ^ number);
	}

	// How to unset/clear a bit at n'th position in the number 'num'
	public int unsetBit(int position, int number) {
		return (~(1 << position) & number);
	}

	// How to set a bit in the number 'num'
	public int setBit(int position, int number) {
		return number | (1 << position);
	}

	public void printBinaryForm(int number) {
		int temp = number;
		StringBuilder sb = new StringBuilder();
		int bit = 0;
		for (int index = 0; index < Integer.SIZE; ++index) {
			bit = (number >> index) & 1;
			if (index % 4 == 0) {
				sb.insert(0, " ");
			}
			sb.insert(0, bit);
		}
		System.out.println(temp + " => " + sb.toString());
	}
}
