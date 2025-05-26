package arrayStreamapi;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindMinimumElement {

	public static void main(String[] args) {
		int a[]= {9,7,1,5,2,-9};
		OptionalInt min= Arrays.stream(a).min();
		min.ifPresent(System.out::println);
	}

}
