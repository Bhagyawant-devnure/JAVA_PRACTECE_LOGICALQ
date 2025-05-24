package com.deva.Array;

public class Tes {

	public static void main(String[] args) {
		int count=0;
		int arr[][]= {{1,2,3},{2,3}};
		int sum=0;
		
	   for(int i=0;i<arr.length;i++) {
		   sum+=arr[i][i];
	   }
	   System.out.println(sum);
		

	}
	

}
