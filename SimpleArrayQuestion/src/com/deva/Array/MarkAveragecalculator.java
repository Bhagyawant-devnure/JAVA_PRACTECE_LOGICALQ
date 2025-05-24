package com.deva.Array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MarkAveragecalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks []=null;
		try(sc){
			System.out.println("enter the number of subject : ");
			int subject = sc.nextInt();
			marks=new int [subject];
			
			for(int i=0;i<marks.length;i++) {
				System.out.println("enter"+(i+1)+"subject mark");
				marks[i]=sc.nextInt();
			}
			
			int total=0;
			for(int mark : marks) {
				total=total+mark;
				
			}
			System.out.println("the total mark is "+total);
			System.out.println("Average is "+(total/subject));
		}
		catch(NegativeArraySizeException e) {
			System.err.println("array size must be positive integer");
			
		}
		catch(InputMismatchException e) {
			System.err.println("invalid input");
		}
		

	}

}
