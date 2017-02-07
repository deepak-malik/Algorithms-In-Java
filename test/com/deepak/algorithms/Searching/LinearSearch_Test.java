/**
 * Algorithms-in-Java
 * LinearSearch_Test.java
 */
package com.deepak.algorithms.Searching;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for linear search
 * 
 * @author Deepak
 */
public class LinearSearch_Test {

	/**
	 * Test case for linear search
	 */
	@Test
	public void testLinearSearchForIntegers() {
		int[] listOfValues = {7, 10, 47, 40, 83, 84, 65, 61, 32, 55, 49, 46, 25, 20, 93, 63, 54, 90};
		Assert.assertTrue(LinearSearch.performLinearSearch(listOfValues, 55) == 9);
		Assert.assertTrue(LinearSearch.performLinearSearch(listOfValues, 0) == -1);
		Assert.assertTrue(LinearSearch.performLinearSearch(listOfValues, 90) == listOfValues.length - 1);
	}

}
