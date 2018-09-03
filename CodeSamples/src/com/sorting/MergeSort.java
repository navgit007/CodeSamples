package com.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int[] arr={4,6,9,1,3,0,2};
		
		System.out.println("Before Sorting"+Arrays.toString(arr));
		
		mergeSort(arr,0,arr.length-1);
		System.out.println("After Sorting"+Arrays.toString(arr));
	}

	private static void mergeSort(int[] arr, int low, int high) {
		
		if(low<high){
			
			int mid=(low+high)/2;
			
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			
			merge(arr,low,mid,high);
		}
		
	}

	private static void merge(int[] arr, int low, int mid, int high) {
       // Find length of two sub Arrays
		int n1=mid-low+1;
		int n2=high-mid;
		
		// two temp arrays
		int[] L=new int[n1];
		int[] R=new int[n2];
		// store the values
		for(int i=0;i<n1;i++){
			L[i]=arr[low+i];
		}
		for(int j=0;j<n2;j++){
			R[j]=arr[mid+1+j];
		}
		
		// Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
		int k=low;
		
		while(i<n1 && j<n2){
			
			if (L[i]<=R[j]){
				arr[k]=L[i];
				i++;
			}else{
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		
		/* Copy remaining elements of L[] if any */
		while(i<n1){
			arr[k]=L[i];
			i++;
			k++;
		}
		/* Copy remaining elements of R[] if any */
		while(j<n2){
			arr[k]=R[j];
			j++;
			k++;
		}
		
		
	}

}
