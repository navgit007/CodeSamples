package com.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr={8,4,5,2,1,9,0};
		
		System.out.println("Before Sort"+Arrays.toString(arr));
		
		insertion_sort(arr);
		
		System.out.println("After Sort"+Arrays.toString(arr));
		
	}

	private static void insertion_sort(int[] arr){
		
		int n=arr.length;
		
		for(int i=1;i<n;i++){
		    int key=arr[i];
			int j=i-1;
		 
		 while(j>=0 && arr[j]>key){
			 arr[j+1]=arr[j];
			 j--;
		 }
		
		 arr[j+1]=key;
			
		}
	}
}
