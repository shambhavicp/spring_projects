package com.ty.spring_project_student.Controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.spring_project_student.dto.School;
import com.ty.spring_project_student.dto.Student;


public class SchoolController {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("school.xml"); 
		School school1=context.getBean("school", School.class);
		System.out.println("the school name is : "+ school1.getName());
		System.out.println("the school fees is : "+ school1.getFees());
		System.out.println("the school address is : "+ school1.getAddress());
		
		Student student=school1.getStudent();
		System.out.println(student.getCourse());
		
		
	}
	
}
