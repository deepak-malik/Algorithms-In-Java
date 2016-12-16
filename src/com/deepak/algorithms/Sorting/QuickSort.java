/**
 * Class for InsertionSort implementation
 *
 * Created by Amar Veerepalli
 */
package com.deepak.algorithms.Sorting;

import java.util.Arrays;


public class QuickSort {

    public static void main(String[] args) {
        int[] valuesToBeSorted = {7, 10, 47, 40, 83, 84, 65, 61, 32, 55, 49, 46, 25, 20, 93, 63, 54, 10};
        quickSort(valuesToBeSorted, 0, valuesToBeSorted.length - 1);
        Arrays.stream(valuesToBeSorted).forEach(n -> System.out.print(n + ","));

    }

    /**
     * Quicksort is a divide and conquer algorithm.
     * It first divides a large list into two smaller sub-lists and then recursively sort the two sub-lists.
     * If we want to sort an array without any extra space, quicksort is a good option. On average, time complexity is O(n log(n)).
     * <p>
     * The basic step of sorting an array are as follows:
     * <p>
     * Select a pivot, normally the middle one
     * From both ends, swap elements and make left elements < pivot and all right > pivot
     * Recursively sort left part and right part
     */
    private static void quickSort(int[] numbers, int low, int high) {
        int middle = low + (high - low) / 2;
        int pivot = numbers[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i < j) {
            // If the current value from the left list is smaller then the pivot, then get the next element from the left list
            while (numbers[i] < pivot) {
                i++;
            }

            // If the current value from the right list is larger then the pivot, then get the next element from the right list
            while (numbers[j] > pivot) {
                j--;
            }

            // If we have found a values in the left list which is larger then
            // the pivot element and if we have found a value in the right list
            // which is smaller then the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                int temp = numbers[j];
                numbers[j] = numbers[i];
                numbers[i] = temp;
                i++;
                j--;
            }
            if (low < j)
                quickSort(numbers, low, j);

            if (high > i)
                quickSort(numbers, i, high);


        }
    }
}
