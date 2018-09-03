package com.codeforces;

import java.util.Arrays;
import java.util.Scanner;

/*
http://codeforces.com/problemset/problem/461/A
*/
public class ApplemanToastMan {

	public static void main(String[] args) {
		try(Scanner scan= new Scanner(System.in)){
			int n= scan.nextInt();
			int[] arr= new int[n];
			int score=0;
			for(int i=0;i<n;i++){
				arr[i]=scan.nextInt();
				score++;
			}
			
			score=largetPossibleScore(arr,n,score);
			
			System.out.println(score);
		}
	}

	private static int largetPossibleScore(int[] arr, int n,int score) {

		
		return score;
		
	}
	
}
