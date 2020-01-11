package com.deloitte.ew1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee E1 = new Employee(1351, "Satish", 28000.50);
		Employee E2 = new Employee(202, "Souvan", 22523.00);
		Employee E3 = new Employee(204, "Rakesh", 25000.0);
		
		List<Employee> empList =Arrays.asList(E1, E2, E3);
		empList.forEach(System.out::println);
		
		System.out.println("  ");
		Collections.sort(empList);
		empList.forEach(System.out::println);
		
		
		
	}

}
