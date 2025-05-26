package arrayStreamapi;

import java.util.Arrays;

public class findsecondlargestnumber {
	

	public static void main(String[] args) {
		int [] arr = {40,10,50,20,30,};
		int temp=0;
		Arrays.sort(arr);
		System.out.println("second largest number :" + arr[arr.length-2]);
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]< arr[j]) {
					temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
		}
		System.out.println("second largest element :" + arr[1]);
		System.out.println("--------Using Stream-API---------");
		int [] arr2 = {40,10,50,20,30};
		Arrays.stream(arr2).sorted().skip(arr2.length-2).findFirst().ifPresent(System.out::println);
	}

}
