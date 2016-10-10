/**
 * Algorithms-in-Java
 * CommonOperations.java
 */
package com.deepak.algorithms.BitManipulation;

/**
 * Collection of some common operations on bits
 * 
 * @author Deepak
 */
public class CommonOperations {
	
	/**
	 * Returns the bit present at the position, either true(1) or false(0)
	 * 
	 * @param num - Number 
	 * @param i - Position, from which bit has to be fetched
	 * @return {@link boolean} - True, if 1 is there on position, else false
	 */
	public static boolean getBit(int num, int i) {
		return ((num & (1 << i)) != 0);
	}

	/**
	 * Returns the number after updating the bit to either 0 or 1
	 * 
	 * @param num - Number
	 * @param i - Position, for which bit has to be updated
	 * @param v - Value of new bit
	 * @return {@link int} - New updated number
	 */
	public static int updateBit(int num, int i, int v) {
		int mask = ~(1 << i);
		return (num & mask) | (v << i);
	}
	
	/**
	 * Returns the number after setting the bit to 1 at given position
	 * If bit at that position is already 1, then it returns the same number
	 * 
	 * @param num - Number
	 * @param i - Position for which bit has to be set
	 * @return {@link int} - New updated number
	 */
	public static int setBit(int num, int i) {
		return num | (1 << i);
	}

	/**
	 * Returns the number after clearing the bit at given position i.e setting the bit to 0
	 * If bit at that position is already 0, then it returns the same number
	 * 
	 * @param num - Number
	 * @param i - Position for which bit has to be cleared
	 * @return {@link int} - New updated number
	 */
	public static int clearBit(int num, int i) {
		int mask = ~(1 << i);
		return num & mask;
	}

	public static int clearBitsMSBthroughI(int num, int i) {
		int mask = (1 << i) - 1;
		return num & mask;
	}

	public static int clearBitsIthrough0(int num, int i) {
		int mask = ~((1 << (i + 1)) - 1);
		return num & mask;
	}

	/**
	 * Prints the full binary number in String format
	 * 
	 * @param num - Number
	 */
	private static void toFullBinaryString(int num) {
		/* Create a display mask on the last bit */
		int displayMask = 1 << 7;
		/* Loop through all the bits and print accordingly */
		for (int bit = 1; bit <= 8; bit++) {
			System.out.print((num & displayMask) == 0 ? '0' : '1');
			num <<= 1;
			/* Create space after 4 bits */
			if ((bit % 4) == 0) {
				System.out.print(' ');
			}
		}
	}

	/**
	 * Dealing with 8 bit representation to make it simple
	 * @param args
	 */
	// TODO : Clean this up
	public static void main(String[] args) {
		int number = 21;
		System.out.println("Testing with number: " + number);
		toFullBinaryString(number);
		
		/* Get bit */
		System.out.println();
		System.out.println("\nGet Bit (Original)");
		for (int i = 7; i >= 0; i--) {
			int res = getBit(number, i) ? 1 : 0;
			System.out.print(res);
			if ((i % 4) == 0) {
				System.out.print(' ');
			}
		}
		
		/* Set bit */
		System.out.println("\n\nSetting Bit at position 3");
		int res1 = setBit(number, 3);
		toFullBinaryString(res1);

		/* Update Bit */
		System.out.println("\n\nUpdating Bit at position 2 with 0");
		int result = updateBit(number, 2, 0);
		toFullBinaryString(result);
		
		/* Clear Bit */
		System.out.println("\n\nClearing Bit at position 0");	
		int clearedBitResult = clearBit(number, 0);
		toFullBinaryString(clearedBitResult);
		
		/**/
		int number1 = 255;
		System.out.println("\n\nBinary representation of " + number1);
		toFullBinaryString(number1);
		System.out.println("\nClear bits MSB through 4");	
		int num3 = clearBitsMSBthroughI(number1, 4);
		toFullBinaryString(num3);
		
			
		int number2 = 255;
		System.out.println("\n\nBinary representation of " + number2);
		toFullBinaryString(number2);
		System.out.println("\nClear bits 3 through 0");
		int num4 = clearBitsIthrough0(number2, 3);
		toFullBinaryString(num4);
		
	}

}
