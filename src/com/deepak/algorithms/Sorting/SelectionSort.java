/**
 * Algorithms-In-Java
 * SelectionSort.java
 */
package com.deepak.algorithms.Sorting;

import com.deepak.algorithms.Library.ArrayUtils;

/**
 * Selection Sort implementation
 * 
 * @author Deepak
 */
public class SelectionSort {

	/**
	 * Selection Sort implementation
	 * <p> This Algorithm divides the array into two imaginary arrays i.e one with sorted elements, 
	 * and other one with unsorted elements. Initially sorted array will be empty, while unsorted
	 * one contains the whole array.
	 * At every step algorithm finds minimal element from the unsorted array and adds it to the end
	 * of sorted one. When unsorted part becomes empty algorithm stops</p>
	 * 
	 * <p>How it works?
	 * 1. Loop through the entire collection of elements n-1 times. 
	 * 	  We need n-1 passes here because second last pass will sort entire collection.  
	 * 2. Assume first element is the smallest one in the collection.
	 * 3. Loop through rest of the unsorted collection and find the minimum element.
	 * 	  If found, replace it with the minimum we choose at the beginning.
	 * 4. Keep doing it until we finish the inner loop i.e all unsorted elements.
	 * 5. Now, swap the minimum value with the value from where parent loop started
	 * 6. Repeat 2-5 till we get sorted collection back</p>
	 * 
	 * <p>Time Complexity</p>
	 * Whenever there are inner loops associated, complexity is n^2. In this case, 
	 * Best - O(n^2)
	 * Average - O(n^2)
	 * Worst - O(n^2)
	 * 
	 * @param listOfValues - List of values passed in the request
	 */
	public static Integer[] performSelectionSort(Integer[] listOfValues) {
		for (int i = 0; i < listOfValues.length - 1; i++) {
			int minValue = listOfValues[i];
			for (int j = i + 1; j < listOfValues.length; j++) {
				if (listOfValues[j] < minValue) {
					minValue = listOfValues[j];
					ArrayUtils.swap(listOfValues, i, j);
				}
			}
		}
		return listOfValues;
	}

}
