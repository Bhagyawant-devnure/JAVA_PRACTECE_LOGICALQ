package arrayStreamapi;

import java.util.ArrayList;
import java.util.List;

public class getSize {

	public static void main(String[] args) {
		List<Integer> arraylist = new ArrayList<Integer>();
		
		arraylist.add(1);
		arraylist.add(2);
		arraylist.add(3);
		arraylist.add(4);
		
		int size =arraylist.size();
		
		System.out.println("size of list = "+ size);
		
		System.out.println("arraylist= "+arraylist);
		
		List<String> list = new ArrayList<String>();
		
		list.add("geeks");
		list.add("for");
		list.add("geeks");
		
		int size1 = list.size();
		
		System.out.println("size of list = "+size1);
		
		System.out.println("arraylist = "+list);
		

	}

}
