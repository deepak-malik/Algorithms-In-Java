/**
 * Algorithms-in-Java
 * LinearSearch.java
 */
package com.deepak.algorithms.Searching;

/**
 * Linear Search implementation
 * 
 * @author Deepak
 */
public class LinearSearch {

	/**
	 * <p>Linear Search is also called Sequential Search
	 * Few point to note here, 
	 * 1. It can be really slow with large number of elements in the collection
	 * 	ex. If we have 1000000 items in the list, on an average it will take 500000 number of comparisons
	 * 2. To be used when we are not sure about the sort order of the list. </p>
	 * 
	 * <p>Algorithm :
	 * 1. Loop through each item in the list
	 * 2. Compare search term to the current item in the list
	 * 3. If matches, save index of the matching item and break
	 * 4. return index of matching item, or -1 if not found
	 * </p>
	 * 
	 * <p>Complexity :
	 * 1. Best Case : What is the fewer number of iterations to find the item?
	 * 	=> Best case is when search term is at the first slot of the array
	 * 	=> Number of comparisons in this case is 1
	 *  
	 * 2. Worst Case : What is the most number of comparisons needed to find the item?
	 * 	=> Worst case is when search term is at the last slot of the array or not at all in the array
	 * 	=> If our array is of size N, we need N comparisons for worst case
	 * 
	 * 3. Average Case : On an Average, how many comparisons are needed to find the element in the array?
	 * 	=> On an average, search term will be in the middle of the array
	 * 	=> For an array of size N, number of comparisons will be N/2
	 * </p>
	 */
	public static int performLinearSearch(int[] listOfValues, int targetValue) {
		int index = -1;
		for (int i=0; i < listOfValues.length; i++) {
			if (listOfValues[i] == targetValue) {
				index = i;
				break;
			}
		}
		return index;
	}

}
