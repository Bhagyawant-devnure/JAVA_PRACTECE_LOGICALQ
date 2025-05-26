package arrayStreamapi;

import java.util.Arrays;
import java.util.*;

public class DuplicateElements {

	public static void main(String[] args) {
		
		List<Integer> mylist = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		Set<Integer> set =new HashSet();
	mylist.stream().filter(n-> !set.add(n)).forEach(System.out::println);
	
	}

}
