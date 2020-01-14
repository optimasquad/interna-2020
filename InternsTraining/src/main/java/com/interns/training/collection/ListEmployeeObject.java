package com.interns.training.collection;

import java.util.ArrayList;
import java.util.List;

import com.interns.training.Employee;

/**
 * @author hp
 * 
 *         Complexity needed to be increased to x+1
 *
 */
public class ListEmployeeObject {

	public static void main(String args[]) {
		Employee employee = new Employee();
		employee.setFirstName("Dan");
		employee.setLastName("Kallis");
		employee.setEmailId("dan@yahoo.com");

		Employee newEmployee = new Employee();
		newEmployee.setFirstName("John");
		newEmployee.setLastName("Weil");
		newEmployee.setEmailId("weil@yahoo.com");

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(newEmployee);
		employeeList.add(employee);

		// print the Employee Object
		System.out.println(employeeList);

	}

}
