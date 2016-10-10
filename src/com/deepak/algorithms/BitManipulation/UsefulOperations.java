package com.deepak.algorithms.BitManipulation;

public class UsefulOperations {
	
	public static void main(String[] args) {
		System.out.println(oppositeSign(-23, 25));
		System.out.println(addTwoNumbers(23, 25));
		System.out.println(ifPowerOf2(16));
		System.out.println(addOne(3));
		swap2Integers(23, 31);
	}
	
	/**
	 * Checks if two numbers are of opposite sign
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
	
	public static int computeAbsoluteValue(int a) {
		int mask = a >> 31;
		return (a + mask) ^ mask;
	}
	
	public static int addTwoNumbers(int a, int b) {
		while (b != 0) {
			int carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}
		return a;
	}
	
	public static boolean ifPowerOf2(int a) {
		if (a == 0) {
			return false;
		}
		return (a & (a - 1)) == 0;
	}
	
	public static int addOne(int a) {
		return -(~a);
	}
	
	public static int findMin(int a, int b) {
		return b + ((a - b) & ((a - b) >> 31));
	}
	
	public static int findMax(int a, int b) {
		return a - (((a - b) >> 31) & 1);
	}
	
	public static int countSetBits(int a) {
		int count = 0;
		while (a != 0) {
			a = a & (a - 1);
			count++;
		}
		return count;
	}
	
	public static void swap2Integers(int a, int b) {
		a ^= b;
		b ^= a;
		a ^= b;
		System.out.println("A = " + a + ", B = " + b);
	}
	
	public static boolean isEven(int a) {
		return (a & 1) == 0;
	}

}
