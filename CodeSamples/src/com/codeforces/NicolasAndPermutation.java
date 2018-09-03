package com.codeforces;

import java.util.Scanner;

public class NicolasAndPermutation {

	public static void main(String[] args) {

		try(Scanner scan= new Scanner(System.in)){
			int n= scan.nextInt();
			int[] arr= new int[n];
			for(int i=0;i<n;i++){
				arr[i]=scan.nextInt();
			}
			
			System.out.println(maxPossibleDistance(arr,n));
		}
	}

	private static String maxPossibleDistance(int[] arr, int n) {
   int max=0;
   int maxPos=0;
   int min=0;
		for(int i=0;i<n;i++){
			if (arr[i]>max){
				max=arr[i];
				maxPos=i;
			}
		}
		return null;
	}

}
