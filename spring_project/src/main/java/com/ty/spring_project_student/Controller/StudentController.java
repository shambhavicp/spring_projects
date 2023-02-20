package com.ty.spring_project_student.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.spring_project_student.dto.Student;

public class StudentController {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("student.xml");
		
		Student student=context.getBean("std", Student.class);
		System.out.println("Student name is : "+student.getName());
		System.out.println("Student phone   : "+student.getPhone());
		System.out.println("Student Course is : "+student.getCourse());

	}

}
