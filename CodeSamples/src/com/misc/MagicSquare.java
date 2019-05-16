package com.misc;
import java.util.Scanner;

public class MagicSquare {
	
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int col= scan.nextInt();
		int output=0;
		int[][] matrix =new int[row][col];
		for (int i=0; i<row;i++){
			for(int j=0;j<col ;j++){
				matrix[i][j]=scan.nextInt();
				//System.out.print( matrix[i][j]+" ");
			}
			
		}
		
		output= magicSquare(matrix);
		System.out.println("Final Value"+output);
		
	}
       // Sum of rows ,colums, diagonal is equal
	private static int magicSquare(int[][] matrix) {
		
		System.out.println("matrix.length=="+matrix.length);
		
		int row_sqr= (int)Math.sqrt(matrix.length);
		int col_sqr= (int)Math.sqrt(matrix[0].length);
		
		
		if (row_sqr != col_sqr){
			return 0;
		}
		
		
		
		for (int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print( matrix[i][j]+" ");
			}
		}
		
		return 0;
	}

}
