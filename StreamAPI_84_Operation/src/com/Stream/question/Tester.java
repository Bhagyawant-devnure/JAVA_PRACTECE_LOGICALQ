package com.Stream.question;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tester {
	
	private static final String RED = "\033[1;31m"; // RED
	private static final String RESET = "\033[0m"; // Text Reset
	
	public static void main(String[] args) {
		
		List<Employee> list = EmployeeAdder.addDetails();
		Set<Integer> set= new HashSet<>();
		Set<String> set2= new HashSet<>();
		
		//1. filter employees by gender:
		// -Retrieve a list of all female employes.
		
		list.stream().filter(t ->t.getGender().equals("Female")).forEach(System.out::println);
		
		
		System.out.println(RED+"*****Get a list of employees older than 30 years.********"+RESET);
//		2. Filter Employees by Age:-get a list of employees older than 30
		list.stream().filter(employee -> employee.getAge()>30).forEach(System.out::println);
		
		
		System.out.println(RED+"*****Find employees with a salary greater than $50,000.********"+RESET);
//		3. Filter Employees by Salary:
//			   - Find employees with a salary greater than $50,000.
		
		list.stream().filter(employee -> employee.getSalary()>50000).forEach(System.out::println);
		
	}

}
