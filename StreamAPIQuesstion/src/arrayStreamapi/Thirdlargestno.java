//Find out thirdlargest Number in array

package arrayStreamapi;

import java.util.Arrays;

public class Thirdlargestno {
	static int thirdlargestno(int []arr) {
		
		int n=arr.length;
		
		Arrays.sort(arr);
		return arr[n-3];
		
	}

	public static void main(String[] args) {
		int arr[]= {1,14,2,16,10,20};
		System.out.println(thirdlargestno(arr));
		
	}

}
