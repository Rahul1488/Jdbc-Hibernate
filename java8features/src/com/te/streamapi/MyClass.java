package com.te.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyClass {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee(108, "Harshad", 25000, "Developer", 25),
				new Employee(106, "Vivek", 28000, "Developer", 23),
				new Employee(107, "Siddu", 29000, "Senior Developer", 35),
				new Employee(105, "Hemanth", 35000, "Manager", 28), new Employee(104, "Yashodha", 20000, "Testing", 35),
				new Employee(101, "Bhushan", 50000, "MD", 75));
//		Employee e = list.get(0);
//		for (int i = 0; i < list.size(); i++) {
//			if (e.getAge() > list.get(i).getAge()) {// im sorting here using for loop it is long name
//				e = list.get(i);
//			}
//		}
//		System.out.println(e);
//		System.out.println("============");
//		Stream<Employee> stream = list.stream();
//		Optional<Employee> min = stream.min(Comparator.comparing(Employee::getAge));// here im sorting using two to
//																					// three lines
//		System.out.println(min);
//		System.out.println("============");
//		list.stream().min(Comparator.comparing(Employee::getAge)).ifPresent(System.out::println);// here im using single
//																									// line to compare
//																									// values
//		System.out.println("============");
//		// sorting using one line
//		List<Employee> collect = list.stream().sorted(Comparator.comparing(Employee::getEmployeeName))
//				.collect(Collectors.toList());
//		collect.forEach(System.out::println);
//		// sorting using salary
//		System.out.println("=========");
//		List<Employee> collect2 = list.stream().sorted(Comparator.comparing(Employee::getEmployeeSalary))
//				.collect(Collectors.toList());
//		collect2.forEach(System.out::println);
//		System.out.println("=========");
		// sorting using group by
		Map<String, List<Employee>> collect3 = list.stream()
				.collect(Collectors.groupingBy(Employee::getEmployeeDesignation));
		collect3.forEach((department, emp) -> {
			System.out.println(department);
			emp.forEach(System.out::println);
		});
		System.out.println("===========filter");
		list.stream().filter(ra -> ra.getEmployeeSalary() > 25000).collect(Collectors.toList())
				.forEach(System.out::println);
		;// here i have used to filter the employee object
		System.out.println("===========");
		boolean anyMatcg = list.stream().anyMatch(ra -> ra.getAge() > 10);
		System.out.println(anyMatcg);//here i an using to find the boolean value using anyMatch
		

		}

}
