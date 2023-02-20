package com.ty.spring_project.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.spring_project.dto.Cow;
import com.ty.spring_project.dto.Lion;

public class AnimalController {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Cow c1=context.getBean("cow",Cow.class);
		c1.sound();
		
		Lion l1=context.getBean("lion", Lion.class);
		l1.sound();
	}
	

}
