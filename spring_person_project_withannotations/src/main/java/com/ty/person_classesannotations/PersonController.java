package com.ty.person_classesannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonController {

	public static void main(String[] args) {
	
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Person person=context.getBean("person", Person.class);
		//Person person1=context.getBean("person", Person.class);
		person.eat();
//		System.out.println(person);
//		System.out.println(person1);

	}

}
