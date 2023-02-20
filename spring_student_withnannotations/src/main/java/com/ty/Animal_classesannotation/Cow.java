package com.ty.Animal_classesannotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cow implements Animal {

	public void eat() {
		System.out.println("Cow Eat Gross");
	}

}
