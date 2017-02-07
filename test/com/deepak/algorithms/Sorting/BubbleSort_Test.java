/**
 * Algorithms-In-Java
 * BubbleSort_Test.java
 */
package com.deepak.algorithms.Sorting;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Bubble sort
 * 
 * @author Deepak
 */
public class BubbleSort_Test {
	
	/**
	 * Test case for bubble sort
	 */
	@Test
	public void testBubbleSort() {
		Integer[] valuesToBeSorted = {7, 10, 47, 40, 83, 84, 65, 61, 32, 55, 49, 46, 25, 20, 93, 63, 54, 10};
		Assert.assertEquals(Arrays.toString(valuesToBeSorted), "[7, 10, 47, 40, 83, 84, 65, 61, 32, 55, 49, 46, 25, 20, 93, 63, 54, 10]");
		Assert.assertEquals(Arrays.toString(BubbleSort.performBubbleSort(valuesToBeSorted)), "[7, 10, 10, 20, 25, 32, 40, 46, 47, 49, 54, 55, 61, 63, 65, 83, 84, 93]");
	}

}
