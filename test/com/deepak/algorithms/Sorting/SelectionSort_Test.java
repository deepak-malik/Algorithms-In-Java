/**
 * Algorithms-In-Java
 * SelectionSort_Test.java
 */
package com.deepak.algorithms.Sorting;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for selection sort
 * 
 * @author Deepak
 */
public class SelectionSort_Test {

	/**
	 * Test case for selection sort
	 */
	@Test
	public void testSelectionSort() {
		int[] valuesToBeSorted = {7, 10, 47, 40, 83, 84, 65, 61, 32, 55, 49, 46, 25, 20, 93, 63, 54, 10};
		Assert.assertEquals(Arrays.toString(valuesToBeSorted), "[7, 10, 47, 40, 83, 84, 65, 61, 32, 55, 49, 46, 25, 20, 93, 63, 54, 10]");
		Assert.assertEquals(Arrays.toString(SelectionSort.performSelectionSort(valuesToBeSorted)), "[7, 10, 10, 20, 25, 32, 40, 46, 47, 49, 54, 55, 61, 63, 65, 83, 84, 93]");
	}

}
