package com.deva.Array;

import java.util.Arrays;
import java.util.Scanner;

public class secondLargestno {

	public static void main(String[] args) {
		
		int arr[]= {1,2,6,7};
		int tem=0;
	  for(int i=0;i<arr.length;i++) {
		  
		  for(int j=i;j<arr.length;j++) {
			  
			  if(arr[i]<arr[j]) {
				  tem= arr[i];
				  arr[i]=arr[j];
				  arr[j]=tem;
			  }
		  }
	  }
	  System.out.println(arr[1]);
	  
	  }
		
	}


