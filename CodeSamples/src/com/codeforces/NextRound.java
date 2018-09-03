package com.codeforces;

import java.util.Arrays;
import java.util.Scanner;

//http://codeforces.com/problemset/problem/158/A
public class NextRound {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int n = scan.nextInt();
			int[] arr = new int[n];
			
			int k = scan.nextInt();
			for (int i = 0; i < n; i++) {
				arr[i] = scan.nextInt();
			}
           int output=0;
           boolean nextround=false;
           
           if (arr[k-1]==0){
        	  for (int j=k-1;j>0;j--){
        		  if (arr[j] >0){
        			  nextround=true;
        			  output++;
        		  }
        	  }
        	  if (nextround)
        		  output++;
           }else {
           
           
			for (int j=k-1;j<n;j++){
			  if (arr[j] >0 && arr[j]>=arr[k-1]){
				  output++;
				  nextround=true;
			  }
			}
			if (nextround){
				output=output+(k-1);
			}
			
           }
			System.out.println(output);
		}
	}
}
