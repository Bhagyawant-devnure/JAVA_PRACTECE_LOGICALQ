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
		
		//13. Find Oldest Employee:
		System.out.println(RED+"*********Find the oldest employee.*********"+RESET);
		int orElseThrow2 = list.stream().mapToInt(Employee::getAge).max().orElseThrow();
		Employee employee = list.stream().max((e1,e2)->(e1.getAge()-e2.getAge())).get();
	System.out.println(employee);
	System.out.println("Max Age : "+orElseThrow2);
	
	//14. Group Employees by Age:
//    - Group employees into age groups (e.g., 20-30, 31-40, etc.)
	
	//  and return a map with age group as the key and a list of employees as the value.
	System.out.println(RED+"****Group employees into age groups (e.g., 20-30, 31-40, etc.)*****"+RESET);
list.stream().collect(Collectors.groupingBy((t)-> 
{int age= t.getAge();
if(age>=20&& age<=30)
	return "20-30";
else if(age >=31 && age<=40)
	return "31-40";
else 
	return "40+";

})).forEach((key,value)->System.out.println(key+"-"+value));


//15. Find Employees with a Specific Age:
//    - Find all employees who are exactly 35 years old.
System.out.println(RED+"************ Find all employees who are exactly 35 years old.***********"+RESET);
	

list.stream().filter(k->k.getAge()==35).forEach(System.out::println);

//16. Calculate the Sum of Salaries by Gender:
//- Calculate the sum of salaries for each gender (i.e., male and female)
//and return a map with gender as the key and the sum of salaries as the value.
System.out.println(RED+"********* Calculate the sum of salaries for each gender**********"+RESET);

list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.summingDouble(Employee::getSalary)))
.forEach((key,value)->System.out.println(key+""+value));

//17. Find Employees with Names Starting with "J":
//- Find all employees whose names start with the letter "E."
System.out.println(RED+"*********Find all employees whose names start with the letter J******"+RESET);

list.stream().filter(k->k.getName().startsWith("E")).forEach(System.out::println);


//18. Calculate the Average Salary for Male and Female Employees:
//    - Calculate the average salary separately for male
//    and female employees and return a map with gender
//    		as the key and the average salary as the value.
System.out.println(RED+"**********Calculate the average salary separately for male and female*********"+RESET);
list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary))).forEach((key,value)-> System.out.println(key+""+value));

//19. Find the Top N Highest Paid Employees:
//- Find the top N employees with the highest salaries.

System.out.println(RED+"*******Find the top N employees with the highest salaries.********"+RESET);
list.stream().sorted((o1,o2) -> (int)(o1.getSalary())).limit(5).forEach(System.out::println);
list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3).forEach(System.out::println);


//20. Retrieve Distinct Age Values:
//- Get a list of distinct ages of all employees.
System.out.println(RED+"*********Get a list of distinct ages of all employees.*********"+RESET);
list.stream().filter(k-> !set.add(k.getAge())).forEach(System.out::println);

//21. Find the Three Lowest-Paid Employees:
//- Find and display the names of the three employees with the lowest salaries.
System.out.println(RED+"*******Find and display the names of the three employees with the lowest salaries.********"+RESET);

list.stream().sorted((o1,o2)->(int)(o1.getSalary()-o2.getSalary())).map(k->k.getName()).limit(3).forEach(System.out::println);

////		22. Sort Employees by Name Length:
//- Sort employees by the length of their names (shortest to longest).
System.out.println(RED+"***********Sort employees by the length of their names (shortest to longest).*******"+RESET);

list.stream().sorted((o1,o2)-> (o1.getName().length()- o2.getName().length())).forEach(System.out::println);

//23. Group Employees by Age Range:
//- Group employees into custom
//age ranges (e.g., 20-29, 30-39, etc.) and
//return a map with the age range as the key and a list of employees as the value.
System.out.println(RED+"*********Group employees into custom age ranges (e.g., 20-29, 30-39, etc.)*********"+RESET);

list.stream().collect(Collectors.groupingBy((t)->{
	int age=(t).getAge();
	if(age >=20 && age<29)
		return "20-29";
	else if(age>=30 && age<= 39)
		return "30-39";
	else
		return"40";
})).forEach((key,value)->System.out.println(key+""+value));

//24. Find the Average Salary of Employees Aged 30 or Younger:
//- Calculate the average salary of employees aged 30 or younger.

System.out.println(RED+"********Calculate the average salary of employees aged 30 or younger.******"+RESET);

double orElseThrow3= list.stream().filter(emp->emp.getAge()<=30).mapToDouble(k->k.getSalary()).average().orElseThrow();

System.out.println(orElseThrow3);


	}
	

}
