package com.deepak.algorithms.Sorting;

import java.util.Arrays;

/**
 * Algorithms-In-Java
 * InsertionSort_Test.java
 */
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Insertion sort
 * 
 * @author Deepak
 */
public class InsertionSort_Test {

	/**
	 * Test case for insertion sort
	 */
	@Test
	public void testInsertionSort() {
		int[] valuesToBeSorted = {7, 10, 47, 40, 83, 84, 65, 61, 32, 55, 49, 46, 25, 20, 93, 63, 54, 10};
		Assert.assertEquals(Arrays.toString(valuesToBeSorted), "[7, 10, 47, 40, 83, 84, 65, 61, 32, 55, 49, 46, 25, 20, 93, 63, 54, 10]");
		Assert.assertEquals(InsertionSort.performInsertionSort(valuesToBeSorted), "[7, 10, 10, 20, 25, 32, 40, 46, 47, 49, 54, 55, 61, 63, 65, 83, 84, 93]");
	}

}
