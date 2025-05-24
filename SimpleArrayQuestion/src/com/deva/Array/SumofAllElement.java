package com.deva.Array;

import java.util.Scanner;

public class SumofAllElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		
		int size =sc.nextInt();
		int arr[] =new int[size];
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the element of array at "+i+"th index :");
			arr[i] =sc.nextInt();
		}
		for(int  i=0;i<arr.length;i++) {
			sum =sum+arr[i];
		}
		
System.out.println("the sum of array element is :"+sum);
	}

}
