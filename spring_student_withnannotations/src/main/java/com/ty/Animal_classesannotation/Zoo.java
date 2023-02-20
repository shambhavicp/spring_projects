package com.ty.Animal_classesannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Zoo {
	
	@Autowired
	private Animal animal;
	
	public void food() {
	animal.eat();
	}

}
