package com.nit.ArrayStringQuestion;

import java.util.Scanner;

public class duplicateCharacter {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter string");
		String str = sc.nextLine();
		int count =0;
		char []arr =str.toCharArray();
		System.out.println("duplicate character are");
		for(int i=0;i<str.length();i++) {
			for(int j=i ;j<str.length();j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
					count++;
					break;
				}
			}
		}
		System.out.println(count);

	}

}
