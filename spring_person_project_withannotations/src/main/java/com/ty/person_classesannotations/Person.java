package com.ty.person_classesannotations;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//to create object of this class 
@Component
@Scope(value="prototype")
public class Person {
	
	//to call the method implicitly after the creation of object
	@PostConstruct
	public void walk() {
		System.out.println("person can walk");
	}
	public void eat() {
		System.out.println("Person can Eat and get Fat");
	}

}
