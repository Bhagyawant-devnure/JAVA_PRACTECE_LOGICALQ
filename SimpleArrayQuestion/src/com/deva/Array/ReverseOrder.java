package com.deva.Array;

import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array: ");
		int size=sc.nextInt();
		int []arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the element of array at"+i+"th index :");
			arr[i]=sc.nextInt();
		}
for(int i=arr.length-1;i>=0;i--) {
	System.out.println(arr[i]);
}
	}

}
