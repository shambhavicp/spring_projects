package com.ty.spring_project_employee.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.spring_project_employee.properties.Employee;

public class EmployeeController {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("employee.xml");
		
		Employee employee=context.getBean("emp", Employee.class);
		employee.print();
		
	}

}
