package com.deva.Array;

class FindMin {

	public static void getMinimumValue(int [] arr) {
		int min= arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("the minimum ele of the arry is "+min);

	}

}
public class MinimumElement{
	public static void main(String[]args) {
		int a[]= {9,7,1,5,2};
		FindMin.getMinimumValue(a);
	}
}
