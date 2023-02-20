package com.ty.spring_person_project_controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.spring_person_project.dto.Person;

public class PersonController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("person.xml");
		Person person=context.getBean("person", Person.class);
		person.walk();

	}

}
