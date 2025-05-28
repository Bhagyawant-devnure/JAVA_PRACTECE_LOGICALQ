package com.Stream.question;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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
		
		// 4 Map employee names:
		// Create a list of employee names (string)
		
		System.out.println(RED+"*************Create a list of employee names (Strings)*************"+RESET);
		list.stream().map(employee -> employee.getName()).forEach(System.out::println);
		
		// 5 calculate average salary:
		// - calculate avelerage salary of all employees.
		
		System.out.println(RED+"*********Calculate the average salary of all employees.*******"+RESET);
		double orElseThrow = list.stream().mapToDouble(Employee::getSalary).average().orElseThrow();
		System.out.println("average :"+orElseThrow);
		
		//6 find the maximum salary:
		//find the employee with the highest salary.
		System.out.println(RED+"*********Find the employee with the highest salary.********"+RESET);
		double max=list.stream().mapToDouble(Employee::getSalary).max().orElseThrow();
		System.out.println("max salary : "+max);
		
		// Group employee by gender::
		//group employee by gender and return 
		//a map with gender as the key and a list of employees as the value.
		System.out.println(RED+"******Group employees by gender and return a map******"+RESET);
		list.stream().collect(Collectors.groupingBy(Employee::getGender)).forEach((key,value)->System.out.println(key+""+value));
		
		//8. Count male employee
		//count the numbers of male employee
		System.out.println(RED+"**********Count the number of male employees.*********"+RESET);
		long count= list.stream().filter(employee -> employee.getGender().equals("Male")).count();
		System.out.println("count :"+count);
		
		//9 . sum of all salaries
		System.out.println(RED+"*********Calculate the total sum of salaries for all employees.**********"+RESET);
		
		double sum = list.stream().mapToDouble(employee->employee.getSalary()).sum();
		System.out.println("sum "+sum);
		
		//10 sort employee name by alphabetical order:
		System.out.println(RED+"*******Sort the employees by their names in alphabetical order.*****"+RESET);
     list.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
	
	//11 sort employees by age ascending order.

		System.out.println(RED+"**********Sort the employees by age in ascending order.********"+RESET);
		list.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
		
		//12 sor the employees by salary descending order.
		
		System.out.println(RED+"*********Sort the employees by salary in descending order.******"+RESET);
		list.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).forEach(System.out::println);
	
	}
	

}
