package com.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 8, 5, 4, 3, 9, 1 };

		System.out.println("Before Sorting" + Arrays.toString(arr));
		bubbleSort1(arr);
		System.out.println("After Sorting" + Arrays.toString(arr));
		System.out.println("Before Sorting" + Arrays.toString(arr));
		//bubbleSort(arr);
		System.out.println("After Sorting" + Arrays.toString(arr));

	}
// O(n2)
	private static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// Swap
					arr[j] = arr[j] + arr[j - 1];
					arr[j - 1] = arr[j] - arr[j - 1];
					arr[j] = arr[j] - arr[j - 1];
				}
			//	System.out.println("  " + Arrays.toString(arr));
			}
		//	System.out.println("  " + Arrays.toString(arr));

		}

	}
	// O(n2) 
	private static void bubbleSort1(int[] arr){
	int n=arr.length;
	  boolean swap=true;
	  
	  while (swap){
		  swap=false;
		  for(int i=1;i<n;i++){
			  if(arr[i] < arr[i-1]){
				  //Swap
				  arr[i]=arr[i]+arr[i-1];
				  arr[i-1]=arr[i]-arr[i-1];
				  arr[i]=arr[i]-arr[i-1];
				 swap=true; 
			  }
			 
		  }
	  }
	  
	
	}

}
