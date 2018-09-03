package com.codeforces;

import java.util.Scanner;

//http://codeforces.com/problemset/problem/479/C
public class Exams {

	
	public static void main(String[] args) {
		try(Scanner scan= new Scanner(System.in)){
			int n= scan.nextInt();
			int[] arr= new int[n];
			int score=0;
			for(int i=0;i<n;i++){
				arr[i]=scan.nextInt();
				score++;
			}
			
			System.out.println(score);
		}
	}
}
