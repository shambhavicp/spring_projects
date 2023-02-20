package com.ty.Animal_classesannotation;

import org.springframework.stereotype.Component;

@Component
public class Lion implements Animal {

	public void eat() {
		System.out.println("Lion eats meat");
	}

}
