package com.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {

		int[] arr ={5,7,8,2,8,6,1};
		int n=arr.length;
		System.out.println("Before Sorting" +Arrays.toString(arr));
		
		quicksort(arr,0,n-1);
		System.out.println("Before Sorting" +Arrays.toString(arr));
		
	}

	private static void quicksort(int[] arr, int low, int high) {
		
		if(low<high){
			
			int pi=partition(arr,low,high);
			
			quicksort(arr,low,pi-1);
			quicksort(arr,pi+1,high);
			
		}
		
	}

	private static int partition(int[] arr, int low, int high) {

		int pivot=arr[high];
		int i=low-1;
		
		for(int j=low;j<high;j++){
			if(pivot>=arr[j]){
				
				i++;
				//swap arr[i] && arr[j]
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		//swap arr[i+1] and arr[high]	
		
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		
		
		return i+1;
	}

	
	
}
