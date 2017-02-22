/**
 * Algorithms-In-Java
 * QuickSort.java
 */
package com.deepak.algorithms.Sorting;

import java.util.Arrays;

/**
 * Quick Sort Implementation
 * 
 * @author Deepak
 */
public class QuickSort {

	/**
	 * Main method to start the flow of program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] valuesToBeSorted = {7, 10, 47, 40, 83, 84, 65, 61, 32, 55, 49, 46, 25, 20, 93, 63, 54, 10};
		quickSort(valuesToBeSorted, 0, valuesToBeSorted.length - 1);
		Arrays.stream(valuesToBeSorted).forEach(n -> System.out.print(n + ", "));
	}

	/**
	 * Quick sort is a divide and conquer algorithm.
	 * 
	 * It first divides a large list into two smaller sub-lists and then recursively sort the two sub-lists.
	 * If we want to sort an array without any extra space, quick sort is a good option. On average, time complexity is O(n log(n)).
	 * <p>
	 * The basic step of sorting an array are as follows:
	 * 1. Select a pivot, normally the middle one
	 * 2. From both ends, swap elements and make left elements < pivot and all right > pivot
	 * 3. Recursively sort left part and right part
	 */
	private static void quickSort(int[] values, int low, int high) {
		/* Find middle element and pivot value */
		int middle = low + (high - low) / 2;
		int pivot = values[middle];
		/* Update low and high position */
		int i = low, j = high;
		while (i < j) {
			/* If the current value from the left list, is smaller then the pivot, move to next element */
			while (values[i] < pivot) {
				i++;
			}
			/* If the current value from the right list, is greater then the pivot, move to previous element */
			while (values[j] > pivot) {
				j--;
			}
			/* If we find a value in the left list which is larger then the pivot, 
			 * or if we find a value in the right list which is smaller then the pivot, 
			 * we swap these values. Once we are done swapping, we can increase i and decrease j */
			if (i <= j) {
				int temp = values[j];
				values[j] = values[i];
				values[i] = temp;
				i++;
				j--;
			}
			/* Apply quick sort on both left and right*/
			if (low < j) {
				quickSort(values, low, j);
			}
			if (high > i) {
				quickSort(values, i, high);
			}
		}
	}

}
