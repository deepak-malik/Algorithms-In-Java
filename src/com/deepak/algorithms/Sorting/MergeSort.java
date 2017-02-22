/**
 * Algorithms-In-Java
 * MergeSort.java
 */
package com.deepak.algorithms.Sorting;

import java.util.Arrays;

/**
 * MergeSort Implementation
 * 
 * @author Deepak
 */
public class MergeSort {

	/**
	 * Main method to start the flow of program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] valuesToBeSorted = {7, 10, 47, 40};
		System.out.println("******************* MERGE - SORT *******************");
		int[] sortedValues = performMergeSort(valuesToBeSorted, 0, valuesToBeSorted.length - 1);
		Arrays.stream(sortedValues).forEach(System.out::println);
	}

	/**
	 * Merge Sort implementation
	 * 
	 * <p>Time Complexity</p>
	 * Whenever there are inner loops associated, complexity is n^2. In this case, 
	 * Best - O(n log(n))
	 * Average - O(n log(n))
	 * Worst - O(n log(n))
	 * 
	 * @param list - List of values to be sorted
	 * @param low - lowest index i.e 0
	 * @param high - highest index i.e list.length - 1
	 */
	public static int[] performMergeSort(int[] list, int low, int high) {
		/* If low is less then high, find the middle position,
		 * and perform merge sort on both the sides of the list.
		 * Finally, merge the two sorted parts */
		if (low < high) {
			int middle = low + (high - low) / 2;
			/* Merge sort of left side */
			performMergeSort(list, low, middle);
			/* Merge sort on right side */
			performMergeSort(list, middle + 1, high);
			merge(list, low, middle, high);
		}
		return list;
	}

	/**
	 * Method to merge a list 
	 * 
	 * @param list
	 * @param low
	 * @param middle
	 * @param high
	 * @return {@link int[]}
	 */
	private static int[] merge(int[] list, int low, int middle, int high) {
		/* Create a new copy of array and fill it with same elements */
		int[] copy = new int[list.length];
		for (int i = 0; i < list.length; i++ ) {
			copy[i] = list[i];
		}
		/* Find i, j and k */
		int i = low;
		int j = middle + 1;
		int k = low;
		/* TODO : Explain what is happening here */
		while (i <= middle && j <= high) {
			if (copy[i] <= copy[j]) {
				list[k] = copy[i];
				i++;
			} else {
				list[k] = copy[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			list[k] = copy[i];
			k++;
			i++;
		}
		return list;
	}

}
