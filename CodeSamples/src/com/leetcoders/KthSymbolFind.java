package com.leetcoders;

import java.util.Scanner;

public class KthSymbolFind {

	public static void main(String[] args) {

		
		try(Scanner scan = new Scanner(System.in)){
		
			int n=scan.nextInt();
			int k= scan.nextInt();
		    StringBuilder str=new StringBuilder("01");
			
			 System.out.println(findKthSymbol(n,k,str));
		}	
		
	}

	private static String findKthSymbol(int n, int k,StringBuilder str) {
		
		if (k<=str.length() && n > 0){
			return str.substring(k, k+1);
		}
		 int val=Integer.valueOf(str.toString());
		 int onescompeent=~val;
		System.out.println("----"+val);

		System.out.println("----"+onescompeent);
		 str= str.append(onescompeent);
		 System.out.println(str);
		 
		 
		return  findKthSymbol(n-1,k,str);
	}

}
