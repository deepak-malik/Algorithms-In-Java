/**
 * Algorithms-in-Java
 * BinarySearch.java
 */
package com.deepak.algorithms.Searching;

/**
 * Binary search implementation
 * 
 * @author Deepak
 */
public class BinarySearch {

	/**
	 * <p>Binary Search 
	 * Few points to note here,
	 * 1. Binary search works only on sorted collection
	 * 2. Ex. Looking up a name in Telephone directory
	 * 3. Each time we make a comparison, we eliminate half of the list </p>
	 * 
	 * <p> Algorithm :
	 * 1. Find the mid index in the list and compare it with the search term
	 * 2. If search term is smaller then the element at mid index, eliminate upper half, else eliminate lower half
	 * 3. If it is equal, break the loop as we have found our element. 
	 * 4. Keep running the loop until high >= low. 
	 * 5. return index of matching item, or -1 if not found
	 * </p>
	 * 
	 * <p>Complexity :
	 * 1. Best Case : What is the fewer number of iterations to find the item?
	 * 	=> Best case is when search term is at the first try
	 * 	=> Number of comparisons in this case is 1
	 *  
	 * 2. Worst Case : What is the most number of comparisons needed to find the item?
	 * 	=> Worst case is when search term is not at all in the array
	 * 	=> If our array is of size N, we need log(2)N comparisons for worst case
	 * 
	 * 3. Average Case : On an Average, how many comparisons are needed to find the element in the array?
	 * 	=> On an average, search term is anywhere in the list
	 * </p>
	 */
	public static int performBinarySearch(int[] listOfValues, int targetValue) {
		int index = -1;
		int low = 0;
		int mid;
		int high = listOfValues.length - 1;
		while (high >= low) {
			mid = (high + low)/2;
			if (targetValue < listOfValues[mid]) { 
				high = mid - 1;
			} else if (targetValue > listOfValues[mid]) {
				low = mid + 1;
			} else {
				index = mid;
				break;
			}
		}
		return index;
	}

}
