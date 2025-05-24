package com.deva.Array;

import java.util.Arrays;

public class ArrayDemo01 {

	public static void main(String[] args) {
		int arr []= new int [5];
		arr[0]=12;
		arr[1]=13;
		arr[2]=14;
		arr[3]=15;
	System.out.println("printing the element using ordinary loop");
	for(int i=0; i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	
	int arr1[]= {100,200,300};
	System.out.println("printing the element using toString()");
	System.out.println(Arrays.toString(arr1));
	
	int arr2[]= new int[] {10,20,30,40};
	System.out.println("printing the element using for each loop");
	for (int x: arr2) {
		System.out.println(x);
	}
	
	}

}
