package com.codeforces;

import java.util.Arrays;
import java.util.Scanner;
/*
http://codeforces.com/problemset/problem/405/A
*/
public class GravityFlip {

	public static void main(String[] args) {
		try(Scanner scan= new Scanner(System.in)){
			int n= scan.nextInt();
			int[] arr= new int[n];
			for(int i=0;i<n;i++){
				arr[i]=scan.nextInt();
			}
			
			gravityFlip(arr,n);
		}
	}

	private static void gravityFlip(int[] arr, int n) {

		Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		for (int i=0;i<n;i++){
			System.out.println(arr[i] + " ");
		}
	}

}
