package com.sorting;

public class InversionOfCount {

	public static void main(String[] args) {

		int[] arr={4,6,8,1,0,3};
		int n=arr.length;
		int count=0;
		for(int i=0;i<n;i++){
			for(int j=i;j<n-i;j++){
				if(arr[i]>arr[j]){
					System.out.println("Inv count ( arr["+i +"] , arr["+j+"] )"+ arr[i] +","+ arr[j]);
					count++;
				}
			}
		}
		System.out.println("Count "+ count);
		
	}

}
