package com.searching;

import java.util.Arrays;

public class TernarySearch {

	public static void main(String[] args) {

		int[] arr={5,7,1,3,9,0,2};
		
		Arrays.sort(arr);
		int n=arr.length;
		System.out.println(ternarySearch(arr,0,n,7));
		System.out.println(binary_search(arr,0,n,7));
		System.out.println(binary_search1(arr,0,n,7));
			
		
	}
 // O(logn)
	private static int ternarySearch(int[] arr, int low, int high,int target) {

		if(low<=high){
			int mid1=low+(high-low)/3;
			int mid2=low+ 2*(high-low)/3;
			
			if (arr[mid1]==target){
				return mid1;
			}
			if (arr[mid2]==target){
				return mid2;
			}
			if (target <arr[mid1] ){
				
				return ternarySearch(arr,low,mid1-1,target);
			} else if (target >arr[mid2]){
				return ternarySearch(arr,mid2+1,high,target);
			}else{
				 return ternarySearch(arr,mid1+1,mid2-1,target);
			}
			
				
			
		}
		
		return -1;
	}
	
	 // O(logn)
	private static int binary_search(int[] arr,int low,int high,int target){
		if (low<=high){
			
			int mid=low + (high-low)/2;
			
			if (arr[mid]==target)
				return mid;
			
			if (target<arr[mid]){
				return binary_search(arr, low, mid-1, target);
			}else {
				return binary_search(arr, mid+1, high, target);
			}
		}
		
		return -1;
	}
	
	 // O(logn)
	private static int binary_search1(int[] arr,int low,int high,int target){
		
		while(low<=high){
			
			int mid=low+(high-low)/2;
			
			if (arr[mid]==target){
				return mid;
			}else if (target < arr[mid]){
				high=mid-1;
			}else{
				low=mid+1;
			}
			
		}
		
		return -1;
		
	}
	

}
