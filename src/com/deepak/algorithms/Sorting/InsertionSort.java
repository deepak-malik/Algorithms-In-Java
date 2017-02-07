/**
 * Algorithms-In-Java
 * InsertionSort.java
 */
package com.deepak.algorithms.Sorting;

/**
 * Insertion sort implementation
 * 
 * @author Deepak
 */
public class InsertionSort {

	/**
	 * Insertion Sort implementation
	 * <p> Question - When will you consider a list of items to be sorted?
	 * Answer - When all the elements to the left of each element are smaller then the element
	 * 
	 * This algorithm works on this principle. We start this Algorithm from index = 1, because element
	 * at index 0 is already considered as sorted since there are no elements on its left side.
	 * In this algorithm, we pick up each item and compares it to the item positioned on its left.
	 * If picked up item is smaller then the left item, then it is in wrong position. 
	 * We swap it and keep going on until the items are finished.</p>
	 * 
	 * <p>How it works?
	 * 1. Loop through the entire collection of elements n-1 times. 
	 * 	  We start with N = 1 here, as explained above (Assume first element is already sorted in the collection)
	 * 2. Loop through rest of the collection again to keep comparing each of the item
	 * 3. If item on the left is smaller then the item on the right, swap it
	 * 4. Repeat 1-3 till we get sorted collection back</p>
	 * 
	 * <p>Time Complexity</p>
	 * Whenever there are inner loops associated, complexity is n^2. In this case, 
	 * Best - O(n)
	 * Average - O(n^2)
	 * Worst - O(n^2)
	 * 
	 * @param listOfValues - List of values passed in the request
	 */
	public static int[] performInsertionSort(int[] listOfValues) {
		for (int i = 1; i < listOfValues.length; i++) {
			for (int j = i; j > 0; j--) {
				if (listOfValues[j] < listOfValues[j - 1]) {
					swap(listOfValues, j, j - 1);
				}
			}
		}
		return listOfValues;
	}

	/**
	 * Method to swap values at any two indexes
	 * 
	 * @param values
	 * @param index1
	 * @param index2
	 */
	private static void swap(int[] values, int index1, int index2) {
		int tempValue = values[index1];
		values[index1] = values[index2];
		values[index2] = tempValue;
	}

}
