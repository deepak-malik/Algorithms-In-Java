/**
 * Algorithms-in-Java
 * CommonOperations.java
 */
package com.deepak.algorithms.Bit_Manipulation;

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
	 * Returns the number after toggling a specific bit
	 * 
	 * @param num - Number
	 * @param i - Position of bit
	 * @return {@link int}
	 */
	public static int toggleBit(int num, int i) {
		return num ^ (1 << i);
	}

	/**
	 * Method to clear most significant bits through I
	 * 
	 * @param num - Number
	 * @param i - Position of the bit
	 * @return {@link int} - New updated number
	 */
	public static int clearMSBthroughI(int num, int i) {
		int mask = (1 << i) - 1;
		return num & mask;
	}

	/**
	 * Method to clear least significant bits through I
	 *  
	 * @param num - Number
	 * @param i - Position of the bit
	 * @return {@link int} - New updated number
	 */
	public static int clearLSBthroughI(int num, int i) {
		int mask = ~((1 << (i + 1)) - 1);
		return num & mask;
	}

	/**
	 * Prints the integer number into binary string format
	 * 
	 * @param num
	 * @return {@link String}
	 */
	public static String toFullBinaryString(int num) {
		StringBuilder builder = new StringBuilder();
		/* Create a display mask on the last bit */
		int displayMask = 1 << 7;
		/* Loop through all the bits and print accordingly */
		for (int bit = 1; bit <= 8; bit++) {
			builder.append((num & displayMask) == 0 ? '0' : '1');
			num <<= 1;
			/* Create space after 4 bits */
			if ((bit % 4) == 0) {
				builder.append(' ');
			}
		}
		return builder.toString().trim();
	}

}
