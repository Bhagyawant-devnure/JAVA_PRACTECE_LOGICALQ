package com.nit.ArrayStringQuestion;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string to reverse");
		String input =sc.nextLine();
		
		StringBuilder sb =new StringBuilder();
		sb.append(input);
		System.out.println(sb.reverse());
	}

}
