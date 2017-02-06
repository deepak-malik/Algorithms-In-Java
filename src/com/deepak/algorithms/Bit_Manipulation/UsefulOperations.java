/**
 * Algorithms-in-Java
 * UsefulOperations.java
 */
package com.deepak.algorithms.Bit_Manipulation;

import java.util.HashMap;
import java.util.Map;

/**
 * Collection of some useful operations on bits
 * 
 * @author Deepak
 */
public class UsefulOperations {

	/**
	 * Method to check if two numbers are of opposite sign
	 * 
	 * @param a - First number
	 * @param b - Second number
	 * @return {@link boolean} - True, if two numbers are of opposite sign
	 */
	public static boolean oppositeSign(int a, int b) {
		/* Take XOR of both numbers, If they both are positive, MSB will be 0 for both
		 * or if both are negative, MSB will be 1 for both. XOR of one positive and one 
		 * negative number will give negative number */
		return (a ^ b) < 0;
	}

	/**
	 * Method to find the absolute value of a number
	 * 
	 * @param a - Number
	 * @return {@link int} - Absolute value of the number
	 */
	public static int computeAbsoluteValue(int a) {
		/* Create a mask by moving 31 bits to right */
		int mask = a >> 31;
		/* Do a XOR of number + mask and mask */
		return (a + mask) ^ mask;
	}

	/**
	 * Method to add two numbers using bits 
	 * 
	 * @param a - First number
	 * @param b - Second number
	 * @return {@link int} - Result 
	 */
	public static int addTwoNumbers(int a, int b) {
		while (b != 0) {
			int carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}
		return a;
	}

	/**
	 * Method to check if a number is power of 2
	 * 
	 * @param a - Number
	 * @return {@link boolean} - True, if number is power of 2
	 */
	public static boolean ifPowerOf2(int a) {
		/* If number if zero, return false */
		if (a == 0) {
			return false;
		}
		/* if AND of a number and number - 1 is zero, it's power of 2 */
		return (a & (a - 1)) == 0;
	}

	/**
	 * Method to add 1 to a number 
	 * 
	 * @param a - Number
	 * @return {@link int} - Result 
	 */
	public static int addOne(int a) {
		return -(~a);
	}

	/**
	 * Method to find minimum of two numbers
	 * 
	 * @param a - First Number
	 * @param b - Second Number
	 * @return {@link int} - Result
	 */
	public static int findMin(int a, int b) {
		return b + ((a - b) & ((a - b) >> 31));
	}

	/**
	 * Method to find maximum of two numbers
	 * 
	 * @param a - First Number
	 * @param b - Second Number
	 * @return {@link int} - Result
	 */
	public static int findMax(int a, int b) {
		return a - (((a - b) >> 31) & 1);
	}

	/**
	 * Method to count set bits i.e 1 in a given number 
	 * 
	 * @param a - Number
	 * @return {@link int} - Result
	 */
	public static int countSetBits(int a) {
		int count = 0;
		while (a != 0) {
			a = a & (a - 1);
			count++;
		}
		return count;
	}

	/**
	 * Method to swap two numbers using bits
	 * 
	 * @param a - First Number
	 * @param b - Second Number
	 * @return {@link Map<String, Integer>} - Result
	 */
	public Map<String, Integer> swap2Integers(int a, int b) {
		Map<String, Integer> result = new HashMap<>();
		a ^= b;
		b ^= a;
		a ^= b;
		result.put("first", a);
		result.put("second", b);
		return result;
	}

	/**
	 * Method to check if a given number is even
	 * 
	 * @param a - Number
	 * @return {@link boolean} - True, if number is even
	 */
	public static boolean isEven(int a) {
		return (a & 1) == 0;
	}

	/**
	 * Method to check if a given number is odd
	 * 
	 * @param a - Number
	 * @return {@link boolean} - True, if number is odd
	 */
	public static boolean isOdd(int a) {
		return (a & 1) != 0;
	}

}
