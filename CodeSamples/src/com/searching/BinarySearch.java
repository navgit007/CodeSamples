package com.searching;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 4, 5, 7, 8, 9, 2, 6 };

		Arrays.asList(arr);
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		// Iterative Way
		System.out.println(binary_Search(arr, 2));
		// Java Inbuilt method static function
		System.out.println(Arrays.binarySearch(arr, 112));
		// Java recursive way
		System.out.println(binarySearch(arr, 0, arr.length - 1, 9));

	}

	/*
	 * Iterative method O(logn)
	 */
	private static int binary_Search(int[] arr, int target) {

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {

			int mid = low + (high - low) / 2;
			System.out.println("low = " + low + " mid = " + mid + " high =" + high);
			if (arr[mid] == target) {
				return mid;
			}
			if (arr[mid] < target) {
				low = mid + 1;

			} else {
				high = mid - 1;
			}

			// System.out.println("low = " + low + " high =" + high);
		}
		return -1;
	}

	/*
	 * Recursive way O(logn)
	 */
	private static int binarySearch(int[] arr, int low, int high, int target) {

		if (low <= high) {

			int mid = low + (high - low) / 2;

			if (arr[mid] == target) {
				return mid;
			}

			if (arr[mid] < target) {
				return binarySearch(arr, mid + 1, high, target);
			} else {
				return binarySearch(arr, low, mid - 1, target);
			}

		}

		return -1;
	}

}
