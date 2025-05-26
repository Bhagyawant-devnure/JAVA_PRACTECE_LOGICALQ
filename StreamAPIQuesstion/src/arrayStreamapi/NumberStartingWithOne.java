//2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?

package arrayStreamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartingWithOne {

	public static void main(String[] args) {
		List <Integer> mylist =Arrays.asList(10,15,8,49,25,11,32);
		mylist.stream()
		.map(s -> s +"")//convert integer to string
		.filter(s-> s.startsWith("1"))
		.forEach(System.out::println);
		
		/* When numbers are given as Array */int[] arr = {10,15,8,49,25,98,32}; 
		List<String> list =Arrays.stream(arr).boxed()
				.map(s -> s +"").filter(s-> s.startsWith("1"))
				.collect(Collectors.toList());
		
	}

}
