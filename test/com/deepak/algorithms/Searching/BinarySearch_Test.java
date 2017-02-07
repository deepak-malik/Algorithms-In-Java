/**
 * Algorithms-in-Java
 * BinarySearch_Test.java
 */
package com.deepak.algorithms.Searching;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for binary search
 * 
 * @author Deepak
 */
public class BinarySearch_Test {

	/**
	 * Test cases for Binary Search
	 */
	@Test
	public void testBinarySearch() {
		int[] listOfValues = {7, 10, 17, 20, 23, 24, 35, 41, 42, 55, 59, 66, 75, 80, 83, 93, 94, 100};
		Assert.assertTrue(BinarySearch.performBinarySearch(listOfValues, 55) == 9);
		Assert.assertTrue(BinarySearch.performBinarySearch(listOfValues, 0) == -1);
		Assert.assertTrue(BinarySearch.performBinarySearch(listOfValues, 100) == listOfValues.length - 1);
	}

}
