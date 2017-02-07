/**
 * Algorithms-In-Java
 * ArrayUtils.java
 */
package com.deepak.algorithms.Library;

/**
 * Utility class for array related operations
 * 
 * @author Deepak
 */
public abstract class ArrayUtils {

	/**
	 * Method to swap values in a array when two indexes are given
	 * 
	 * @param values
	 * @param index1
	 * @param index2
	 */
	public static <T> void swap(T[] values, int index1, int index2) {
		T temp = values[index1];
		values[index1] = values[index2];
		values[index2] = temp;
	}

}
