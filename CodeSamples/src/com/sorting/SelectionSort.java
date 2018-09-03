package com.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = { 7, 5, 3, 2 };

		System.out.println("Before Sort" + Arrays.toString(arr));

		selectionSort(arr);

		System.out.println("After Sort" + Arrays.toString(arr));
		testLoop(arr);

	}

	private static void selectionSort(int[] arr) {

		int n = arr.length;

		int min = 0;

		for (int i = 0; i < n-1; i++) {
			min = i;

			for (int j = i + 1; j < n ; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			// swap arr[i] and min

			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;

		}

	}

	private static void testLoop(int[] arr) {

		int n = arr.length;
		
		System.out.println("---Bubble Sort--- j=1----j<n-i---- ");

		for (int i = 0; i < n; i++) {
			System.out.println("--i-- : " + i);

			for (int j = 1; j < n-i; j++) {
				System.out.println("  j : " + j);
			}
		}

		System.out.println("---Bubble Sort--- j=1----j<n-i---- ");

		for (int i = 0; i < n; i++) {
			System.out.println("--i-- : " + i);

			for (int j = i + 1; j < n - i; j++) {
				System.out.println("  j : " + j);
			}
		}

		System.out.println("------ j=1----j<n-i---- ");

		for (int i = 0; i < n; i++) {
			System.out.println("--i-- : " + i);

			for (int j = 1; j < n - i; j++) {
				System.out.println("  j : " + j);
			}
		}

		System.out.println("------ j=i+1----j<n---- ");

		for (int i = 0; i < n; i++) {
			System.out.println("--i-- : " + i);

			for (int j = i+1; j < n ; j++) {
				System.out.println("  j : " + j);
			}
		}
		

		System.out.println("--- i< n-1--- j=i+1----j<n---- ");

		for (int i = 0; i < n-1; i++) {
			System.out.println("--i-- : " + i);

			for (int j = i+1; j < n ; j++) {
				System.out.println("  j : " + j);
			}
		}

	}

}
